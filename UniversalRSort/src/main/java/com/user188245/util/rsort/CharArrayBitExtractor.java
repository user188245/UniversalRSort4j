package com.user188245.util.rsort;

class CharArrayBitExtractor extends AbstractArrayBitExtractor<char[], Character> {

	CharArrayBitExtractor(BitExtractor<Character> bitExtractor, boolean reverseArrayOrder) {
		super(bitExtractor, reverseArrayOrder);
	}
	
	CharArrayBitExtractor(BitExtractor<Character> bitExtractor) {
		super(bitExtractor, false);
	}

	@Override
	public int getSize(char[] arr) {
		return arr.length;
	}

	@Override
	public Character getElement(char[] arr, int index) {
		return arr[index];
	}

}
