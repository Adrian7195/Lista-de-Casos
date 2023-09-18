import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, cantidad = 0, sumaImpares = 0, mayorPar = Integer.MIN_VALUE;

        System.out.println("Ingrese números (ingrese un número negativo para finalizar):");

        while ((numero = input.nextInt()) >= 0) {
            cantidad++;

            if (numero % 2 != 0) {
                sumaImpares += numero;
            } else {
                mayorPar = Math.max(mayorPar, numero);
            }
        }

        input.close();

        if (cantidad > 0) {
            double mediaImpares = (double) sumaImpares / cantidad;
            System.out.println("Cantidad de números introducidos: " + cantidad);
            System.out.println("Media de números impares: " + mediaImpares);
            System.out.println("Mayor número par: " + (mayorPar == Integer.MIN_VALUE ? "N/A" : mayorPar));
        } else {
            System.out.println("No se introdujeron números.");
        }
    }
}

