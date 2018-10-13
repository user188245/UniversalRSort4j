package com.user188245.util;

class StringBinaryDigitExtractor extends AbstractArrayBinaryDigitExtractor<String,Character>{

	StringBinaryDigitExtractor(BinaryDigitExtractor<Character> digitExtractor) {
		super(digitExtractor, true);
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
