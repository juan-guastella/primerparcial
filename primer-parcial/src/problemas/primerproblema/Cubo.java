package problemas.primerproblema;

public class Cubo extends FiguraTridimensional{

    //ATRIBUTOS

    public double lado;
    public static final int caras=6;

    //CONSTRUCTORES


    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado=1;
    }
    //METODOS


    @Override
    public String toString() {
        return "La figura es un " + getClass().getSimpleName();
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen=lado*lado*lado;
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        double lado2;
        lado2=lado*lado;
        superficie=6* lado2;
        return superficie;
    }
}
