package javaPackage;

public class Reverse1{
public static void main(String args[])
{
 String name = "ankita";
 String reversedName = reversedString(name);
 
 System.out.println("Original name:" +name);
 System.out.println("Reversed name:" +reversedName);
}
 public static String reversedString(String input)
{
  StringBuilder reversed = new StringBuilder(input);
  reversed.reverse();
  return reversed.toString();
}


}