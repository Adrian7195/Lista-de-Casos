import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Megabytes (MB) a convertir: ");

        if (input.hasNextDouble()) {
            double megabytes = input.nextDouble();

            double kilobytes = megabytes * 1024;

            System.out.println(megabytes + " Megabytes (MB) equivale a " + kilobytes + " Kilobytes (KB).");
        } else {
            System.out.println("Error: Ingrese un valor válido para los Megabytes (MB).");
        }

        input.close();
    }
}



