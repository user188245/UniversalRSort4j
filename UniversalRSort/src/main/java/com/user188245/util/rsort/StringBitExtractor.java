package com.user188245.util.rsort;

class StringBitExtractor extends AbstractArrayBitExtractor<String,Character>{

	StringBitExtractor(BitExtractor<Character> bitExtractor) {
		super(bitExtractor, true);
	}

	@Override
	public int getSize(String arr) {
		return arr.length();
	}

	@Override
	public Character getElement(String arr, int index) {
		return arr.charAt(index);
	}

}
