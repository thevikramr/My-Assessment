package week2.day1;

public class calculator {

	public void addTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int e, int f) {
		int d=e-f;
		System.out.println(d);
	}
	public void multiplyTwoNumber(double i, double g) {
		double h=i*g;
		System.out.println(h);
	}
	public void divideTwoNumber(float x, float y) {
		float z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.addTwoNumber(17, 15);
		calc.subTwoNumber(100, 19);
		calc.multiplyTwoNumber(242.7, 363.4);
		calc.divideTwoNumber(32.34f, 45.34f);

	}

}
