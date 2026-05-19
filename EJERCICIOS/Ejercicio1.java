import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el color de la etiqueta (verde, roja, azul, dorada): ");
        String etiqueta = sc.next().toLowerCase();

        double descuento = switch (etiqueta) {
            case "verde" -> 0.05;
            case "roja" -> 0.10;
            case "azul" -> 0.15;
            case "dorada" -> 0.20;
            default -> 0;

            // Estructura condicional para determinar el porcentaje
        };

        double montoDescuento = precio * descuento;
        double total = precio - montoDescuento;

        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("Monto a pagar: $" + total);
    }
}
