import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "s";

        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Número 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Número 2: ");
            double n2 = sc.nextDouble();

            System.out.println("La suma es: " + (n1 + n2));

            System.out.print("¿Desea continuar? (si/no): ");
            respuesta = sc.next();
        }
    }
}