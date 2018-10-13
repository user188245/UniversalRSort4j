package com.user188245.util;

class LongBinaryDigitExtractor implements BinaryDigitExtractor<Long>{

	@Override
	public int maxExp() {
		return 64;
	}

	@Override
	public boolean getBinarySignificantDigit(Long elem, int exp) {
		return (((elem + -9223372036854775808L) >>> exp) & 1) == 1;
	}

}
