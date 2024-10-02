package javaPackage;

public class SubString {
    public static void main(String[] args) {
        // Given input string
        String inputString = "fejcjcdefiwkdhwhddef";
        // Substring to count
        String substring = "def";
        
        // Initialize count
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = inputString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move past the last found substring
        }

        // Display the count
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the given input string.");
    }
}

