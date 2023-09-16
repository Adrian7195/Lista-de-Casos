import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (40 * 12) + (horasExtras * 16);
        }
        System.out.println("El salario semanal es: " + salarioSemanal + " soles");
        scanner.close();
    }
}
