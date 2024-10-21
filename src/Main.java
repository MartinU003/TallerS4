import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Introduce el número de días de la estadía: ");
        int numeroDias = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce el tipo de habitación (Individual, Doble, Suite): ");
        String tipoHabitacion = scanner.nextLine();

        Reserva reserva = new Reserva(nombreCliente, numeroDias, tipoHabitacion);

        int opcion;
        do {
            System.out.println("\n--- Gestión de la Reserva ---");
            System.out.println("1. Mostrar información de la reserva");
            System.out.println("2. Confirmar o cancelar reserva");
            System.out.println("3. Actualizar información de la reserva");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    reserva.mostrarInformacion();
                    break;
                case 2:
                    reserva.cambiarEstado();
                    System.out.println("El estado de la reserva ha sido actualizado.");
                    break;
                case 3:
                    System.out.print("Introduce el nuevo nombre del cliente (deja en blanco para no cambiar): ");
                    String nuevoNombre = scanner.nextLine();
                    if (!nuevoNombre.isBlank()) {
                        reserva.setNombreCliente(nuevoNombre);
                    }

                    System.out.print("Introduce el nuevo número de días (0 para no cambiar): ");
                    int nuevosDias = scanner.nextInt();
                    if (nuevosDias != 0) {
                        reserva.setNumeroDias(nuevosDias);
                    }
                    scanner.nextLine();

                    System.out.print("Introduce el nuevo tipo de habitación (deja en blanco para no cambiar): ");
                    String nuevoTipoHabitacion = scanner.nextLine();
                    if (!nuevoTipoHabitacion.isBlank()) {
                        reserva.setTipoHabitacion(nuevoTipoHabitacion);
                    }

                    System.out.println("La información de la reserva ha sido actualizada.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();

    }
}