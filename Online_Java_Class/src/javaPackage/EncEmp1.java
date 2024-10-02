package javaPackage;

public class EncEmp1 extends EncEmp{
	
	

	@Override
	public int getEmpId() {
		
		return super.getEmpId();
	}

	@Override
	public void setEmpId(int empId) {
		
		super.setEmpId(empId);
	}

	@Override
	public String getEmpName() {
		
		return super.getEmpName();
	}

	@Override
	public void setEmpName(String empName) {
		
		super.setEmpName(empName);
	}

	@Override
	public int getSalary() {
		
		return super.getSalary();
	}

	@Override
	public void setSalary(int salary) {
		
		super.setSalary(salary);
	}

	public static void main(String[] args) {
		EncEmp1 emp1 = new EncEmp1();
		emp1.setEmpId(100);
        emp1.setEmpName("Abc");
        emp1.setSalary(5);
        
        System.out.println("The Employee ID is:" + emp1.getEmpId());
        System.out.println("The Employee Name is:" + emp1.getEmpName());
        System.out.println("The Employee Salary is:" + emp1.getSalary());
        
        EncEmp1 emp2 = new EncEmp1();
		emp2.setEmpId(200);
        emp2.setEmpName("Def");
        emp2.setSalary(10);
        
        System.out.println("The Employee ID is:" + emp2.getEmpId());
        System.out.println("The Employee Name is:" + emp2.getEmpName());
        System.out.println("The Employee Salary is:" + emp2.getSalary());
		
		

	}

}
