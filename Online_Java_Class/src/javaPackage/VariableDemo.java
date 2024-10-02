package javaPackage;

public class VariableDemo {
	int marks = 90;

	public void marks() {
		int marks;

	}

	public void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println("The marks are" +i);

	}

	public static void main(String[] args) throws Exception
	{
		int x = 0;
		System.out.println(x);
		VariableDemo vd = new VariableDemo();
		System.out.println(vd.marks);
		vd.show();
		vd.marks();
	}

}
