package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FileOutputStream fileOutputStream;
	try {
		fileOutputStream = new FileOutputStream("bcd.txt");
		String msg = "Welcome to Hello Java!";
		
		byte byteArray[] = msg.getBytes();//converting string into byte array
		
		fileOutputStream.write(byteArray);
		
		System.out.println("Message written to file successfully!");
	}
	catch (FileNotFoundException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("File not found");
	}
	catch (IOException e)
	{
		//TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("IO Exception");
	}
	
	}

}
