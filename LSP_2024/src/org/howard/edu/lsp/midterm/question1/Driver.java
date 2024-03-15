package org.howard.edu.lsp.midterm.question1;

/**
 * This class serves as a driver to test the functionality of the SecurityOps class.
 */
public class Driver {
    /**
     * The main method that executes the testing of the SecurityOps class.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		String text_string = "I love CSCI363";
		System.out.println("The original string is: " + text_string + ", and the excrypted string is: " + SecurityOps.encrypt(text_string));
		
		text_string = "I am Sameer";
		System.out.println("The original string is: " + text_string + ", and the excrypted string is: " + SecurityOps.encrypt(text_string));

	}
}
