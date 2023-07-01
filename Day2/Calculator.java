package week1.Day2;

public class Calculator {
	public int addThreeNumbers(int a,int b,int c) {
		//a=10;
		//b=20;
		//c=30;
		int sum=a+b+c;
		
		return sum;
	}
	/*public float subTwoNumbers(int a,float b) {
		
		return a-b;
	}
   public int divideTwoNumbers(int a,int b) {
		
		return a/b;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ans= new Calculator();
		System.out.println(ans.addThreeNumbers(10, 10, 10));
		
		/*int sum=ans.addThreeNumbers(10,20, 30);
		System.out.println(sum);
		float sub=ans.subTwoNumbers(10,2.5f);
		System.out.println(sub);
		int div=ans.divideTwoNumbers(50,5);
		System.out.println(div);*/
				}

}