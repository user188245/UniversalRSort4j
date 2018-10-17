package com.user188245.util.rsort;

class CharBitExtractor implements BitExtractor<Character>{

	@Override
	public int bitSize() {
		return 16;
	}

	@Override
	public boolean getSignificantBit(Character elem, int exp) {
		return ((elem >>> exp) & 1) == 1;
	}

}
