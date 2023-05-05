package aOOPS;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber (int r , int im) {
		this.real = r;
		this.imaginary = im;
	}
	
	public void setReal(int r) {
		this.real = r;
	}
	
	public void setImaginary(int im) {
		this.imaginary = im;
	}
	
	public int getReal() {
		return this.real;
	}
	public int getImaginary() {
		return this.imaginary;
	}
	
	public void print() {
		System.out.println(real + " " + "+"+ " " + "i"+ imaginary );
	}
	
	public void add(ComplexNumber comp) {            
		this.real = this.real + comp.real;
		this.imaginary = this.imaginary + comp.imaginary;
	}
	
	public void multiply (ComplexNumber comp) {
			int rr = this.real;
	        int ii = this.imaginary;
			this.real = rr * comp.real - ii * comp.imaginary;
			this.imaginary = rr * comp.imaginary + ii * comp.real;
	}
	
	public static ComplexNumber add(ComplexNumber c1 , ComplexNumber c2) {
		int r = c1.real + c2.imaginary;
		int i = c1.imaginary+ c2.imaginary;
		ComplexNumber c3 = new ComplexNumber(r, i);
		return c3;
	}
	
	
	
	
}
