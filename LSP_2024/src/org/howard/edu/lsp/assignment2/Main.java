package org.howard.edu.lsp.assignment2;

import java.io.File;

public class Main {
  public static void main(String[] args) {

    FileHandler fileHandler = new FileHandler("/Users/sameer/git/GIT_LSP_2024/LSP_2024/src/org/howard/edu/lsp/assignment2/Files/words.txt");
    fileHandler.PrintStats();
  }
}	
