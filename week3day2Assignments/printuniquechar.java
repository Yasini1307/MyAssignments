package week3day2Assignments;

import java.util.HashSet;
import java.util.Set;

public class printuniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="yasini";
		char[] ch=name.toCharArray();
		Set<Character> unique=new HashSet<Character>();
		for(int i=0;i<=ch.length-1;i++) {
			unique.add(ch[i]);
		}
		System.out.println(unique);
		

	}

}
