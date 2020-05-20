package com.LogicalPrograms.ProblemSolving;

public class AddNumbersInString {

	public static void main(String[] args)throws NumberFormatException {
		String s = "2ab23b25n";
		String n; int j = 0, k=0, sum = 0;
		int length = s.length();
		//System.out.println(length);
		String[] str = new String[s.length()];
		for(int i=0;i<=length-1;i++){
		if(Character.isDigit(s.charAt(i))){
		   str[k] = Character.toString(s.charAt(i));
		   while(Character.isDigit(s.charAt(i+1))){
			  // StringBuilder obj = new StringBuilder(str[k]);
			   str[k] = str[k] + Character.toString(s.charAt(i+1));
			   i++;
		   }
		   k++;
		}
	}
		
		for(int i = 0; i<str.length;i++){
			if(str[i]!=null){
			int num = Integer.parseInt(str[i]);
			sum += num;
			}
		}
		System.out.println(sum);
}
}
