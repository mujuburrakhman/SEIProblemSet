package com.testskils.getuniquearray;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * 
 * @author Mujubur Rakhman
 *
 */
class GetUniqueNumbersOrderBased implements GetUniqueNumbers {
	/** Implemented Logger here **/
	final static Logger LOG = Logger.getLogger(GetUniqueNumbersOrderBased.class);

	/**
	 * This method removes the duplicate values from an integer array and
	 * returns sorted (Ascending order) integer array. This method is suitable
	 * when the array is small This method is less preferred than
	 * eliminateDuplicates ()
	 * 
	 * @param orignalArray
	 */
	public int[] eliminateDuplicates(final int[] orignalArray) {
		int[] uniqueArray = null;
		/**
		 * Put orignalArray values into duplicateArray to avoid changing the
		 * input param values
		 **/
		final int[] duplicateArray = orignalArray;
			/** Check if Null **/
			if (duplicateArray != null) {
				/**
				 * Check if array length is greater than 1 then return the same
				 * array
				 **/
				if (duplicateArray.length > 1) {

					LOG.debug("Random Array before remove duplicate :");
					LOG.debug(Arrays.toString(duplicateArray));

					/** Sorting the Array **/
					Arrays.sort(duplicateArray);
					int j = 0;
					int i = 0;
					while (i < duplicateArray.length) {
						if (duplicateArray[i] == duplicateArray[j]) {
							i++;
						} else {
							duplicateArray[++j] = duplicateArray[i++];
						}
					}
					uniqueArray = Arrays.copyOf(duplicateArray, j + 1);
					
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