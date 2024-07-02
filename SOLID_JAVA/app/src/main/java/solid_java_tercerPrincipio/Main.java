package solid_java_tercerPrincipio;

public class Main {
    
    public static void main(String[] args) {
        Perro perro = new Perro();    
        hacerSonidoDelAnimal(perro);
    }

    public static void hacerSonidoDelAnimal(Animal animal) {
        animal.hacerSonido();
    }

    /* 
    Esto rompe con el principio, ya que dependiendo del Animal que se pase como parámetro
    se puede enviar una excepción, y esto no es deseable, por lo tanto tenemos un error de
    diseño de Software
    
    public static void hacerVolarAlAnimal(Animal animal) {
        animal.volar();
    }
    */
}
