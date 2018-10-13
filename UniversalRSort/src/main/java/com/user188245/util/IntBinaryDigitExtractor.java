package com.user188245.util;

class IntBinaryDigitExtractor implements BinaryDigitExtractor<Integer>{

	@Override
	public int maxExp() {
		return 32;
	}

	@Override
	public boolean getBinarySignificantDigit(Integer elem, int exp) {
		return (((elem + -2147483648) >>> exp) & 1) == 1;
	}

}
