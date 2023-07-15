package week3day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PayPal India";
		//Convert it into a character array
		char[] ch=str.toCharArray();
		//Declare a Set as charSet for Character
		Set<Character> charset=new LinkedHashSet<Character>();
		//Declare a Set as dupCharSet for duplicate Character
        Set<Character> dupCharSet=new LinkedHashSet<Character>();
        //Iterate character array and add it into charSet
        for(int i=0;i<=ch.length-1;i++) {
        	charset.add(ch[i]);
        }
        System.out.println(charset);
		

	}

}
