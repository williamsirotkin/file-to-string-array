import java.io.*;

/**
 * Blueprint for testing file to string array program.
 */
public class Tester {

    /**
     * The only argument to this program should be a single text file. 
     */
    public static void main(String[] args) {
	FileToStringArray ftsa = new FileToStringArray();
	String[] strArray = ftsa.fileToStringArray(new File(args[0]));
	printStringArray(strArray);
    } // main

    /**
     * Prints a given string array to std output. 
     * Method is private because only the main function in this class should ever call it
     *
     * @param strArray the string array to be printed
     */
    private static void printStringArray(String[] strArray) {
	for (int i = 0; i < strArray.length; i++) {
	    System.out.println(strArray[i]);
	} // for
    } // printStringArray
} // Tester
