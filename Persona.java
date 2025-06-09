
import java.time.LocalDate;

public class Persona {

    // Propiedades privadas
    private String nombre;
    private String apellido;
    private Genero genero;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String nombre, String apellido, Genero genero, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }
}
