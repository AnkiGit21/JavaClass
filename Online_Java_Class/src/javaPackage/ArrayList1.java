package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// Creating ArrayList
		ArrayList <Object> obj = new ArrayList<Object>();
		
		// Adding objects in ArrayList
        obj.add(7);
        obj.add("Welcome");
        obj.add(7.9);
        obj.add('a');
        obj.add(7<9);
        
        // Print ArrayList item 1st way
        System.out.println(obj);
        
       // Print ArrayList item 2nd way (Using for each loop)
        for (Object acd : obj) {
        	System.out.println("for each loop:" + acd);
        	
       // Print ArrayList item 2nd way (Using for while loop)
        Iterator abc = obj.iterator();
        while (abc.hasNext())
        {
        	System.out.println("While loop:" + abc.next());
        }
           
       }
	}

}
