import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();
        long sumaPares = 0;
        int cantidadPares = 0;
        String numeroStr = String.valueOf(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            if (digito % 2 == 0) {
                sumaPares += digito;
                cantidadPares++;
            }
        }
        System.out.println("Suma de los dígitos pares: " + sumaPares);
        System.out.println("Dígitos pares: " + cantidadPares);
        scanner.close();
    }
}