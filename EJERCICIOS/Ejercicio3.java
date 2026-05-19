import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        while (inicio <= fin) {
            if (inicio % 2 == 0) {
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}