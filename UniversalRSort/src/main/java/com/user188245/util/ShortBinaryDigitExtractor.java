package com.user188245.util;

class ShortBinaryDigitExtractor implements BinaryDigitExtractor<Short>{

	@Override
	public int maxExp() {
		return 16;
	}

	@Override
	public boolean getBinarySignificantDigit(Short elem, int exp) {
		return (((elem + (short)(-32768)) >>> exp) & 1) == 1;
	}

}
