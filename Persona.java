
public class Persona {

    // Propiedades privadas
    private String nombre;
    private String apellido;
    private Genero genero;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellido, Genero genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
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
        return edad;
    }
}
