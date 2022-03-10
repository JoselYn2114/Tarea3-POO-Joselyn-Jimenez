public class Circulo extends Figura implements Comparable <Circulo> {

	private double radio;

	public Circulo (double radio) { 

		this.radio = radio;
	}

@Override
	public double calcularArea() {

		double area = Math.PI * (radio * radio);
		return area; 

	}

@Override
   public int cantLados () { 

	   return 0;
   }

	@Override
	public int compareTo(Circulo Circle) {

		double Cir = Circle. calcularArea ();
		double miArea = this.calcularArea ();

		int Lados = Circle.cantLados ();
		int misLados = cantLados ();


		if (miArea == Cir) {

			if (Lados != misLados) {
				return -1;
			}
			else {
				return 0;
			}
 
		}

		else if (miArea > Cir) {

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
	
}
