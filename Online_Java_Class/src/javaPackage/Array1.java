package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4};
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) 
		{
			sum = sum+ arr[i];	
		}
		System.out.println("Sum of the elements of an array is" +sum);

	}

}
