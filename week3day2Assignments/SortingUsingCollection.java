package week3day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String arr[]= {"Wipro", "HCL", "CTS", "Aspire System"};
		
		List<String> array=new ArrayList<String>();
		//// Iterate it in the reverse order
		for(int i=arr.length-1;i>=0;i--) {
		array.add(arr[i]);
		}
		Collections.sort(array);
		System.out.println(array);
			
		

	
	}
}
