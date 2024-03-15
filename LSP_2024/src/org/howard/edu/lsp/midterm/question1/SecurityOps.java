package org.howard.edu.lsp.midterm.question1;

/**
 * This class provides methods for security operations such as encryption.
 */
public class SecurityOps {
	

    /**
     * Encrypts the given text.
     *
     * @param text the text to be encrypted
     * @return the encrypted text
     */
	public static String encrypt(String text) {
        // Filter out non-alphanumeric characters from the text

		String filtered_text = "";
		String encrypted_text = "";
		for (int i = 0; i < text.length(); i++)  {
			char c = text.charAt(i);
			if ( Character.isDigit(c) || Character.isLetter(c) ) {
				filtered_text += c;
			}
		}
		
		for (int i = 0; i < filtered_text.length(); i+=2) {
			encrypted_text += filtered_text.charAt(i);
		}
		for (int i = 1; i < filtered_text.length(); i+=2) {
			encrypted_text += filtered_text.charAt(i);
		}
		
		return encrypted_text;
	}
}
