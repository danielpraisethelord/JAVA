package solid_java_tercerPrincipio;

/*En esta clase se debe implementar el metodo de la clase padre
 * con un comportamiento independiente
 */
public class Pajaro extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta");
    }    

    public void volar() throws Exception{
        System.out.println("El pajaro vuela");
    }
}
