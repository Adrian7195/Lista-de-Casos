import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero de hasta 5 dígitos: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            numero = -numero;
        }
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
        scanner.close();
    }
}
