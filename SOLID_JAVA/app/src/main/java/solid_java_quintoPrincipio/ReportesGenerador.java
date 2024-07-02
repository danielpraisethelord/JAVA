package solid_java_quintoPrincipio;

/* CLASE DE ALTO NIVEL
 * Adminsitra las clases
 */
public class ReportesGenerador {
    /*
    private final PDFGenerador pdfGenerador;
    private final CSVGenerador csvGenerador;
    */
    /* 
        Por cada nueva dependencia que queramos, de alguna manera se tendra que añadir como atributo a nuestra clase
        y además llamar al metodo en concreto para ejecutar esa clase
    
        private final ExcelGenerador excelGenerador;
        private final WordGenerador wordGenerador;
        etc ...
        ...
        ...

        public ReportesGenerador(Generador generador) {
        this.pdfGenerador = new PDFGenerador();
        this.csvGenerador = new CSVGenerador();
        etc ...
        ...
        ...
        }

    */
    /* Para solucionar esto solo inyectamos la dependencia Generador */

    private final Generador generador;

    public ReportesGenerador(Generador generador) {
        this.generador = generador;
    }

    /*
    public void generarPdf() {

    }

    public void generarCSV() {

    }

    etc ...
    ...
    */

    public void generar() {
        generador.exportar();
    }
}
