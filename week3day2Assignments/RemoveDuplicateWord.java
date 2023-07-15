package week3day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "We learn java basics as part of java sessions in java week1";
        String[] ch=str.split(" ");
        
        Set<String> unique=new LinkedHashSet<String>();
        for(int i=0;i<=ch.length-1;i++) {
        	unique.add(ch[i]);
        }
        System.out.println(unique);
	}
}

	