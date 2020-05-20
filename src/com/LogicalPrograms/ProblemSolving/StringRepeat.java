package com.LogicalPrograms.ProblemSolving;

import java.util.regex.Matcher;

import com.LogicalPrograms.Util.KeyboardUtil;

public class StringRepeat {

	public static void main(String[] args) {
		int j=0,count =0;String fnstr = null;
		String str = KeyboardUtil.getString("enter the string:");
		StringBuilder obj = new StringBuilder(str);
		char[] ch = str.toCharArray();
		int n = KeyboardUtil.getInt("Enter the N value:");
		 int length = str.length();
		 if(length<n){
			 for(int i=length;i<n;i++){
				  obj.append(ch[j]);
				  j++;
			 }
			 fnstr = obj.toString();
		 }
		 char[] ch1 = fnstr.toCharArray();
		 for(int i=0;i<n;i++){
			 if(ch1[i]== 'a'){
				 count++;
			 }
		 }
		 System.out.println(count);
			 

	}

}
