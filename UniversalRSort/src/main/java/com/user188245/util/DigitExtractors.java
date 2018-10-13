package com.user188245.util;

public class DigitExtractors {
	
	public static final IntBinaryDigitExtractor INT = new IntBinaryDigitExtractor();
	public static final LongBinaryDigitExtractor LONG = new LongBinaryDigitExtractor();
	public static final ShortBinaryDigitExtractor SHORT = new ShortBinaryDigitExtractor();
	public static final CharBinaryDigitExtractor CHAR = new CharBinaryDigitExtractor();
	public static final ByteBinaryDigitExtractor BYTE = new ByteBinaryDigitExtractor();
	public static final BooleanBinaryDigitExtractor BOOLEAN = new BooleanBinaryDigitExtractor();
	public static final FloatBinaryDigitExtractor FLOAT = new FloatBinaryDigitExtractor();
	public static final DoubleBinaryDigitExtractor DOUBLE = new DoubleBinaryDigitExtractor();
	
	public static final CharArrayBinaryDigitExtractor CHAR_ARRAY = new CharArrayBinaryDigitExtractor(CHAR);
	public static final StringBinaryDigitExtractor STRING = new StringBinaryDigitExtractor(CHAR);
}
