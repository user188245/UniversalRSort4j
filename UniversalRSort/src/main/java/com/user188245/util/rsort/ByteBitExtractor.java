package com.user188245.util.rsort;

class ByteBitExtractor implements BitExtractor<Byte>{

	@Override
	public int bitSize() {
		return 8;
	}

	@Override
	public boolean getSignificantBit(Byte elem, int exp) {
		return (((elem + -128) >>> exp) & 1) == 1;
	}

}
