package week1.Day2;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,7,7,5,9,2,3};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
		

	}

}
