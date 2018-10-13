package com.user188245.util;

class DoubleBinaryDigitExtractor implements BinaryDigitExtractor<Double>{

	@Override
	public int maxExp() {
		return 64;
	}

	@Override
	public boolean getBinarySignificantDigit(Double elem, int exp) {
		long b = Double.doubleToRawLongBits(elem);
		if(b<0)b=b^9223372036854775807L;
		return (((b + -9223372036854775808L) >>> exp) & 1) == 1;
	}

}
