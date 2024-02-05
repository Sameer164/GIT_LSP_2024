package org.howard.edu.lsp.assignment2;

import java.io.File;

public class Main {
  public static void main(String[] args) {
	String currentDir = System.getProperty("user.dir");
    FileHandler fileHandler = new FileHandler(currentDir + "/LSP_2024/src/org/howard/edu/lsp/assignment2/Files/words.txt");
    fileHandler.PrintStats();
  }
}	
