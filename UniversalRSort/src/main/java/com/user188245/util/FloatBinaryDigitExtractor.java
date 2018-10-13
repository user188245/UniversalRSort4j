package com.user188245.util;

class FloatBinaryDigitExtractor implements BinaryDigitExtractor<Float>{

	@Override
	public int maxExp() {
		return 32;
	}

	@Override
	public boolean getBinarySignificantDigit(Float elem, int exp) {
		int b = Float.floatToIntBits(elem);
		if(b<0)b=b^2147483647;
		return (((b + -2147483648) >>> exp) & 1) == 1;
	}

}
