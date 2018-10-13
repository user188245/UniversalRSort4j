package com.user188245.util;

class ByteBinaryDigitExtractor implements BinaryDigitExtractor<Byte>{

	@Override
	public int maxExp() {
		return 8;
	}

	@Override
	public boolean getBinarySignificantDigit(Byte elem, int exp) {
		return (((elem + -128) >>> exp) & 1) == 1;
	}

}
