package test1_12_3;

public class Ex4 {
	
	public static String mixString(String a,String b)
	{
		int len=0;
		String MixStr=new String();
		if(a.length()<b.length()) {
			
			len=a.length();
		
		for(int i=0;i<len;i++)
		{
			MixStr=MixStr+a.substring(i,i+1)+b.substring(i,i+1);
		}
		MixStr=MixStr+b.substring(len, b.length());
		}
		else {
			len=b.length();

			for(int i=0;i<len;i++)
			{
				MixStr=MixStr+a.substring(i,i+1)+b.substring(i,i+1);
			}
			MixStr=MixStr+a.substring(len, a.length());
		}
		return MixStr;
	}

	public static void main(String[] args) {
		System.out.println("Mixed String ="+mixString("abc","xyz"));
		System.out.println("Mixed String ="+mixString("Hi","There"));
		System.out.println("Mixed String ="+mixString("xxx","There"));

	}

}
