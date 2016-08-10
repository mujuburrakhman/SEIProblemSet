package com.testskils.getuniquearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 
 * @author Mujubur Rakhman
 *
 */
class GetUniqueNumbersAListBased implements GetUniqueNumbers {
	/** Implemented Logger here **/
	final static Logger LOG = Logger.getLogger(GetUniqueNumbersAListBased.class);

	/**
	 * This method removes the duplicate values from an integer array along with
	 * retaining the insertion order in the integer array and it uses ArrayList.
	 * This method is less preferred than eliminateDuplicates ()
	 * 
	 * @param duplicateArray
	 */
	public int[] eliminateDuplicates(final int[] duplicateArray) {
		int[] uniqueArray = null;
			/** Check if Null **/
			if (duplicateArray != null) {
				/**
				 * Check if array length is greater than 1 then return the same
				 * array
				 **/
				if (duplicateArray.length > 1) {
					LOG.debug("Random Array before remove duplicate :");
					LOG.debug(Arrays.toString(duplicateArray));
					final List<Integer> uniqueList = new ArrayList<Integer>();
					for (int i = 0; i < duplicateArray.length; i++) {
						if (!uniqueList.contains(duplicateArray[i])) {
							uniqueList.add(duplicateArray[i]);
						}
					}
					uniqueArray = new int[uniqueList.size()];
					int increment = 0;
					for (final int temp : uniqueList) {
						uniqueArray[increment] = temp;
						increment++;
					}
					LOG.debug("Unique array after removed duplicates :");
					LOG.debug(Arrays.toString(uniqueArray));
				} else {
					LOG.debug("Input array length is greater than 1");
					uniqueArray = duplicateArray;
				}
			} else {
				LOG.debug("Input array is Null");
				uniqueArray = new int[] {};
			}
		return uniqueArray;

	}
}
