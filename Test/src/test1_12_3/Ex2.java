package test1_12_3;

class Shape
{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Shape circle= new Circle();
		Shape triangle= new Triangle();
		Shape square= new Square();
		circle.draw();
		circle.erase();
		triangle.draw();
		triangle.erase();
		square.draw();
		square.erase();

	}

}
