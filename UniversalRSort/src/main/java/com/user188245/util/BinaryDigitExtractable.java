package com.user188245.util;

public interface BinaryDigitExtractable {
	
	boolean getBinarySignificantDigit(int exp);
	
	public static BinaryDigitExtractor<BinaryDigitExtractable> toBinaryDigitExtractor(int maxExp){
		return new BinaryDigitExtractor<BinaryDigitExtractable>() {
			@Override
			public int maxExp() {
				// TODO Auto-generated method stub
				return maxExp;
			}

			@Override
			public boolean getBinarySignificantDigit(BinaryDigitExtractable elem, int exp) {
				// TODO Auto-generated method stub
				return elem.getBinarySignificantDigit(exp);
			}};
	}

}
