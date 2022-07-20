package com.bss.inc.cameraon.licensing.impl.workers;

import com.bss.inc.cameraon.licensing.interfaces.IChecksumWorker;
import com.bss.inc.cameraon.licensing.utils.ProductKeyUtils;

public class ChecksumWorker implements IChecksumWorker {@Override public String buildProductKeyChecksum(String productKey) {if ((productKey != null) && (productKey.trim().length() > 0)) {productKey = productKey.trim();int left = 0x0056;int right = 0x00AF;for (int n = 0; n < productKey.length(); n++ ) {right = right + (byte) productKey.charAt(n);if (right > 0x00FF) {right -= 0x00FF;}left += right;if (left > 0x00FF) {left -= 0x00FF;}}return ProductKeyUtils.buildHexStr(4, (left << 8) + right);}return null;}@Override public boolean verifyProductKeyChecksum(String productKey) {if ((productKey != null) && (productKey.trim().length() > 0)) {productKey = productKey.trim();if (productKey.length() > 4) {final String checkSum = productKey.substring(productKey.length() - 4);productKey = productKey.substring(0, productKey.length() - 4);return checkSum.equals(buildProductKeyChecksum(productKey));}}return false;}}
