package com.user188245.util.rsort;

public class BitExtractors {
	
	public static final IntBitExtractor INT = new IntBitExtractor();
	public static final LongBitExtractor LONG = new LongBitExtractor();
	public static final ShortBitExtractor SHORT = new ShortBitExtractor();
	public static final CharBitExtractor CHAR = new CharBitExtractor();
	public static final ByteBitExtractor BYTE = new ByteBitExtractor();
	public static final BooleanBitExtractor BOOLEAN = new BooleanBitExtractor();
	public static final FloatBitExtractor FLOAT = new FloatBitExtractor();
	public static final DoubleBitExtractor DOUBLE = new DoubleBitExtractor();
	
	public static final CharArrayBitExtractor CHAR_ARRAY = new CharArrayBitExtractor(CHAR);
	public static final StringBitExtractor STRING = new StringBitExtractor(CHAR);
}
