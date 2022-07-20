package com.bss.inc.cameraon.licensing.impl.beans;

import com.bss.inc.cameraon.licensing.interfaces.IProductKeyEncodingData;

public class ProductKeyEncodingData implements IProductKeyEncodingData { private final byte a;private final byte b;private final byte c;public ProductKeyEncodingData(final byte a, final byte b, final byte c) {this.a = a;this.b = b;this.c = c;}public byte getA() {return this.a;}public byte getB() {return this.b;}public byte getC() {return this.c;}}


