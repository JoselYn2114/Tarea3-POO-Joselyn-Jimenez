public class Triangulo extends Figura implements Comparable <Triangulo> { 

	private double altura;

	private double base;

	public Triangulo (int altura, int base) { //constructor
		this.altura = altura;
		this.base = base;
	}

	@Override
	public int compareTo(Triangulo Triangle) {

		double Tri = Triangle.calcularArea();
		double miArea = this.calcularArea ();

		int Lados = Triangle.cantLados ();
		int misLados = cantLados ();

		if (miArea == Tri) {

			if (Lados != misLados) {
				return -1; 
			}
			else {
				return 0; 
			}

		}

		else if (miArea > Tri) {

			if (Lados != misLados) {
				return -1;
			}

			else {
				return 1;
			}
		}
		
	    else {
			return -1;
		}

	}

	@Override
	public double calcularArea() {

		double area = base * altura / 2;
		return area;
	}

	@Override
	public int cantLados() {
		return 3; 
	}

}