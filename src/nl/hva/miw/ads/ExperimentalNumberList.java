package nl.hva.miw.ads;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		minimumValue = findMin(numberList);
		maximumValue = findMax(numberList);
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
		int startingNumber = 1;
		for (int number = 0; number < numberList.length - 1; number++) {

			for (int otherNumber = startingNumber; otherNumber < numberList.length ; otherNumber++) {
				if (numberList[number] == numberList[otherNumber]) {

					return true;
				}
			}
			startingNumber++;
		}
		return false;
	}

	/**
	 * Count nr of positive values in the array.
	 *
	 * @return
	 */
	public int countPositives() {
		int positives = 0;

		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] > 0) {
				positives++;
			}
		}

		return positives;
	}

	/**
	 * Sum all positive values in the array
	 *
	 * @return
	 */
	public int sumOfPositives() {
		int sum = 0;

		for (int index = 0; index < numberList.length; index++) {
			if (numberList[index] > 0) {
				sum += numberList[index];
			}
		}

		return sum;
	}


	/**
	 * Find the max value.
	 *
	 * @return
	 */
	public int maxValue() {
		int max = numberList[0];

		for (int number : numberList) {
			if (number > max) {
				max = number;
			}
		}

		return max;
	}

	/**
	 * Count number of different values
	 *
	 * @return
	 */
	public int numberOfDifferentValues() {
		Set<Integer> setOfNumberList = new HashSet<>();

		for (int number : numberList) {
			setOfNumberList.add((Integer) number);
		}

		return setOfNumberList.size();
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
		for (int j = 0; j < i; j++) {
			if (numberList[j] > numberList[i]) {
				return false;
			}
		}

		return true;
	}


	/**
	 * Return an array of indexes, indicating local maximums. (see method {@link #isLocalMaximum(int)}
	 *
	 * @return
	 */
	public int[] locationOfLocalMaximum() {
		int[] indexOfMaxima = new int[numberOfLocalMaximum()];

		for (int i : numberList) {
			for (int j = 0; j < indexOfMaxima.length; j++) {
				if (isLocalMaximum(i)) {
					indexOfMaxima[j] = i;
				}
			}
		}

		return indexOfMaxima;
	}

	/**
	 * Returns how many local maximums are in the array. (see {@link #isLocalMaximum(int)}
	 *
	 * @return
	 */
	public int numberOfLocalMaximum() {
	    int numberOfMaximum = 0;

		for (int i : numberList) {
			if (isLocalMaximum(i)) {
				numberOfMaximum++;
			}
		}

		return numberOfMaximum;
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
