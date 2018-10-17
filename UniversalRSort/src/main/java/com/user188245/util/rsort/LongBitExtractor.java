package com.user188245.util.rsort;

class LongBitExtractor implements BitExtractor<Long>{

	@Override
	public int bitSize() {
		return 64;
	}

	@Override
	public boolean getSignificantBit(Long elem, int exp) {
		return (((elem + -9223372036854775808L) >>> exp) & 1) == 1;
	}

}
