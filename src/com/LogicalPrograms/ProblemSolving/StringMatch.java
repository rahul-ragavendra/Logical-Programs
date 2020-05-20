package com.LogicalPrograms.ProblemSolving;

public class StringMatch {
	public static void main (String args[]) {

	    String input = "hello";

	    combAndPerm(input);

	}

	public static void combAndPerm(String input){

	    char[] toDo = input.toCharArray();

	    for(int i = 0; i < toDo.length; i++){
	        permutation(String.copyValueOf(toDo, i, toDo.length-i));
	    }
	}

	public static void permutation(String str) { 
	permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
