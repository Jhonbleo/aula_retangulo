package entities;

public class Retangulo {
	
	public double retA;
	public double retL;
	
	public double area() {
		double area = retA * retL;
		return area;
		
	}
	public double perimetro() {
	double perimetro = (retA * 2.00) + (retL * 2.00);
	return perimetro;
	}
	
}