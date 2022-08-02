abstract class ProductKeyGenerator<ED extends ProductKeyEncodingData>
{

	private final int seedCharLength;
	private final ED[] productKeyEncodingData;
	private ProductKeySectionWorker<ED> productKeySectionWorker = null;
	private ChecksumWorker checksumWorker = null;
	private BlacklistWorker blacklistWorker = null;
	private ProductKeyStylingWorker productKeyStylingWorker = null;
	private SeedAvailabilityWorker seedAvailabilityWorker = null;
	@SafeVarargs
	public ProductKeyGenerator(final int seedCharLength, final ED...productKeyEncodingData)
	{
		this.seedCharLength = ((seedCharLength > 0) && (seedCharLength <= 15)) ? seedCharLength : 10;
		
		if ((productKeyEncodingData != null) && (productKeyEncodingData.length > 0))
		{
			this.productKeyEncodingData = productKeyEncodingData;
		}
		else
		{
			this.productKeyEncodingData = null;
		}
	}
	public int getSeedCharLength()
	{
		return this.seedCharLength;
	}
	public ProductKeyState verifyProductKey(final String productKey)
	{
		if ((productKey != null) && (productKey.trim().length() > 0))
		{
			// Remove styling.
			final String cleanedProductKey;
			
			if (this.getProductKeyStylingWorker() != null)
			{
				cleanedProductKey = this.getProductKeyStylingWorker().removeStyling(productKey).toUpperCase();
			}
			else
			{
				cleanedProductKey = productKey.toUpperCase();
			}
			
			// Verify that the format of the product-key is valid.
			if ((this.getChecksumWorker() != null) && ( !this.getChecksumWorker().verifyProductKeyChecksum(cleanedProductKey)))
			{
				return ProductKeyState.KEY_INVALID;
			}
			
			// Test against blacklist.
			if ((this.getBlacklistWorker() != null) && this.getBlacklistWorker().isKeyBlackListed(cleanedProductKey))
			{
				return ProductKeyState.KEY_BLACKLISTED;
			}
			
			// If the product-key section bytes are present and valid in length, then verify the
			// product-key sections.
			if ((this.productKeyEncodingData != null) && (this.productKeyEncodingData.length > 0))
			{
				if (this.getProductKeySectionWorker() != null)
				{
					try
					{
						// Extract the seed from the product-key.
						long seed = Long.parseLong(cleanedProductKey.substring(0, this.getSeedCharLength()), 16);
						
						int currentKeyCharIndex = this.getSeedCharLength();
						String tmpKeySection;
						
						for (int n = 0; n < this.productKeyEncodingData.length; n++ )
						{
							// If the first byte of the current section is zero (0), then skip
							// validating
							// this section.
							if (this.productKeyEncodingData[n] != null)
							{
								tmpKeySection = cleanedProductKey.substring(currentKeyCharIndex, currentKeyCharIndex + 2);
								
								if ( !tmpKeySection.equals(ProductKeyUtils.buildHexString(2, this.getProductKeySectionWorker().buildProductKeySection(seed, this.productKeyEncodingData[n]))))
								{
									return ProductKeyState.KEY_PHONY;
								}
							}
							
							currentKeyCharIndex += 2;
						}
						
						// If we get this far, then it means the key is either good, or was made
						// with a keygen derived from "this" release.
						return ProductKeyState.KEY_GOOD;
					}
					catch (NumberFormatException nfe)
					{
						// TODO: log this ...
						
					}
				}
			}
		}
		
		return ProductKeyState.KEY_PHONY;
	}

	public String generateProductKey(long seed) throws ProductKeyGenerationException
	{
		// Build the HEXADECIMAL string representing the seed.
		String seedHex = ProductKeyUtils.buildHexString(this.getSeedCharLength(), seed);
		
		try
		{
			// Try to parse the HEXADECIMAL string representing the seed and use that for the seed.
			seed = Long.parseLong(seedHex, 16);
			
			if ((this.productKeyEncodingData != null) && (this.productKeyEncodingData.length > 0))
			{
				if (this.getProductKeySectionWorker() != null)
				{
					final StringBuilder keySb = new StringBuilder();
					
					seedHex = ProductKeyUtils.buildHexString(this.getSeedCharLength(), seed);
					
					if ((this.getBlacklistWorker() != null) && (this.getBlacklistWorker().isSeedBlackListed(seedHex)))
					{
						throw new SeedIsBlacklistedException();
					}
					
					if ((this.getSeedAvailabilityWorker() != null) && ( !this.getSeedAvailabilityWorker().isSeedAvailable(seedHex)))
					{
						throw new SeedAlreadyTakenException();
					}
					
					// The key string begins with a HEXADECIMAL string of the seed.
					keySb.append(seedHex);
					
					// Build the byte for the key-section derived from the seed.
					for (int n = 0; n < this.productKeyEncodingData.length; n++ )
					{
						if (this.productKeyEncodingData[n] == null)
						{
							throw new EncodingDataNotCompleteException();
						}
						
						keySb.append(ProductKeyUtils.buildHexString(2, this.getProductKeySectionWorker().buildProductKeySection(seed, this.productKeyEncodingData[n])));
					}
					
					// Add checksum to key string.
					if (this.getChecksumWorker() != null)
					{
						keySb.append(this.getChecksumWorker().buildProductKeyChecksum(keySb.toString()));
					}
					
					// Add dashes to the product-key and return it.
					if (this.getProductKeyStylingWorker() != null)
					{
						return this.getProductKeyStylingWorker().addStyling(keySb.toString());
					}
					
					return keySb.toString();
				}
				else
				{
					throw new ProductKeyEncoderNotDefinedException();
				}
			}
			else
			{
				throw new EncodingDataNotCompleteException();
			}
		}
		catch (NumberFormatException nfe)
		{
			throw new InvalidSeedException();
		}
	}
	protected abstract ProductKeySectionWorker<ED> buildProductKeySectionWorker();
	protected abstract ChecksumWorker buildChecksumWorker();
	protected abstract BlacklistWorker buildBlacklistWorker();
	protected abstract ProductKeyStylingWorker buildProductKeyStylingWorker();
	protected abstract SeedAvailabilityWorker buildSeedAvailabilityWorker();
	private ProductKeySectionWorker<ED> getProductKeySectionWorker()
	{
		if (this.productKeySectionWorker == null)
		{
			this.productKeySectionWorker = this.buildProductKeySectionWorker();
		}
		
		return this.productKeySectionWorker;
	}
	private ChecksumWorker getChecksumWorker()
	{
		if (this.checksumWorker == null)
		{
			this.checksumWorker = this.buildChecksumWorker();
		}
		
		return this.checksumWorker;
    }
	private BlacklistWorker getBlacklistWorker()
	{
		if (this.blacklistWorker == null)
		{
			this.blacklistWorker = this.buildBlacklistWorker();
		}
		
		return this.blacklistWorker;
	}
	private ProductKeyStylingWorker getProductKeyStylingWorker()
	{
		if (this.productKeyStylingWorker == null)
		{
			this.productKeyStylingWorker = this.buildProductKeyStylingWorker();
		}
		
		return this.productKeyStylingWorker;
	}
	private SeedAvailabilityWorker getSeedAvailabilityWorker()
	{
		if (this.seedAvailabilityWorker == null)
		{
			this.seedAvailabilityWorker = this.buildSeedAvailabilityWorker();
		}
		
		return this.seedAvailabilityWorker;
	}
}

