package solid_java_tercerPrincipio;

/*En esta clase se debe implementar el metodo de la clase padre
 * con un comportamiento independiente
 */
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    } 
    
    /*
    @Override
    public void volar() throws Exception{
        throw new Exception("El gato no puede volar");
    }
    */
}
