package MPEL2B.GSON.Ejercicio3;

import java.util.Arrays;

/**
 * Clase que representa un grupo de clase con un nombre y un array de nombres de alumnos.
 * Demuestra que Gson serializa arrays de Strings como arrays JSON [] automáticamente.
 */
public class GrupoAlumnos {
    private String nombreGrupo;   // nombre del grupo, p.ej. "1DAM"
    private String[] alumnos;     // array de nombres de alumnos del grupo

    /** Constructor: asigna el nombre del grupo y el array de alumnos */
    public GrupoAlumnos(String nombreGrupo, String[] alumnos) {
        this.nombreGrupo = nombreGrupo;
        this.alumnos = alumnos;
    }

    public String getNombreGrupo() { return nombreGrupo; }
    public String[] getAlumnos() { return alumnos; }

    /** Devuelve el grupo con su array de alumnos usando Arrays.toString() para mostrar el contenido */
    @Override
    public String toString() {
        return "GrupoAlumnos[grupo: " + nombreGrupo + ", alumnos: " + Arrays.toString(alumnos) + "]";
    }
}
