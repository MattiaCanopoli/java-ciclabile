package org.ciclabile.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		Iterator testCicle = new Iterator(intArray);

		int iter = 0;

		int element = testCicle.getElementoSuccessivo(intArray);
		int element2 = testCicle.getElementoSuccessivo(intArray);
		int element3 = testCicle.getElementoSuccessivo(intArray);
		int element4 = testCicle.getElementoSuccessivo(intArray);

		System.out.println(element);
		System.out.println(element2);
		System.out.println(element3);
		System.out.println(element4);

		System.out.println(testCicle.hasAncoraElementi());

		int element5 = testCicle.getElementoSuccessivo(intArray);
		int element6 = testCicle.getElementoSuccessivo(intArray);
		int element7 = testCicle.getElementoSuccessivo(intArray);
		int element8 = testCicle.getElementoSuccessivo(intArray);
		int element9 = testCicle.getElementoSuccessivo(intArray);

		System.out.println(element5);
		System.out.println(element6);
		System.out.println(element7);
		System.out.println(element8);
		System.out.println(element9);

		System.out.println(testCicle.hasAncoraElementi());

	}

}
