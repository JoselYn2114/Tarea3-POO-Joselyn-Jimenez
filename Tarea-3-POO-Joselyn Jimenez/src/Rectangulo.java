public class Rectangulo extends Figura implements Comparable<Figura> {
    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura){
        base   = pBase;
        altura = pAltura;
    }


    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public int cantLados() {
        return 0;
    }

    @Override
    public int compareTo(Figura rectPorComparar) {

        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea==areaPorComparar){
            return 0;
        }
        else if(miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }

}