package week1.Day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8,10};
		int len=arr.length;
		Arrays.sort(arr);//used to calculate length of an array
		for(int i=1;i<len;i++) {
			if(i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
		}

	}

}
