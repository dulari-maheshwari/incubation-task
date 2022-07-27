package com.incubation;

import java.util.Scanner;

public class HometaskLoops {
	
	public void forLoop(int colNo, int range) {
		int num = 0;
		for (int i = 0; i < colNo; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + num);
				num = num + range;
			}
			System.out.println();
		}
	}

	public void whileLoop(int colNo, int range) {
		int i = 0;
		int num = 0;
		while (i < colNo) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + num);
				num = num + range;
			}
			System.out.println();
			i++;
		}
	}

	public void doWhileLoop(int colNo, int range) {
		int i = 0;
		int num = 0;
		do {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + num);
				num = num + range;
			}
			System.out.println();
			i++;

		} while (i < colNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter column range : ");
		int colNo = sc.nextInt();
		System.out.println("Enter range : ");
		int range = sc.nextInt();

		HometaskLoops lp = new HometaskLoops();
		lp.forLoop(colNo, range);
		System.out.println();
		lp.whileLoop(colNo, range);
		System.out.println();
		lp.doWhileLoop(colNo, range);

	}

}
