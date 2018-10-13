package com.user188245.util;

public interface BinaryDigitExtractor<T> {
	
	int maxExp();
	
	boolean getBinarySignificantDigit(T elem, int exp);

}
