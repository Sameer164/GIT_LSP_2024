package org.howard.edu.lsp.assignment2;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.HashMap;

public class FileHandler {

  private Scanner fileScanner;
  private String fileName;
  private Scanner EndScanner;
  private Helper helper;
  private HashMap<String, Integer> counts;
  private Integer MaxLength = 0; // For Padding the Output.

  public FileHandler(String fileName) {

    try {
      this.fileScanner = new Scanner(Paths.get(fileName));
      System.out.println("File Connection Established!");
      counts = new HashMap<>();
      this.fileName = fileName;
      this.helper = new Helper();


    } catch (Exception e) {
      System.out.println("File Can't be Opened!");
      return;
    }
    
      }

  public void CountInstance() {
    while (this.fileScanner.hasNextLine()) {
      String line = this.fileScanner.nextLine();
      String[] words = line.split("[\\s']");
      for (int i = 0; i < words.length; i++) {
        if (words[i].length() > 3 && !this.helper.isInteger(words[i])) {
          helper.addToCounts(counts, words[i]);
          this.MaxLength = Math.max(this.MaxLength, words[i].length());
        }
      }
    }

  }

  public void PrintStats() {
	this.CountInstance();

    try {
      this.EndScanner = new Scanner(Paths.get(this.fileName));
    } catch (Exception e) {
      System.out.println("Can't Read All the Contents of the File at once.");
      return;
    } 
    
    String wholeFile = EndScanner.useDelimiter("\\Z").next();
    System.out.println("This is the Original Content of the File Provided: \n" + wholeFile + "\n\n"
        + "Word Count is Printed below: \n\n");
    for (String word : this.counts.keySet()) {
      System.out.printf("%-" + this.MaxLength + "s  %s%n", word, (""+counts.get(word)));
    }

  }

}
