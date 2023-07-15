package week3day2Assignments;



public class Palindrome {
	public static void main(String[] args) {
		//a) Declare A String value as"madam"
		String name="madam";
        int len=name.length();
	    //b) Declare another String rev value as ""
		String rev="";
		
		//c) Iterate over the String in reverse order
		for(int i=len-1;i>=0;i--){
		//d) Add the char into rev
		rev=rev+name.charAt(i);
			
		}
		if(rev.equals(name)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
	
	//e) Compare the original String with the reversed String, if it is same then print palinDrome 

	//Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	}

}
