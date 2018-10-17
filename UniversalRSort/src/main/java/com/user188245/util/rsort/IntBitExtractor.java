package com.user188245.util.rsort;

class IntBitExtractor implements BitExtractor<Integer>{

	@Override
	public int bitSize() {
		return 32;
	}

	@Override
	public boolean getSignificantBit(Integer elem, int exp) {
		return (((elem + -2147483648) >>> exp) & 1) == 1;
	}

}
