package javaPackage;

import java.util.Scanner;

public class SwapNum2 {

	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter the value of x & y:");
		Scanner s1 = new Scanner(System.in);
		x = s1.nextInt();
		y = s1.nextInt();
		System.out.println("Before swapping:\n x:" +x+ "\n y:" +y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping:\n x:" +x+ "\n y:" +y);
	}

}
