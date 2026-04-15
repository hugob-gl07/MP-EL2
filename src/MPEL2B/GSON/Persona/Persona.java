package MPEL2B.GSON.Persona;

/** Clase básica Persona con nombre y edad. Usada como primer ejemplo de serialización con Gson. */
public class Persona {
    private String nombre;   // nombre de la persona
    private int edad;        // edad en años

    /** Constructor: asigna nombre y edad */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
