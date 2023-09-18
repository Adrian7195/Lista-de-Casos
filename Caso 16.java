import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        System.out.println("Ingrese diez números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);

        input.close();
    }
}

