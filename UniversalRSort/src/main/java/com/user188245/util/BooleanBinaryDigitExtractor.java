package com.user188245.util;

class BooleanBinaryDigitExtractor implements BinaryDigitExtractor<Boolean>{

	@Override
	public int maxExp() {
		return 1;
	}

	@Override
	public boolean getBinarySignificantDigit(Boolean elem, int exp) {
		return elem && (exp == 0);
	}

}
