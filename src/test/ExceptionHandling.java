package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 10;
	int b = 0;
	
	 
	try {
		int result = a/b ;
		System.out.println("After error");
		
	}
	
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception Handled");
	}
	catch(Exception e) {
		System.out.println("Exception Handled");
	}finally {
		System.out.println("Try catch sucessfully executed");}
	
	//System.out.println("Hello Anusha");
	//System.out.println("Simplilearn");
	
	int myarray [] = {2,3,6,58,2};
	try {
		System.out.println("Third value of Array:" + myarray[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("AOB Exception Handled");}
	}
}


