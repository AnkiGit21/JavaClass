package javaPackage;

public class ReverseString {

	public static void main(String[] args) {
     String name = "ankita";
     
     String reversedName = reverseString(name);
     System.out.println("Original Name: " + name);
     System.out.println("Reversed Name: " + reversedName);
 }
	public static String reverseString(String input) {
        // Create a StringBuilder initialized with the input string
        StringBuilder reversed = new StringBuilder(input);

        // Use the reverse method of StringBuilder
         reversed.reverse();

        // Convert the reversed StringBuilder back to a String and return it
        return reversed.toString();
    }

}
