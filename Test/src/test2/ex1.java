package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList =new ArrayList<Integer>(Arrays.asList(4,7,-2,8,-3,-11,20));
		ArrayList<Integer> evenArray=(ArrayList<Integer>) arrList.stream().filter(a->a%2==0 & a>0).collect(Collectors.toList());
		System.out.println(evenArray);
	}

}
