package MPEL2B.GSON.Ejercicio4;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una asignatura con su profesor y una lista de estudiantes matriculados.
 * Demuestra que Gson serializa List<Objeto> como array JSON [] con objetos anidados automáticamente.
 */
public class Asignatura {
    private String nombre;                   // nombre de la asignatura
    private String profesor;                 // nombre del profesor responsable
    private List<Estudiante> estudiantes;    // lista dinámica de estudiantes (inicia vacía)

    /** Constructor: asigna nombre y profesor, e inicializa la lista de estudiantes vacía */
    public Asignatura(String nombre, String profesor) {
        this.nombre = nombre; // asignamos el nombre de la asignatura
        this.profesor = profesor; // asignamos el nombre del profesor
        this.estudiantes = new ArrayList<>();  // lista vacía para recibir estudiantes
    }

    /** Añade un Estudiante a la lista interna de la asignatura */
    public void addEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public String getNombre() { return nombre; }          // devuelve el nombre de la asignatura
    public String getProfesor() { return profesor; }      // devuelve el nombre del profesor
    public List<Estudiante> getEstudiantes() { return estudiantes; }  // devuelve la lista completa de estudiantes

    /**
        * Devuelve la asignatura con su profesor y la lista de estudiantes usando el toString() de cada estudiante.
     */
    @Override
    public String toString() {
        return "Asignatura[nombre='" + nombre + ", profesor: " + profesor +  ", estudiantes=" + estudiantes + "]";
    }
}
