package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise6_2 {

	public static HashMap<Character, Integer> countChar(char[] arr){
		HashMap<Character, Integer> charCount  = new HashMap<Character, Integer>();
		        char[] arr1=arr;
		for(char c:arr1) {
		if(charCount.containsKey(c) ) {
		charCount.put(c, charCount.get(c) + 1);

		}
		else
		charCount.put(c,1);

		}
		return charCount;

		}

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		  String input=sc.next();
		  char[] arr= input.toCharArray();
		  System.out.println(countChar( arr));
		 

	}

}
