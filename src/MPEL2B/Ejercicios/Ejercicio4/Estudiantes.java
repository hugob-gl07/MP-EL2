package MPEL2B.Ejercicios.Ejercicio4;

/** Clase que representa a un estudiante con nombre, apellido y número de matrícula. Usada como elemento de la lista en Asignaturas. */
public class Estudiantes {
    private String nombre;    // nombre del estudiante
    private String apellido;  // apellido del estudiante
    private int matricula;    // número de matrícula identificativo del estudiante

    /** Constructor: asigna nombre, apellido y número de matrícula */
    public Estudiantes(String nombre, String apellido, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }
    public String getNombre() {           // devuelve el nombre del estudiante
        return nombre;
    }
    public void setNombre(String nombre) {  // modifica el nombre del estudiante
        this.nombre = nombre;
    }
    public String getApellido() {         // devuelve el apellido del estudiante
        return apellido;
    }
    public void setApellido(String apellido) {  // modifica el apellido del estudiante
        this.apellido = apellido;
    }
    public int getMatricula() {           // devuelve el número de matrícula del estudiante
        return matricula;
    }
    public void setMatricula(int matricula) {   // modifica el número de matrícula del estudiante
        this.matricula = matricula;
    }
    /** Devuelve el estudiante en formato "Estudiantes[nombre: X, apellido: Y, matricula: Z]" */
    @Override
    public String toString() {
        return "Estudiantes[nombre: " + nombre + ", apellido: " + apellido + ", matricula: " + matricula + "]";
    }
}
