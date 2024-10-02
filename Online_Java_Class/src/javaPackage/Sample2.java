package javaPackage;

public class Sample2  {
	 public static void main(String[] args) {
		 int x = 0;
		 int y = 0;

		 for (x = 0; x < 5; x++) {

		 for (y = 0; y < 5; y++) {

		 if (x + y > 5) {
		 break;
		 }

		 }
		 }

		 System.out.println(x + ":" + y);
		 }
		}