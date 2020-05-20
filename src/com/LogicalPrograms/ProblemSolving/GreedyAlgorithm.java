package com.LogicalPrograms.ProblemSolving;

import java.util.HashMap;

public class GreedyAlgorithm {

	public static void main(String[] args) {
		int target = 2;
		int[] arr = new int[]{7,0,-4,5,2,3};
		closestnum(arr, target);
	}
	private static HashMap<Integer, String> closestnum(int[] arr, int target) {
		HashMap<Integer,String> map = new HashMap<>();
	    int[] result = new int[2];
	    for(int i=0;i<arr.length;i++){
	    	if(map.get(arr[i])!= null){
	    		map.put(arr[i], map.get(arr[i]));
	    	}
	    	else{
	    		int a = target - arr[i];
	    		int b = arr[i];
	    		String s1 = Integer.toString(b);
	    		map.put(a,s1);	 
	    	}
	    }
	    System.out.println(map);
		return map;
		
	}

}
