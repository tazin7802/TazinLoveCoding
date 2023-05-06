package com.animal;

public class Reverse {

	public static void main(String[] args) {
		
		//String reunion = new String ("I Love you");
		//String newobj = new StringBuffer(reunion).reverse().toString();
		//System.out.println(newobj);
		
		
		String s = "Tazin";
		String reverse ="";
		for (int i= s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
	

}
