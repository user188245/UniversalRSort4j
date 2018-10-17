package com.user188245.util.rsort;

class ShortBitExtractor implements BitExtractor<Short>{

	@Override
	public int bitSize() {
		return 16;
	}

	@Override
	public boolean getSignificantBit(Short elem, int exp) {
		return (((elem + (short)(-32768)) >>> exp) & 1) == 1;
	}

}
