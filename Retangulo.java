package atividadesPDS;

public class Retangulo {
	double base;
	double altura;
	
 public void valores (double base, double altura) {
	this.altura = altura;
	this.base = base;
 }
 
 public double perimetro () {
	 return 2*altura+base;
 }
 
 public double area () {
	 return base*altura;
 }
 
}
