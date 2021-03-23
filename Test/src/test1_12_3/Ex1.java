package test1_12_3;

class Fruits
{
	String name;
	String taste;
	void eat()
	{
		System.out.println("Fruits taste great");
	}
}
class Apple extends Fruits
{
	void eat()
	{
		System.out.println("Apple tastes Sweet");
	}
}
class Orange extends Fruits
{
	void eat()
	{
		System.out.println("Orange tastes Sour");
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Fruits f1=new Apple();
		f1.eat();
		Fruits f2=new Orange();
		f2.eat();

	}

}
