package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 13;
		boolean flag=false;
		for(int i=2;i<=number/2;i++) {
		if(number%i==0) {
			flag=true;
			
		}
			
		}
		if(!flag) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime");
		}
		

	}

}
