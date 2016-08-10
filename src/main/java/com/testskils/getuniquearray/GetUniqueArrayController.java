package com.testskils.getuniquearray;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * 
 * @author Mujubur
 *
 */
public class GetUniqueArrayController {
	/** Implemented Logger here **/
	final static Logger LOG = Logger.getLogger(GetUniqueArrayController.class);

	public GetUniqueArrayController() {
	}

	/**
	 * This method decides which class need to be called based on the scenario
	 * 
	 * @param deciderString
	 * @param duplicateArray
	 * @return
	 */
	public int[] passIntArray(final Decider decider, final int[] duplicateArray) {

		int[] returnIntArray = new int[] {};
		try {
			GetUniqueNumbers getUniqueNumbers = null;
			/**
			 * Switch statement for to decide the respective class based on the
			 * string passed from argument decider
			 */
			switch (decider) {
			case SETBASED: {
				LOG.debug("SETBASED Called");
				getUniqueNumbers = new GetUniqueNumbersSetBased();
				break;
			}
			case ORDERBASED: {
				LOG.debug("ORDERBASED Called");
				getUniqueNumbers = new GetUniqueNumbersOrderBased();
				break;
			}
			case ARRAYLISTBASED: {
				LOG.debug("ARRAYLISTBASED Called");
				getUniqueNumbers = new GetUniqueNumbersAListBased();
				break;
			}
			default: {
				LOG.debug("Default Called");
				returnIntArray = new int[] {};
				break;
			}
			}
			if (getUniqueNumbers != null) {
				returnIntArray = getUniqueNumbers.eliminateDuplicates(duplicateArray);
			}
		} catch (Exception e) {
			LOG.error("Exception Occured :" + e.getMessage());
			LOG.error("Decider Input : " + decider);
			LOG.error("Input Array :" + Arrays.toString(duplicateArray));
			returnIntArray = new int[] {};
		}
		return returnIntArray;
	}
}
