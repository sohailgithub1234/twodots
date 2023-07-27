
import java.util.*;
import java.io.*;


public class Main {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String str  = s.nextLine(); // do not change this

    // you code will be inside this main method
    // to view the output, just print the string

    // below is a sample program output
    char[] characters = str.toCharArray();
        // Create an array to store the counts of each character.
        int[] counts = new int[26];
        // Iterate over the characters and increment the count of each character.
        for (int i = 0; i < characters.length; i++) {
            counts[characters[i] - 'a']++;
        }
        // Iterate over the characters and print the first character that has a count of 1.
        for (int i = 0; i < characters.length; i++) {
            if (counts[characters[i] - 'a'] == 1) {
                System.out.println(characters[i]);
                return;
            }
        }
    }
  }
