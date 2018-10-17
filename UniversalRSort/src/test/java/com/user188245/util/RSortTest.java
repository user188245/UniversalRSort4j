package com.user188245.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.user188245.util.rsort.BitExtractors;
import com.user188245.util.rsort.RadixSorter;

public class RSortTest {
	
	List<Integer> intList;
	List<Long> longList;
	List<Short> shortList;
	List<Character> charList;
	List<Byte> byteList;
	List<Boolean> booleanList;
	List<Float> floatList;
	List<Double> doubleList;
	List<String> stringList;
	
	@Before
	public void setUp() throws Exception {
		int i;
		intList = new ArrayList<>(10000);
		longList = new ArrayList<>(10000);
		shortList = new ArrayList<>(10000);
		charList = new ArrayList<>(10000);
		byteList = new ArrayList<>(10000);
		booleanList = new ArrayList<>(10000);
		floatList = new ArrayList<>(10000);
		doubleList = new ArrayList<>(10000);
		stringList = new ArrayList<>(10000);
		for(i=0; i<10000; i++)intList.add((int) intGenerate(-10000,30000));
		for(i=0; i<10000; i++)longList.add(intGenerate(-100000,200000));
		for(i=0; i<10000; i++)shortList.add((short) intGenerate(-300,700));
		for(i=0; i<10000; i++)charList.add((char) intGenerate(Character.MIN_VALUE,Character.MAX_VALUE));
		for(i=0; i<10000; i++)byteList.add((byte) intGenerate(0,130));
		for(i=0; i<10000; i++)booleanList.add(intGenerate(0,2)==1);
		for(i=0; i<10000; i++)floatList.add((float) floatGenerate());
		for(i=0; i<10000; i++)doubleList.add(floatGenerate());
		for(i=0; i<10000; i++)stringList.add(stringGenerate(1,9));
	}

	@Test
	public void intTest() {
		List<Integer> list = RadixSorter.rsort(intList, BitExtractors.INT);
		Collections.sort(intList);
		assertEquals(intList,list);
	}
	
	@Test
	public void longTest() {
		List<Long> list = RadixSorter.rsort(longList, BitExtractors.LONG);
		Collections.sort(longList);
		assertEquals(longList,list);
	}
	
	@Test
	public void shortTest() {
		List<Short> list = RadixSorter.rsort(shortList, BitExtractors.SHORT);
		Collections.sort(shortList);
		assertEquals(shortList,list);
	}
	
	@Test
	public void charTest() {
		List<Character> list = RadixSorter.rsort(charList, BitExtractors.CHAR);
		Collections.sort(charList);
		assertEquals(charList,list);
	}
	
	@Test
	public void byteTest() {
		List<Byte> list = RadixSorter.rsort(byteList, BitExtractors.BYTE);
		Collections.sort(byteList);
		assertEquals(byteList,list);
	}
	
	@Test
	public void booleanTest() {
		List<Boolean> list = RadixSorter.rsort(booleanList, BitExtractors.BOOLEAN);
		Collections.sort(booleanList);
		assertEquals(booleanList,list);
	}
	
	@Test
	public void floatTest() {
		List<Float> list = RadixSorter.rsort(floatList, BitExtractors.FLOAT);
		Collections.sort(floatList);
		assertEquals(floatList,list);
	}
	
	@Test
	public void doubleTest() {
		List<Double> list = RadixSorter.rsort(doubleList, BitExtractors.DOUBLE);
		Collections.sort(doubleList);
		assertEquals(doubleList,list);
	}
	
	@Test
	public void stringTest() {
		List<String> list = RadixSorter.rtuplesort(stringList, BitExtractors.STRING);
		Collections.sort(stringList);
		assertEquals(stringList,list);
	}
	
	
	private String stringGenerate(int min, int max) {
		StringBuilder sb = new StringBuilder();
		for(int i=min; i<=Math.random()*(max+min)+min; i++) {
			sb.append((char)(intGenerate(Character.MIN_VALUE,Character.MAX_VALUE)));
		}
		return sb.toString();
	}
	
	private double floatGenerate(){
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		if(a<0.5)
			b = -b;
		return b * Math.pow(2, (int)(c*16));
	}
	
	private long intGenerate(long min, long max){
		double a = Math.random();
		return (long)(a*(max+min+1)+min);
	}
	
	

}
