package org.howard.edu.lsp.midterm.question1;

public class Driver {
	public static void main(String[] args) {
		String text_string = "I love CSCI363";
		System.out.println("The original string is: " + text_string + ", and the excrypted string is: " + SecurityOps.encrypt(text_string));
		
		text_string = "I am Sameer";
		System.out.println("The original string is: " + text_string + ", and the excrypted string is: " + SecurityOps.encrypt(text_string));

	}
}
