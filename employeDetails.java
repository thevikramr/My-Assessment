package week2.day1;

public class employeDetails {

	public void employeNmae(String empName) {
		System.out.println("empName: " +empName);
	}
	public void employeID(int empID) {
		System.out.println("empID: " +empID);
	}
	public void employeAddress(String employeAddress) {
		System.out.println("employeAddress: " +employeAddress);
	}
	public void employeSalary(double employeSalary) {
		System.out.println("employeSalary: " +employeSalary);
	}
	public void employeMobileNumber(long employeMobileNumber) {
		System.out.println("employeMobileNumber: " +employeMobileNumber);
	}

	public static void main(String[] args) {
		employeDetails vikki=new employeDetails();
		vikki.employeNmae ("Vikram R");
		vikki.employeID(20757);
		vikki.employeAddress("Thiruvannamalai");
		vikki.employeSalary(25000);
		vikki.employeMobileNumber(7200316091L);
	}
}
