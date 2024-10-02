package javaPackage;

import java.util.Scanner;

class Fibonacci{
public static void main(String args[])
{
  int n1=0, n2=1, n3, count;
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter the input");
  count = s1.nextInt();
  System.out.print(n1 +" "+ n2);
  for(int i=1; i<count; ++i)
{
 n3=n1+n2;
 System.out.print(" "+n3);
 n1=n2;
 n2=n3;
}
}
}