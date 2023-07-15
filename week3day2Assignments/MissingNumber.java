package week3day2Assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9,10};
		
		Set<Integer> num=new TreeSet<Integer>();
		//iterate
		for(int i=0;i<=arr.length-1;i++) {
			num.add(arr[i]);
			//compare 
			
			if(arr[i]+1!=arr[i+1]) {
				System.out.println(arr[i]+1);
				break;
			}
			
		}
		
		
		
	}

}
