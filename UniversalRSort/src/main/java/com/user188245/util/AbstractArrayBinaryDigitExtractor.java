package com.user188245.util;

abstract class AbstractArrayBinaryDigitExtractor<A,E> implements BinaryDigitExtractor<A>{

	protected final BinaryDigitExtractor<E> digitExtractor;
	
	public final boolean reverseArrayOrder;
	
	AbstractArrayBinaryDigitExtractor(BinaryDigitExtractor<E> digitExtractor, boolean reverseArrayOrder){
		this.digitExtractor = digitExtractor;
		this.reverseArrayOrder = reverseArrayOrder;
	}

	@Override
	public int maxExp() {
		return digitExtractor.maxExp();
	}
	
	@Override
	public boolean getBinarySignificantDigit(A elem, int exp) {
		int digit = exp % maxExp();
		int count = exp / maxExp();
		return getBinarySignificantDigit(elem,count,digit);
	}
	
	public boolean getBinarySignificantDigit(A arr, int index, int exp) {
		if(index >= getSize(arr) || index < 0)
			return false;
		else
			return digitExtractor.getBinarySignificantDigit(getElement(arr,index),exp);
	}
	
	public abstract int getSize(A arr);
	
	public abstract E getElement(A arr, int index);

}
