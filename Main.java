
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonaManager manager = new PersonaManager();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    manager.agregarPersonas();
                    break;
                case 2:
                    System.out.println(manager.obtenerNombresYGeneros());
                    break;
                case 3:
                    System.out.printf("Promedio de edades: %.2f%n",
                            manager.calcularPromedioEdades());
                    break;
                case 4:
                    System.out.println("Personas masculinas: "
                            + manager.contarMasculinos());
                    break;
                case 5:
                    System.out.println("Personas femeninas: "
                            + manager.contarFemeninos());
                    break;
                case 6:
                    System.out.println("Tamaño de la estructura: "
                            + manager.tamañoEstructura() + " persona/s");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            if (opcion != 7) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Agregar persona");
        System.out.println("2. Mostrar nombres y géneros");
        System.out.println("3. Calcular promedio de edades");
        System.out.println("4. Contar personas masculinas");
        System.out.println("5. Contar personas femeninas");
        System.out.println("6. Tamaño de la estructura");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
