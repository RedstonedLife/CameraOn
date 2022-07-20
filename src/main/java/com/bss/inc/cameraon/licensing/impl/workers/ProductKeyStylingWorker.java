package com.bss.inc.cameraon.licensing.impl.workers;

import com.bss.inc.cameraon.licensing.interfaces.IProductKeyStylingWorker;

public class ProductKeyStylingWorker implements IProductKeyStylingWorker {
    @Override public String addStyling(final String productKey) {if ((productKey != null) && (productKey.trim().length() > 0)) {final StringBuilder productKeySb = new StringBuilder(productKey.trim().toUpperCase());int tmpCharsSinceDash = 0;for (int n = (productKeySb.length() - 1); n >= 0; n-- ) {if (n >= 5) {if (tmpCharsSinceDash >= 5) {productKeySb.insert(n, '-');tmpCharsSinceDash = 0;} else {tmpCharsSinceDash++ ;}} else {break;}}return productKeySb.toString();}return productKey;}
    @Override public String removeStyling(String productKey) {if ((productKey != null) && (productKey.trim().length() > 0)) {return productKey.replace("-", "");}return productKey;}
}
