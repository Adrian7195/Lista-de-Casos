import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int combinacionCorrecta = 1234; // Combinación correcta de la caja fuerte
        int intentos = 4; // Número de intentos permitidos

        System.out.println("Bienvenido a la caja fuerte.");

        while (intentos > 0) {
            System.out.print("Ingrese la combinación (4 cifras): ");
            int combinacionIngresada = input.nextInt();

            if (combinacionIngresada == combinacionCorrecta) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; // Salir del bucle si la combinación es correcta
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Le quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se han agotado los intentos. La caja fuerte permanece cerrada.");
                }
            }
        }

        input.close();
    }
}
