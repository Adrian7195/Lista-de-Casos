import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (lunes = 1, martes = 2, miercoles = 3, jueves = 4, viernes = 5): ");
        int diaSemana = input.nextInt();

        if (diaSemana < 1 || diaSemana > 5) {
            System.out.println("Día de la semana no válido.");
            input.close();
            return;
        }

        System.out.print("Ingrese la hora (horas): ");
        int horas = input.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = input.nextInt();

        int minutosHastaFinDeSemana = 0;

        if (diaSemana < 5) { // Si no es viernes
            minutosHastaFinDeSemana = ((4 - diaSemana) * 24 * 60) + ((15 - horas) * 60) - minutos;
        } else if (diaSemana == 5) { // Si es viernes
            if (horas < 15) {
                minutosHastaFinDeSemana = ((15 - horas) * 60) - minutos;
            }
        }

        System.out.println("Minutos restantes hasta el fin de semana: " + minutosHastaFinDeSemana + " minutos");
        input.close();
    }
}

