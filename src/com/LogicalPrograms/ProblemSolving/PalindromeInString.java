package com.LogicalPrograms.ProblemSolving;

import java.util.*;
import com.LogicalPrograms.Util.KeyboardUtil;

public class PalindromeInString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String str = KeyboardUtil.getString("Enter a sentence with many palindrome:");
		int i;
		String[] splt = str.split(" ");
		for (String palin : splt) {
			System.out.println(palin);
			StringBuilder obj = new StringBuilder(palin);
			String tmp = obj.reverse().toString();
			if (tmp == palin) {
				list.add(palin);
			} else
				continue;
		}
		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return 1;
				} else {
					return s1.compareTo(s2);
				}
			}
		});*/
		System.out.println(list);
	}
}