// IntegerToBinary.java
// Kameron Ibraheem
// Lab 05: IntegerToBinary
//
//

import java.util.Scanner;

public class IntegerToBinary{
    public static String intToBinary(int x) {
		
        String binary = ""; // empty string for binary

        // convert integer to binary
        while (x > 0) {
            binary += (x % 2); // Append the remainder (0 or 1) to the string
            x = x / 2; // Divide x by 2
        }

        // Reverse the string to get the correct binary order
        return reverseString(binary);
    }


    public static String reverseString(String input) {
        String reversed = ""; // an empty string for the reversed string
        // Loop through the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // append each character to the reversed string
        }
        return reversed; // return the reversed string
    }

    public static void main(String[] args) {
        // Calling intToBinary method
        System.out.println("Binary: " + intToBinary(5)); // 0b101
        System.out.println("Binary: " + intToBinary(10)); // 0b1010
        System.out.println("Binary: " + intToBinary(15)); // 0b1111
		
		String first = reverseString("apple");
        System.out.println(first);
    }
}
