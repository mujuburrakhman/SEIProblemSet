package com.testskils.getuniquearray;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * 
 * @author Mujubur Rakhman
 *
 */
class GetUniqueNumbersSetBased implements GetUniqueNumbers {
	/** Implemented Logger here **/
	final static Logger LOG = Logger.getLogger(GetUniqueNumbersSetBased.class);

	/**
	 * 
	 * This method removes the duplicate values from an integer array and it
	 * suitable if we want to make use of collections especially if the data is
	 * huge. Also, it should take into consideration #4 retaining the insertion
	 * order
	 * 
	 * @param duplicateArray
	 */
	public int[] eliminateDuplicates(final int[] duplicateArray) {
		int[] uniqueArray = null;
			/** Check if Null **/
			if (duplicateArray != null) {
				/**
				 * Check if array length is greater than 1  return the same
				 * array
				 **/
				if (duplicateArray.length > 1) {
					LOG.debug("Random Array before remove duplicate :");
					LOG.debug(Arrays.toString(duplicateArray));

					final Set<Integer> uniqueSet = new LinkedHashSet<Integer>();
					for (final int arrayElement : duplicateArray) {
						uniqueSet.add(arrayElement);
					}

					uniqueArray = new int[uniqueSet.size()];
					int increment = 0;
					for (final int temp : uniqueSet) {
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
