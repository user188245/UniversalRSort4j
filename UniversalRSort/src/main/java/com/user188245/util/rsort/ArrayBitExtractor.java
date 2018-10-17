package com.user188245.util.rsort;

public class ArrayBitExtractor<T> extends AbstractArrayBitExtractor<T[], T>{

	ArrayBitExtractor(BitExtractor<T> bitExtractor, boolean reverseArrayOrder) {
		super(bitExtractor, reverseArrayOrder);
	}
	
	ArrayBitExtractor(BitExtractor<T> digitExtractor) {
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
