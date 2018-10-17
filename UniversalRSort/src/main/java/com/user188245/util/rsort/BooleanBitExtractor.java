package com.user188245.util.rsort;

class BooleanBitExtractor implements BitExtractor<Boolean>{

	@Override
	public int bitSize() {
		return 1;
	}

	@Override
	public boolean getSignificantBit(Boolean elem, int exp) {
		return elem && (exp == 0);
	}

}
