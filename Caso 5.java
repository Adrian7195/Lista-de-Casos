import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario el número de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas a la semana: ");
        if (input.hasNextInt()) {
            int horasTrabajadas = input.nextInt();

            // Tarifa por hora
            double tarifaPorHora = 12.0;

            // Calcular el salario semanal
            double salarioSemanal = horasTrabajadas * tarifaPorHora;

            // Mostrar el salario semanal en euros
            System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros");
        } else {
            System.out.println("Error: Ingrese un valor válido para el número de horas trabajadas.");
        }
    }
}

