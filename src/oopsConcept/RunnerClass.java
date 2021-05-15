package oopsConcept;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ClassA Emp1 = new ClassA(2000,"Anusha","Amz");
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
		
		Obj2.Display();*/
		
		MethodOverloading obj3 = new MethodOverloading();
		
		obj3.add(2, 4);
		obj3.add(2.3, 3.1);
		
		
		
		MethodOverrideChild obj4 = new MethodOverrideChild();
		
		obj4.display();
		
		AbstractChild obj5 = new AbstractChild();
		obj5.method2();
		
		InterfaceChild obj6 = new InterfaceChild();
		obj6.method1();
		
		EncapsulationExample obj7 = new EncapsulationExample();
		obj7.setEmpID(107048991);
		System.out.println(obj7.getEmpID());
	}

}
