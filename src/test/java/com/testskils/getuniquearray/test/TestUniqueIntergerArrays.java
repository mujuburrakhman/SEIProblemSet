package com.testskils.getuniquearray.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.testskils.getuniquearray.Decider;
import com.testskils.getuniquearray.GetUniqueArrayController;

public class TestUniqueIntergerArrays {
	final GetUniqueArrayController getUniqueArrayController = new GetUniqueArrayController();
	final int[] randomIntegers = new int[] { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 
			4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19, 13, 5, 11, 4, 7, 
			19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };;
	final int[] expectedUniqueIntegers = new int[] {1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};
	final int[] expOrderUniqueIntegers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86, 10000};
	final int[] emptyArray = new int[] {};

	@Test
	public void testUniqueIntegeresSetBased() throws Exception {
		assertArrayEquals(emptyArray, getUniqueArrayController.passIntArray(Decider.SETBASED, null));
		assertArrayEquals(expectedUniqueIntegers, getUniqueArrayController.passIntArray(Decider.SETBASED, randomIntegers));
	}	

	@Test
	public void testUniqueIntegersOrderBased() throws Exception {
		assertArrayEquals(emptyArray, getUniqueArrayController.passIntArray(Decider.ORDERBASED, null));
		assertArrayEquals(expOrderUniqueIntegers, getUniqueArrayController.passIntArray(Decider.ORDERBASED, randomIntegers));
	}

	@Test
	public void testUniqueIntegeresArrayListBased() throws Exception {
		assertArrayEquals(emptyArray, getUniqueArrayController.passIntArray(Decider.ARRAYLISTBASED, null));
		assertArrayEquals(expectedUniqueIntegers, getUniqueArrayController.passIntArray(Decider.ARRAYLISTBASED, randomIntegers));
	}

}
