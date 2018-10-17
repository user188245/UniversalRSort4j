package com.user188245.util.rsort;

class FloatBitExtractor implements BitExtractor<Float>{

	@Override
	public int bitSize() {
		return 32;
	}

	@Override
	public boolean getSignificantBit(Float elem, int exp) {
		int b = Float.floatToIntBits(elem);
		if(b<0)b=b^2147483647;
		return (((b + -2147483648) >>> exp) & 1) == 1;
	}

}
