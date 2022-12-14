package CodingEveryday;

class Calculator {

	int left;
	int right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public Calculator(int left, int right) {
		super();
		this.left = left;
		this.right = right;
	}

	public Calculator() {
	}

	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}

	
}

 public class CalculatorDemo4 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
		Calculator c3 = new Calculator(10, 20);
		c3.sum();
		c3.avg();
		
	}
	
	
}