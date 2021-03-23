package lab6;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Exrecise6_4 {

	public static void main(String[] args) {
		Map<Integer, Integer> input= new HashMap<>();
		input.put(101,99 );
		input.put(102,70 );
		input.put(103,45 );
		input.put(104,85 );
		input.put(105,79 );

		Map<Integer, String> result=getStudent(input);
		System.out.println(result+"\n");
		}

		private static Map<Integer, String> getStudent(Map<Integer, Integer> input) {
		Map<Integer, String> student= new HashMap<>();


		for(java.util.Map.Entry<Integer, Integer> i:input.entrySet()) {

		if(i.getValue()>=90) {
		student.put(i.getKey(), "gold");
		}
		else if(i.getValue()>=80 && i.getValue()<90) {
		student.put(i.getKey(), "silver");
		}
		else if(i.getValue()>=70 && i.getValue()<80) {
		student.put(i.getKey(), "bronze");
		}
		else {

		}

		}
		return student;
		}

	}

