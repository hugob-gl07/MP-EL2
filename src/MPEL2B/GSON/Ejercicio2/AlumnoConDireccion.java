package MPEL2B.GSON.Ejercicio2;

/**
 * Clase que representa un alumno con una dirección postal anidada.
 * Demuestra que Gson serializa objetos compuestos (objeto dentro de objeto) en JSON anidado automáticamente.
 */
public class AlumnoConDireccion {
    private String nombre;        // nombre del alumno
    private int edad;             // edad en años
    private Direccion direccion;  // objeto anidado: contiene calle, ciudad y CP

    /** Constructor: asigna nombre, edad y la dirección completa (objeto Direccion) */
    public AlumnoConDireccion(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public Direccion getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "AlumnoConDireccion[nombre: " + nombre + ", edad: " + edad + ", direccion: " + direccion + "]";
    }
}
