package ownProject;

import java.util.Scanner;

public class Calculator 
{
	public void Addition(int a , int b)
	{
		int answer = a + b;
		System.out.println("Addition of "+a+ " + "+b+ " = "+answer);
	}
	public void Subtraction(int a , int b)
	{
		int answer = a - b;
		System.out.println("Subtraction of "+a+ " - "+b+ " = "+answer);	}
	public void Multiplication(int a , int b)
	{
		int answer = a * b;
		System.out.println("Multiplication of "+a+ " * "+b+ " = "+answer);	}
	public void Division(int a , int b)
	{
		int answer = a / b;
		System.out.println("Division of "+a+ " / "+b+ " = "+answer);	}
	
public static void main(String[] args) 
{
	Scanner scn =new Scanner(System.in);
	
	
	while(true) {
	System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division");
	int value =scn.nextInt();
	
	
	Calculator cal = new Calculator();
	switch (value) {
	case 1: {
		System.out.println("Enter the  First value:" );
		int a = scn.nextInt();
		System.out.println("Enter the  Second value:" );
		int b = scn.nextInt();
		cal.Addition(a, b);
		break;
	}
case 2: {
	System.out.println("Enter the  First value:" );
	int a = scn.nextInt();
	System.out.println("Enter the  Second value:" );
	int b = scn.nextInt();
		cal.Subtraction(a, b);
		break;
	}
case 3: {
	System.out.println("Enter the  First value:" );
	int a = scn.nextInt();
	System.out.println("Enter the  Second value:" );
	int b = scn.nextInt();
	cal.Multiplication(a, b);
	break;
}
case 4: {
	System.out.println("Enter the  First value:" );
	int a = scn.nextInt();
	System.out.println("Enter the  Second value:" );
	int b = scn.nextInt();
	cal.Division(a, b);
	break;
}
	
	default:
		throw new IllegalArgumentException("Unexpected value: " + value);
	}
	
	
	System.out.println("Start again by pres Y to end press N");
	String  start =scn.next();
	if (!start.equalsIgnoreCase("y")) {
        break;
    }
}
	scn.close();
}

}