interface BlacklistWorker
{
	boolean isKeyBlackListed(String productKey);
	boolean isSeedBlackListed(String seedHex);
}

interface ChecksumWorker
{
	String buildProductKeyChecksum(String productKey);
	boolean verifyProductKeyChecksum(String productKey);
}
interface ProductKeySectionWorker<ED extends ProductKeyEncodingData>
{
	byte buildProductKeySection(final long seed, ED productKeyEncodingDate);
}
interface ProductKeyStylingWorker
{
	String addStyling(String productKey);
	String removeStyling(String productKey);
}
interface SeedAvailabilityWorker
{
	boolean isSeedAvailable(String seedHex);
}
class ProductKeyEncodingData
{
	private final byte a;
	private final byte b;
	private final byte c;
	public ProductKeyEncodingData(final byte a, final byte b, final byte c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public byte getA()
	{
		return this.a;
	}
	public byte getB()
	{
		return this.b;
	}
	public byte getC()
	{
		return this.c;
	}

}
class ProductKeyUtils
{


	/**
	 * This method will build a HEXADECIMAL {@link String} that will be of the specified length
	 * using the specified content.
	 *
	 * @param expectedLength
	 * The expected length of the string... if the HEXADECIMAL {@link String} is longer than this,
	 * the leading characters will be removed.
	 * @param content
	 * The content to be used when building the HEXADECIMAL {@link String}.
	 * @return
	 * The HEXADECIMAL {@link String}.
	 */
	public static String buildHexString(final int expectedLength, final long content)
	{
		String hexStr = String.format("%0" + expectedLength + "X", content);

		if (hexStr.length() > expectedLength)
		{
			hexStr = hexStr.substring(hexStr.length() - expectedLength);
		}

		while (hexStr.length() < expectedLength)
		{
			hexStr = "0" + hexStr;
		}

		return hexStr;
	}

}
enum ProductKeyState
{
	KEY_GOOD,
	KEY_INVALID,
	KEY_BLACKLISTED,
	KEY_PHONY
}
class ProductKeyGenerationException extends Exception
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link ProductKeyGenerationException}.
	 */
	public ProductKeyGenerationException()
	{
		super("Failed to generate a product-key.");
	}

	/**
	 * This will create a new instance of a {@link ProductKeyGenerationException}.
	 *
	 * @param detailedMessage
	 * The details for this {@link ProductKeyGenerationException}.
	 */
	public ProductKeyGenerationException(final String detailedMessage)
	{
		super("Failed to generate a product-key: " + detailedMessage);
	}

}
class SeedIsBlacklistedException extends ProductKeyGenerationException
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link SeedIsBlacklistedException}.
	 */
	public SeedIsBlacklistedException()
	{
		super("Seed provided is black-listed.");
	}

}
class SeedAlreadyTakenException extends ProductKeyGenerationException
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link SeedAlreadyTakenException}.
	 */
	public SeedAlreadyTakenException()
	{
		super("Seed is already taken.");
	}

}
class EncodingDataNotCompleteException extends ProductKeyGenerationException
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link EncodingDataNotCompleteException}.
	 */
	public EncodingDataNotCompleteException()
	{
		super("Encoding-data must be complete for generating product-keys.");
	}

}
class ProductKeyEncoderNotDefinedException extends ProductKeyGenerationException
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link ProductKeyEncoderNotDefinedException}.
	 */
	public ProductKeyEncoderNotDefinedException()
	{
		super("Product-key encoder is not defined.");
	}

}
class InvalidSeedException extends ProductKeyGenerationException
{


	/* PRIVATE CONSTANTS */
	private static final long serialVersionUID = 1L;

	/* CONSTRUCTORS */
	/**
	 * This will create a new instance of a {@link InvalidSeedException}.
	 */
	public InvalidSeedException()
	{
		super("Seed is invalid.");
	}

}
