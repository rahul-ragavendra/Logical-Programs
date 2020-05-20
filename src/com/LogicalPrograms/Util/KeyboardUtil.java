package com.LogicalPrograms.Util;

import java.util.Scanner;

public class KeyboardUtil {

	@SuppressWarnings("resource")
	public static int getInt(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}

	@SuppressWarnings("resource")
	public static String getString(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();
	}

	@SuppressWarnings("resource")
	public static double getDouble(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextDouble();
	}

}
