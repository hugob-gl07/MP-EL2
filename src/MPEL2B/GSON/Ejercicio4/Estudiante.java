package MPEL2B.GSON.Ejercicio4;

/** Clase que representa a un estudiante con nombre, apellido y nota. Usada como elemento de la lista en Asignatura. */
public class Estudiante {
    private String nombre;    // nombre del estudiante
    private String apellido;  // apellido del estudiante
    private double nota;      // nota numérica (0.0 – 10.0)

    /** Constructor: asigna nombre, apellido y nota */
    public Estudiante(String nombre, String apellido, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }      // devuelve el nombre del estudiante
    public String getApellido() { return apellido; }  // devuelve el apellido del estudiante
    public double getNota() { return nota; }          // devuelve la nota numérica del estudiante

    /** Devuelve el estudiante en formato "Estudiante[nombre apellido, nota: X]" */
    @Override
    public String toString() {
        return "Estudiante[" + nombre + " " + apellido + ", nota: " + nota + "]";
    }
}
