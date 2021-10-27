package problemas.primerproblema;

public class TetraedroRegular extends FiguraTridimensional{


    //ATRIBUTOS
    public double arista;
    public static final int caras=4;

    //CONSTRUCTORES
    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        this.arista=1;
    }

    //METODOS

    public String toString() {
        return "La figura es un " + getClass().getSimpleName();
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        double arista3;
        arista3=arista*arista*arista;
        volumen=Math.sqrt(2) * arista3 / 12;
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        double arista2;
        arista2=arista*arista;
        superficie= Math.sqrt(3) * arista2;
        return superficie;
    }
}
