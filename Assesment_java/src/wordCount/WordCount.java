package wordCount;


import java.io.*;
import java.util.Scanner;
public class WordCount {

	 public static void main(String[] args) {
	        File file = new File("D:\\MY LMS\\Module 12  CPL\\Source Code\\Assesment\\src\\wordCount\\example.txt"); // Make sure this file exists
	        try {
	            Scanner scanner = new Scanner(file);
	            int wordCount = 0;
	            while (scanner.hasNext()) {
	                scanner.next();
	                wordCount++;
	            }
	            scanner.close();
	            System.out.println("Number of words: " + wordCount);
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	    }

}
