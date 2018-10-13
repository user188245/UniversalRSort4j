package com.user188245.util;

import java.util.ArrayList;
import java.util.List;

public class RadixSorter{
	
	// refactoring needed
	public static synchronized <T> List<T> rsort(List<T> list, BinaryDigitExtractor<T> digitExtractor) {
		int maxexp = digitExtractor.maxExp();
		if(maxexp < 0)
			throw new RuntimeException();
		List<T> left = new ArrayList<>(list.size());
		left.addAll(list);
		if(list.size() > 1){
			List<T> right = new ArrayList<>(list.size());
			for(int i=0; i<maxexp; i++) {
				int count = list.size();
				for(int j=0; j<count;count--) {
					T r = left.remove(j);
					if(digitExtractor.getBinarySignificantDigit(r, i))
						right.add(r);
					else 
						left.add(r);
				}
				if(right.size() > 0) {
					left.addAll(right);
					right.clear();
				}	
			}
		}
		return left;
	}
	
	// refactoring needed
	private static synchronized <T> List<T> rtuplesort(List<T> list, AbstractArrayBinaryDigitExtractor<T,?> digitExtractor, int size) {
		int maxexp = digitExtractor.maxExp();
		if(maxexp < 0)
			throw new RuntimeException();
		List<T> left = new ArrayList<>(list.size());
		left.addAll(list);
		if(list.size() > 1){
			List<T> right = new ArrayList<>(list.size());
			for(int index=0; index<size; index++) {
				for(int i=0; i<maxexp; i++) {
					int count = list.size();
					for(int j=0; j<count;count--) {
						T r = left.remove(j);
						if(digitExtractor.getBinarySignificantDigit(r, (digitExtractor.reverseArrayOrder)?size-1-index:index,i))
							right.add(r);
						else 
							left.add(r);
					}
					if(right.size() > 0) {
						left.addAll(right);
						right.clear();
					}	
				}
			}
		}
		return left;
	}
	
	public static synchronized <A> List<A> rtuplesort(List<A> list, AbstractArrayBinaryDigitExtractor<A,?> digitExtractor) {
		int maxsize = 0;
		for(A elem : list) {
			int size = digitExtractor.getSize(elem);
			if(maxsize < size)
				maxsize = size;
		}
		return rtuplesort(list,digitExtractor,maxsize);
	}

}
