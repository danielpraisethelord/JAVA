package debug;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int sum = suma(a,b);

        System.out.println("La suma de " + a + " + " + b + " es: " + sum);
    }

    private static int suma (int x, int y) {
        int result = x + y;

        int extraValue = 10;
        result += extraValue;

        return result;
    }

}
