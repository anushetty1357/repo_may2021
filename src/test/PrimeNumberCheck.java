package test;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int temp;
	boolean isPrime=true;
	

Scanner scanner = new Scanner (System.in);

System.out.println("Enter the Number:");

int number = scanner.nextInt();

for(int i=2;i<=number/2;i++)
	
{  
	temp=number%i;
 
	if(temp==0)
 
	{ isPrime=false;
			
 break;
 }
	//if is Prime is true then the number is else not
 if(isPrime)
 
System.out.println("Number is Prime:" + number);
 
 else
	 System.out.println("Number is not Prime:" + number);
 
 
}

	
	}

}
