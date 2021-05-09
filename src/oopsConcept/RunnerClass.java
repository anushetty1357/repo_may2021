package oopsConcept;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA Emp1 = new ClassA(2000,"Anusha","Amz");
		ClassA Emp2 = new ClassA();
		
		Emp1.Display();
		
		ClassB Obj1 = new ClassB();
		
		Obj1.Name = "Anushanvi";
		Obj1.Salary = 2500;
		Obj1.OrgName = "Amzn";
		
		Obj1.Display();
		Obj1.show();
		
		ClassC Obj2 = new ClassC();
		
		Obj2.run();
		Obj2.Salary = 3000;
		Obj2.OrgName = "Zen";
		Obj2.Name = "Sharath";
		
		Obj2.Display();
		
		
		
		
	}

}
