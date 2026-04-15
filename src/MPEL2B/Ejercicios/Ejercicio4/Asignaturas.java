package MPEL2B.Ejercicios.Ejercicio4;
import java.util.ArrayList;
import java.util.List;
/** Clase que representa una asignatura con su nombre y una lista dinámica de estudiantes matriculados. */
public class Asignaturas {
    private String Asignatura;               // nombre de la asignatura
    private List<Estudiantes> estudiantes;   // lista dinámica de estudiantes (inicia vacía)

    /** Constructor: asigna el nombre de la asignatura e inicializa la lista de estudiantes vacía */
    public Asignaturas(String Asignatura) {
        this.Asignatura = Asignatura;
        this.estudiantes = new ArrayList<>();  // lista vacía lista para recibir estudiantes
    }
    public String getAsignatura() {            // devuelve el nombre de la asignatura
        return Asignatura;
    }
    public void setAsignatura(String Asignatura) {  // modifica el nombre de la asignatura
        this.Asignatura = Asignatura;
    }
    public List<Estudiantes> getEstudiantes() {     // devuelve la lista completa de estudiantes
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiantes> estudiantes) {  // reemplaza toda la lista de estudiantes
        this.estudiantes = estudiantes;
    }
    /** Devuelve la asignatura con su lista de estudiantes en formato "Asignatura[nombre='X', estudiantes=[...]]" */
    @Override
    public String toString() {
        return "Asignatura[nombre='" + Asignatura + "', estudiantes=" + estudiantes + "]";
    }
}
