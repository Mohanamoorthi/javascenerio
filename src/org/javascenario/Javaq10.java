package org.javascenario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Javaq10 {
	  // Generic function to convert an Array to List
    public static <T> List<T> convertArrayToList(T array[])
    {
         // Create an empty List
        List<T> list = new ArrayList<>();
          // Iterate through the array
        for (T t : array) {
            // Add each element into the list
           list.add(t);
        }
          // Return the converted List
        return list;
    }
	public static void main(String[] args) {
		  		        // Create an Array
		        String array[] = { "Geeks", "forGeeks",
		                                   "A Computer Portal" };
		  		       // Print the Array
		        System.out.println("Array: " 
		                       + Arrays.toString(array));
		  		        // convert the Array to List
		        List<String>
		            list = convertArrayToList(array);
		  		        // Print the List
		        System.out.println("List: " + list);
		    }
		
		Set<String> set = new HashSet<>();
			//	set.addAll(list);
	}

