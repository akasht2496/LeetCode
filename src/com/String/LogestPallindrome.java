package com.String;

import java.util.HashSet;

public class LogestPallindrome {
// add comment
	public static void main(String[] args) {
		String s="aabbccssfdiop";
		char[] ch=s.toCharArray();
		int count=0;
		 
		HashSet<Character> set1=new HashSet<>();
		for(char c :ch) {
			if(set1.contains(c)) {
				count+=2;
				set1.remove(c);
			}else {
				set1.add(c);
			}
		}
		if(!set1.isEmpty()) {
			count+=1;
		}
	System.out.println(count);
	}
	
	
}
