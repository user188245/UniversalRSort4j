package com.user188245.util.rsort;

/**
 * @purpose the class implemented BitExtractable can hold bit container as field variable. It can be redix-sorted immediately
 * @author user188245
 *
 */
public interface BitExtractable {
	
	/**
	 * 
	 * @param pos bit position. 0 is equivalent to least significant bit, and bitSize()-1 is equivalent to most significant bit.
	 * @return if target bit is 1, it returns true, otherwise false.
	 * @throws NullPointerException
	 */
	boolean getSignificantBit(int pos) throws NullPointerException;
	
	/**
	 * 
	 * @param bitSize the sum of bit size of "radix-sorted target" bit container variables.  
	 * @return BitExtractor
	 */
	public static BitExtractor<BitExtractable> toBitExtractor(int bitSize){
		return new BitExtractor<BitExtractable>() {
			@Override
			public int bitSize() {
				// TODO Auto-generated method stub
				return bitSize;
			}

			@Override
			public boolean getSignificantBit(BitExtractable elem, int pos) {
				// TODO Auto-generated method stub
				return elem.getSignificantBit(pos);
			}};
	}

}
