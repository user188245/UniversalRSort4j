package com.user188245.util;

public class ArrayBinaryDigitExtractor<T> extends AbstractArrayBinaryDigitExtractor<T[], T>{

	ArrayBinaryDigitExtractor(BinaryDigitExtractor<T> digitExtractor, boolean reverseArrayOrder) {
		super(digitExtractor, reverseArrayOrder);
	}
	
	ArrayBinaryDigitExtractor(BinaryDigitExtractor<T> digitExtractor) {
		super(digitExtractor, false);
	}

	@Override
	public int getSize(T[] arr) {
		return arr.length;
	}

	@Override
	public T getElement(T[] arr, int index) {
		return arr[index];
	}

}
