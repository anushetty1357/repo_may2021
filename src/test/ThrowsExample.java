package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ThrowsExample obj = new ThrowsExample();
	try {
		obj.elegibility(17);
		
	}catch(ArithmeticException e) {
		
		System.out.println("Exception Handled");
	}
	
	}
public void elegibility(int age) throws ArithmeticException {
	if(age<18) {
		throw new ArithmeticException("Not valid age");
		
	}
	else {
		System.out.println("Eligible for voting");
	}

}
}
