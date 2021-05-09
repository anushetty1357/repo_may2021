package test;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner (System.in);

System.out.println("Enter the Number:");

int number = scanner.nextInt();

if (number%number ==1)

{ 
	System.out.println("Number is prime");
}

else
	{ System.out.println("Number is not prime");

}

	
	}

}
