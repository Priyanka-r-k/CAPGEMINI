package test1_12_3;

import java.util.Scanner;

public class Ex5 {
	public static String repeatEnd(String str,int n)
	{
		String substr=str.substring(str.length()-n, str.length());
		String repeatStr=new String();
		for(int i=0;i<n;i++)
		{
			repeatStr=repeatStr + substr;
		}
		return repeatStr;
	}

	public static void main(String[] args) {
		String repStr=repeatEnd("Hello",3);
		System.out.println("String with repetitions = "+repStr);
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Enter String");
		String str=scanner.nextLine();
		
		System.out.println("Enter the value of n between 0 and "+str.length());
		int n=scanner.nextInt();
		String repStr=repeatEnd(str,n);*/
		
		

	}

}
