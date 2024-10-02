package javaPackage;

import java.util.Scanner;

public class Palindrome {  
	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n;            //It is the number variable to be checked for palindrome  
		  Scanner s1 = new Scanner(System.in);
		  System.out.println("Enter the input");
		  n = s1.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;             //getting remainder  4
		   sum=(sum*10)+r;     // (sum*10)+4
		   n=n/10;            // 45.4=454/10
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  