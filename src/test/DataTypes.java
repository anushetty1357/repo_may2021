package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
	
//----- Data types-------------

int num1;
int num2;

num1=12;
num2=31;

int Sum = num1+num2;
int mul = num1*num2;
float div = (float) num1/num2;

System.out.println(Sum);
System.out.println("Multiplication" + mul);
System.out.println("Division" + div);

Scanner scanner = new Scanner(System.in);

/*System.out.println("Enter the name of user:");


String name = scanner.nextLine();


System.out.println("Hello " + name);
System.out.println("Length " + name.length());
System.out.println("Upper case " + name.toUpperCase());
System.out.println("Lower case " + name.toLowerCase());*/

//----------Arrays----------

int myarray [] = { 2,50,40,6,8,9};
System.out.println("The fourth value of Array: " + myarray[3]);

String myarray2 [] = {"abc","sdf","sdv"};
System.out.println("The second value of Array: " + myarray2[1]);








	}

}