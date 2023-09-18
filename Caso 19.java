import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la letra L: ");
        int altura = scanner.nextInt();
        int longitudPalo = altura / 2 + 1;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < longitudPalo; j++) {
                if (j == 0 || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
