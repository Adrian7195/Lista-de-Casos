import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la hora (solo la hora, sin minutos): ");
        int hora = input.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("Buenos días");
        } else if (hora >= 12 && hora < 21) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        input.close();
    }
}

