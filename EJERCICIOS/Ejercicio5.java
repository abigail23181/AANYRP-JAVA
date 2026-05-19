import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaTotal = 0;
        char opcion;

        do {
            System.out.print("Ingrese un número: ");
            sumaTotal += sc.nextDouble();

            System.out.print("¿Desea ingresar otro? (s/n): ");
            opcion = sc.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');

        System.out.println("La suma total es: " + sumaTotal);
    }
}