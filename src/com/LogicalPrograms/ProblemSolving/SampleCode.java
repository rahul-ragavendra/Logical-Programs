package com.LogicalPrograms.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class SampleCode {

	public static void main(String[] args) {
		int i;
		List<Integer> list = Arrays.asList(5, 23, 23, 66, 5, 23, 7, 0);
		List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
		
		for (i = 0; i <= newlist.size(); i++) {
			System.out.println(newlist);
			/*while (j<list.size()-1) {
				if (list.get(i) == list.get(j)) {
					list.removeAll(c)
					break;
				} else {*/
				
					//itr.next();
		}
	}
}
