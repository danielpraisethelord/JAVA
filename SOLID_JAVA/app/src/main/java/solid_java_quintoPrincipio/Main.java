package solid_java_quintoPrincipio;

public class Main {
    public static void main(String[] args) {
        ReportesGenerador reportesGenerador = new ReportesGenerador(new PDFGenerador());
        ReportesGenerador reportesGenerador2 = new ReportesGenerador(new CSVGenerador());

        reportesGenerador.generar();
        reportesGenerador2.generar();
    }
}
