package com.LogicalPrograms.ProblemSolving;

//import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5};
		int tmp1 = a[0] * 10 + 2;
		for(int i=3;i<=5;i++){
		  tmp1 = tmp1 * 10 + i;
		}
	 System.out.println(tmp1);
	}

}
