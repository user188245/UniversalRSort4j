package com.user188245.util;

class CharArrayBinaryDigitExtractor extends AbstractArrayBinaryDigitExtractor<char[], Character> {

	CharArrayBinaryDigitExtractor(BinaryDigitExtractor<Character> digitExtractor, boolean reverseArrayOrder) {
		super(digitExtractor, reverseArrayOrder);
	}
	
	CharArrayBinaryDigitExtractor(BinaryDigitExtractor<Character> digitExtractor) {
		super(digitExtractor, false);
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
