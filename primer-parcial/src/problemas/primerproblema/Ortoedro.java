package problemas.primerproblema;

public class Ortoedro extends FiguraTridimensional{

    //ATRIBUTOS

    public double ancho;
    public double base;
    public double altura;
    public static final int caras=6;

    //CONSTRUCTORES

    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }


    //METODOS


    public String toString() {
        return "La figura es un " + getClass().getSimpleName();
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen= ancho*base*altura;
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie= 2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);
        return superficie;
    }
}
