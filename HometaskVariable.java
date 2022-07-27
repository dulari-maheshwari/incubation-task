package com.incubation;

public class HometaskVariable {
	public double total;

	public void apples(double c1, double c2) {
		System.out.println("Daniel has " + c1 + " apples and Amber has " + c2 + " apples");
		total = c1 + c2;
		System.out.println("Together they have:" + total + "apples");
	}

	public void apples(int c1, int c2) {
		System.out.println("Daniel has " + c1 + "apples and Amber has " + c2 + " apples");
		total = c1 + c2;
		System.out.println("Together they have " + total + " apples");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HometaskVariable hv = new HometaskVariable();
		hv.apples(3, 2);
		hv.apples(3.5, 2.5);

	}

}
