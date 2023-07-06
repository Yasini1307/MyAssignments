package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=13;
		boolean isprime=true;
		for(int i=2;i<num;i++) {
		if(num%i==0) {
			isprime=false;
			break;
		}
		}
		if(isprime==true) {
			System.out.println("prime");
		}
		
		else {
			System.out.println("not");
		
		}
		}
		
	}
	
		
		
