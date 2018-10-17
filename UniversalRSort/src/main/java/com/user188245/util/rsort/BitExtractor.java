package com.user188245.util.rsort;

/**
 * 
 * @purpose Extract bit from value of T class
 * 
 * @author user188245
 * 
 * @param <T> An bit container
 */
public interface BitExtractor<T> {
	
	/**
	 * 
	 * @return the real quantity of bit which is occupied by T
	 * @example Type "int32" returns '32'
	 * 
	 */
	int bitSize();
	
	/**
	 * @param elem The element
	 * @param pos bit position. 0 is equivalent to least significant bit, and bitSize()-1 is equivalent to most significant bit.
	 * 
	 * @return if target bit is 1, it returns true, otherwise false.
	 * @throws NullPointerException
	 * @example Type "unsigned int" returns ((elem >>> pos) & 1) == 1;
	 * 
	 */
	boolean getSignificantBit(T elem, int pos) throws NullPointerException;

}
