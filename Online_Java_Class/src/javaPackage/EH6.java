package javaPackage;

public class EH6 {

	public static void main(String[] args) {
		try {
			int i = 20 / 2;
		} finally {
			System.out.println("Finally block will always execute");
			try {
				int i = 10/0;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("Exception handeled");
		}

	}

}
