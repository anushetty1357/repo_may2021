package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> mylist = new ArrayList<String>();
	
	mylist.add("Dev");
	mylist.add("Raj");
	mylist.add("Anu");
	mylist.add("Sam");
	mylist.add("Arun");
	mylist.add("Aisha");
	
	
	System.out.println("Before sorting");
	System.out.println(mylist);
	
	System.out.println("After sorting");
	Collections.sort(mylist);
	System.out.println(mylist);
	
	Collections.sort(mylist,Collections.reverseOrder());
	System.out.println("After Descending order");
	System.out.println(mylist);
	
	Stack<String> mystack = new Stack<String>();
	
	mystack.push("abc");
	mystack.push("xyz");
	mystack.push("ayz");
	mystack.pop();
	mystack.push("bad");
	
	System.out.println(mystack);
	
	
	
	
	}

}
