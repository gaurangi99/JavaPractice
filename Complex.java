public class Complex {
	private float realPart;
	private float imaginaryPart;

	public Complex(float real, float imaginary) {
		realPart = real;
		imaginaryPart = imaginary;
	}

	public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}

	public float getReal() {
		return realPart;
	}

	public void setReal(float real) {
		this.realPart = real;
	}

	public float getImaginary() {
		return imaginaryPart;
	}

	public void setImaginary(float imaginary) {
		this.imaginaryPart = imaginary;
	}

	public void addComplex(Complex c, Complex c1) {
		realPart = c.realPart + c1.realPart;
		imaginaryPart = c.imaginaryPart + c1.imaginaryPart;
		// setReal(real);
		// setImaginary(imaginary);
	}

	public void subComplex(Complex c, Complex c1) {
		realPart = c.realPart - c1.realPart;
		imaginaryPart = c.imaginaryPart - c1.imaginaryPart;
		// setReal(real);
		// setImaginary(imaginary);
	}

	public String toString() {
		return String.format("(%f,%f)", getReal(), getImaginary());
	}
}
