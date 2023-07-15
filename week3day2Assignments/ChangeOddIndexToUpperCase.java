package week3day2Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String odd = "changeme";
		int len=odd.length();
		
		 // a) Convert the String to character array
		char[] ch=odd.toCharArray();//{c,h,a,n,g,e,m,e}
		
		//Traverse through each character (using loop)
		for(int i=0; i<=len-1;i++)
		{
			if(i%2!=0)
			{   
				
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
				
			}
			else
				System.out.print(ch[i]);
			
		}
		//find the odd index within the loop (use mod operator)
		 
		//within the loop, change the character to uppercase, if the index is odd else don't change

	}

}
