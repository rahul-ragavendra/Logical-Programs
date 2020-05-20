package com.LogicalPrograms.ProblemSolving;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		 Map<Character,Integer> mappedNumbers = GetString(A,B,C);
			//return diverse(mappedNumbers);
		 System.out.println(diverse(mappedNumbers));
	    }
	    
	    public static String diverse(Map<Character, Integer> map){
				PriorityQueue<Util> obj = new PriorityQueue<>(new Comparator<Util>(){
					@Override
					public int compare(Util a, Util b){
						return b.number - a.number;
					}
				});

				for(Character ch : map.keySet()){
					if(map.get(ch) != 0){
						Util n = new Util(map.get(ch) ,ch);
						obj.offer(n);
					}
				}

				StringBuilder finalString = new StringBuilder();
				while(!obj.isEmpty()){
					Util first = obj.poll();
					if(finalString.length() != 0 && finalString.charAt(finalString.length() - 1) == first.letter){
						if(obj.isEmpty()){
							return finalString.toString();
						}
						else{
							Util second = obj.poll();
							finalString.append(second.letter);
							second.number--;
							if(second.number != 0){
								obj.offer(second);
							}
							obj.offer(first);
						}
					}
					else{
						int len = Math.min(2, first.number);
						for(int i = 0; i < len; i++){
							finalString.append(first.letter);
							first.number--;
						}
						if(first.number != 0){
							obj.offer(first);
						}
					}
				}
				return finalString.toString();
			}
			  static Map<Character,Integer> GetString(int A, int B, int C) {
				Map<Character, Integer> map = new HashMap<>();
				map.put('a', A);
				map.put('b', B);
				map.put('c', C);
				return map;
			}
		}

	class Util{
		int number;
		char letter;
		public Util(int number, char alphabet){
			this.number = number;
			this.letter = alphabet;
		}
	}

