package solid_java_tercerPrincipio;

/*En esta clase se debe implementar el metodo de la clase padre
 * con un comportamiento independiente
 */
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    /*
    @Override
    public void volar() throws Exception{
        throw new Exception("El perro no puede volar");
    }
    */
}
