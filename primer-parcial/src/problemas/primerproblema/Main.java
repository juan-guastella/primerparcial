package problemas.primerproblema;

public class Main {

    public static void main(String[] args) {
        //INSTANCIO OBJETOS
        Ortoedro ortoedro= new Ortoedro(2, 6, 1);
        TetraedroRegular tetraedroRegular= new TetraedroRegular(1);
        Cubo cubo = new Cubo(6);

        //METODOS TO STRING

        System.out.println(ortoedro.toString());
        System.out.println(tetraedroRegular.toString());
        System.out.println(cubo.toString());

        //METODOS AREA

        System.out.println("El volumen del " +  ortoedro.getClass().getSimpleName()  + " es: " + ortoedro.calcularVolumen());
        System.out.println("El volumen del " +  tetraedroRegular.getClass().getSimpleName()  + " es: " + tetraedroRegular.calcularVolumen());
        System.out.println("El volumen del " +  cubo.getClass().getSimpleName()  + " cubo es: " + cubo.calcularVolumen());

        //METODOS SUPERFICIE

        System.out.println("La superficie del " +  ortoedro.getClass().getSimpleName()  + " es: " + ortoedro.calcularSuperficie());
        System.out.println("La superficie del " +  tetraedroRegular.getClass().getSimpleName()  + " es: " + tetraedroRegular.calcularSuperficie());
        System.out.println("La superficie del " +  cubo.getClass().getSimpleName()  + " es: " + cubo.calcularSuperficie());

    }
}
