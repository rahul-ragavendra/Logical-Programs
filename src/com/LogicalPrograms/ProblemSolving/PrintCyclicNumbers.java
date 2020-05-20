package com.LogicalPrograms.ProblemSolving;

import java.util.Scanner;

public class PrintCyclicNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the total number of rows:");
		int totalrows = sc.nextInt();
		for(i = 1; i<=totalrows;i++){
			for(j = i; j<=totalrows; j++){
				System.out.print(j);
			}
			// totalrows+1%j
		//	else{
				
			}
			System.out.println();
		}
		

	}

