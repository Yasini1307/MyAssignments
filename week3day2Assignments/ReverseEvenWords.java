package week3day2Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] newarray=test.split(" ");
		for(int i=0; i<=newarray.length-1;i++) {
			if(i%2==0) {
				System.out.print(" "+newarray[i]+" ");
				
			}
			else{
				 char[] ch=newarray[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					System.out.print(ch[j]);
					
				}
			}
			
		}
		

	}

}
