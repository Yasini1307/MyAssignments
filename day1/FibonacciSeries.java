package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0;
		int range=8;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=range;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
		
		

	}

}
