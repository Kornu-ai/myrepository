package Exanm;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "list";
		String s2 =  "test";
		
		if(s1.length() == s2.length()) {
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			
			if(Arrays.equals(str1, str2) == true) {
				System.out.println("anagrams");
			}
			else {
				System.out.println("not anagrams");
			}
			
		}
			
	}

}