
import java.util.*;
import java.io.*;
public class Main{

public static void myCode(String str) {
        int num_rows = Integer.parseInt(str);

        for (int i = 1; i <= num_rows; i++) {
            // Print spaces before the stars
            for (int j = 0; j < num_rows - i; j++) {
                System.out.print(" ");
            }

            // Print the stars for the current row
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage:
        myCode("5");
    }
}
