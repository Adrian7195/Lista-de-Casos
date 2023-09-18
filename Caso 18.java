import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero1 = input.nextInt();

        System.out.print("Ingrese otro número entero (divisor): ");
        int numero2 = input.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Ambos números deben ser enteros positivos.");
        } else {
            System.out.println("Números enteros positivos menores a " + numero1 + " y no divisibles por " + numero2 + ":");
            
            for (int i = 1; i < numero1; i++) {
                if (i % numero2 != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}


