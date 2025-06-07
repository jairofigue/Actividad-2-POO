
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaManager {

    private List<Persona> personas;
    private Scanner scanner;

    public PersonaManager() {
        personas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para agregar personas
    public void agregarPersonas() {

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Género (MASCULINO/FEMENINO): ");
        String genero = scanner.nextLine().toUpperCase();

        System.out.print("Edad (en años): ");
        int edad = Integer.parseInt(scanner.nextLine());

        personas.add(new Persona(nombre, apellido, Genero.valueOf(genero), edad));

    }

    // Método para retornar nombres y géneros
    public String obtenerNombresYGeneros() {
        String resultado = "Nombres y géneros:\n";

        for (Persona persona : personas) {
            resultado += persona.getNombre() + " - " + persona.getGenero() + "\n";
        }

        return resultado;
    }

    // Método para calcular promedio de edades
    public double calcularPromedioEdades() {
        if (personas.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        return (double) suma / personas.size();
    }

    // Método para contar personas masculinas
    public int contarMasculinos() {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getGenero() == Genero.MASCULINO) {
                count++;
            }
        }
        return count;
    }

    // Método para contar personas femeninas
    public int contarFemeninos() {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getGenero() == Genero.FEMENINO) {
                count++;
            }
        }
        return count;
    }

    // Método para saber el tamaño de la estructura
    public int tamañoEstructura() {
        int tamaño = personas.size();
        return tamaño;

    }
}
