package Day9;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class AddNameInFile {

	public static void main(String args[]) throws IOException {
		try {
		File file = new File("/AJ/Name_Collection.txt");
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file, true);
		
		Scanner sc = new Scanner(System.in);
	    int cond = 1;
	    while(cond==1)
	    {
	    	System.out.println("Enter the name : -");
	    	String name = sc.next();
	    	System.out.println("Hello "+name);
	    
	    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	        Date date = new Date();  
	        String tim = formatter.format(date);
	    	String text = name + " Login time: "+tim+" \n";
	    	writer.write(text);
	    	System.out.println("do you want to enter other names , then enter 1- ");
	        cond = sc.nextInt();
	    }
	    
	    writer.flush();
	    writer.close();
	    System.out.println("program ended");
		}
		catch(Exception e) {
			System.out.println("exception :- "+e);
		}
	}
}
