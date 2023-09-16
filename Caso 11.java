import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la hora (formato 24 horas): ");
        int horas = input.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = input.nextInt();
        int segundosHastaMedianoche = (24 * 60 * 60) - (horas * 60 * 60 + minutos * 60);

        System.out.println("Segundos restantes hasta medianoche: " + segundosHastaMedianoche + " segundos");

        input.close();
    }
}
