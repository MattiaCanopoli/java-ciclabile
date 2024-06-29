package org.ciclabile.java;

public class Cicle {

	private int[] intArray;
	private int lastIteration;

	public Cicle(int[] intArray) {
		this.intArray = intArray;
		this.lastIteration = 0;
	}

	public int getElementoSuccessivo(int[] intArray) {

		int element = 0;
		for (int i = this.lastIteration; i < this.lastIteration + 1; i++) {
			element = intArray[i];
		}

		this.lastIteration++;
		// System.out.println(lastIteration);

		return element;
	}

	public boolean hasAncoraElementi() {

		boolean result = false;

		if (!(this.lastIteration == this.intArray.length)) {
			result = true;
		}
		return result;
	}

}
