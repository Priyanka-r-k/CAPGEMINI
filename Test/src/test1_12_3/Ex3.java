package test1_12_3;

import java.util.Scanner;

class MinimumChar extends Exception
{
	public MinimumChar(String msg)
	{
		super(msg);
	}
	
}
class Employee
{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void Validation(String firstName ,String lastName) throws MinimumChar 
	{
		if(firstName==null || lastName==null)
		{
			throw new NullPointerException("Entry Missing");
		}
		else
		{
			System.out.print("Name = "+firstName);
		}
		if(firstName.length()<3 || lastName.length()<3)
		{
			throw new MinimumChar("Name should be minimum 3 characters");
		}
		else
		{
			System.out.print(" "+lastName);
		}
	}
}

public class Ex3 {

	public static void main(String[] args) throws MinimumChar {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName=scanner.nextLine();
		
		System.out.println("Enter Last Name");
		String lName=scanner.nextLine();
		Employee emp=new Employee(fName,lName);
		emp.Validation(emp.getFirstName(),emp.getLastName());

	}

}
