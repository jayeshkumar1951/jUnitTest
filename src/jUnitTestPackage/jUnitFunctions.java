package jUnitTestPackage;
import java.util.Scanner;  

public class jUnitFunctions {
	public static void main(String args[])  
	{ 
		AddNumbers();
		AddStrings();
	

	}  
	
	public static void AddNumbers()
	{
		
		int a, b, Sum;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		b = sc.nextInt();  
		Sum = a + b;  
		System.out.println("The sum of two numbers a and b is: " + Sum);  
		  
	}  
	
	public static void AddStrings() {
		Scanner sc = new Scanner(System.in); 
		String s1, s2, output;
		System.out.print("Enter the first string: ");  
		s1 = sc.nextLine();  
		System.out.print("Enter the second number: ");  
		s2 = sc.nextLine();  
		output = s1.concat(s2); 
		System.out.println("Adding both the strings, we get: " + output);  
	}

}
