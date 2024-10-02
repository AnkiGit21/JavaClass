package javaPackage;

import java.util.Scanner;

public class SwapNum1 {

	public static void main(String[] args) {
		int x,y;
		
		System.out.println("Enter the valye of x & y");
		Scanner s1 = new Scanner(System.in);
		
		x = s1.nextInt();
		y = s1.nextInt();
		
		System.out.println("Before swapping\n x:"+x+"\n y:" +y);
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("After swapping\n x:"+x+"\n y:" +y);
	}

}
