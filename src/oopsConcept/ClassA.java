package oopsConcept;

public class ClassA {

public int Salary;
public String Name;
public String OrgName;

public ClassA() {
	
	System.out.println("Inside Constructor");
}

public ClassA(int val1, String val2, String val3)

{ System.out.println("Inside Param Constructor");
 
this.Salary = val1;
this.Name = val2;
this.OrgName = val3;

}
public void Display() {
	
	System.out.println("Name of Emp:" + Name);
	System.out.println("OrgName of Emp:" + OrgName);
	System.out.println("Salary of Emp:" + Salary);
}
	
	
	
	
}
