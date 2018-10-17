package com.user188245.util.rsort;

abstract class AbstractArrayBitExtractor<A,E> implements BitExtractor<A>{

	protected final BitExtractor<E> bitExtractor;
	
	public final boolean reverseArrayOrder;
	
	AbstractArrayBitExtractor(BitExtractor<E> bitExtractor, boolean reverseArrayOrder){
		this.bitExtractor = bitExtractor;
		this.reverseArrayOrder = reverseArrayOrder;
	}

	@Override
	public int bitSize() {
		return bitExtractor.bitSize();
	}
	
	@Override
	public boolean getSignificantBit(A elem, int exp) {
		int digit = exp % bitSize();
		int count = exp / bitSize();
		return getBinarySignificantDigit(elem,count,digit);
	}
	
	public boolean getBinarySignificantDigit(A arr, int index, int exp) {
		if(index >= getSize(arr) || index < 0)
			return false;
		else
			return bitExtractor.getSignificantBit(getElement(arr,index),exp);
	}
	
	public abstract int getSize(A arr);
	
	public abstract E getElement(A arr, int index);

}
