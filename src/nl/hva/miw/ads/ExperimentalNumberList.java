package nl.hva.miw.ads;

import java.util.Arrays;

public class ExperimentalNumberList {
	private int[] numberList;
	private int numberOfElements;
	private int minimumValue;
	private int maximumValue;
	
	
	public ExperimentalNumberList(int numberOfElements) {
		super();
		this.numberOfElements = numberOfElements;
		this.numberList = new int[numberOfElements];
	}

	public ExperimentalNumberList(int[] numberList) {
		this.numberList = numberList;
		this.numberOfElements = numberList.length;
		minimumValue = findMin( numberList );
		maximumValue = findMax( numberList );
	}

	/**
	 * Generate random numbers from min to max.
	 *
	 * @param min
	 * @param max
	 */
	public void generateNumbers(int min, int max) {
		this.minimumValue = min;
		this.maximumValue = max;
		// de range van de random nummer is max - min + 1 (van 17 tot 41 zijn 25 getallen)
		for (int i = 0; i < numberOfElements; i++) {
			this.numberList[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}

	/**
	 * Check if equal values exist in the array.
	 *
	 * @return
	 */
	public boolean equalValuesExist() {
	    // Fill in your answer.
		return false;
	}

	/**
	 * Count nr of positive values in the array.
	 *
	 * @return
	 */
	public int countPositives() {
		// Fill in your answer
		return 0;
	}

	/**
	 * Sum all positive values in the array
	 *
	 * @return
	 */
	public int sumOfPositives() {
	    // Fill in your answer
		return 0;
	}

	/**
	 * Find the max value.
	 *
	 * @return
	 */
	public int maxValue() {
		// Fill in your answer
		return 0;
	}

	/**
	 * Count number of different values
	 *
	 * @return
	 */
	public int numberOfDifferentValues() {
		// Fill in your answer
		return 0;
	}
	
	public int numberOfDifferentValuesVersion2() {
		// Fill in your answer
		return 0;
	}

	/**
	 * Check if number at index i is a local maximum. That is if it
	 * is bigger than all the values earlier in the array.
	 *
	 * @param i
	 * @return
	 */
	public boolean isLocalMaximum(int i) {
		// Fill in your answer
		return false;
	}


	/**
	 * Return an array of indexes, indicating local maximums. (see method {@link #isLocalMaximum(int)}
	 *
	 * @return
	 */
	public int[] locationOfLocalMaximum() {
	    // Fill in your answer
		return null;
	}

	/**
	 * Returns how many local maximums are in the array. (see {@link #isLocalMaximum(int)}
	 *
	 * @return
	 */
	public int numberOfLocalMaximum() {
	    // Fill in your answer
		return 0;
	}


	public int getValueAtIndex(int i) {
		return this.numberList[i];
	}
	
	public int getNumberOfElements() {
		return numberOfElements;
	}


	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	/**
	 * Helper functions.
	 */

	private int findMax(int[] numberList) {
		int max = Integer.MIN_VALUE;
		for ( int i : numberList ) {
			if ( i > max ) max = i;
		}
		return max;
	}

	private int findMin(int[] numberList) {
		int min = Integer.MAX_VALUE;
		for ( int i : numberList ) {
			if ( i < min ) min = i;
		}
		return min;
	}

	public String toString() {
		return Arrays.toString(this.numberList);
	}
}
