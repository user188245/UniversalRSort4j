package com.user188245.util;

class CharBinaryDigitExtractor implements BinaryDigitExtractor<Character>{

	@Override
	public int maxExp() {
		return 16;
	}

	@Override
	public boolean getBinarySignificantDigit(Character elem, int exp) {
		return ((elem >>> exp) & 1) == 1;
	}

}
