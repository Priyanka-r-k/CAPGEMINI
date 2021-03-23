package test1_12_3;

public class Ex6 {
	public static String repeatFront(String str,int n)
	{
		String repeatStr=new String();
		int cNum=n;
		for(int i=0;i<=cNum;i++)
		{
			String substr=str.substring(0, n--);
			repeatStr=repeatStr + substr;
		}
		return repeatStr;
	}

	public static void main(String[] args) {

		String repStr1=repeatFront("Chocolate",5);
		System.out.println("String with repetitions = "+repStr1);
		String repStr2=repeatFront("Chocolate",3);
		System.out.println("String with repetitions = "+repStr2);

	}

}
