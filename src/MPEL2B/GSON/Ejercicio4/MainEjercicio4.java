package MPEL2B.GSON.Ejercicio4;

import MPEL2B.GSON.GsonEjemplo.GsonUtilEjemplo;
import com.google.gson.Gson;

// Ejercicio 4: Asignatura con lista de Estudiantes → guardar en JSON, modificar fichero, recargar
// El fichero JSON resultante tiene la estructura completa anidada.
// Basta con editar los valores del fichero .json y recargar para obtener nuevos objetos.
public class MainEjercicio4 {
    public static void main(String[] args) {
        // 1. Crea una Asignatura con nombre y profesor (la lista de estudiantes inicia vacía)
        Asignatura asignatura = new Asignatura("Metodología de la Programación", "Antonio Moratilla");

        // 2. AÑADE tres Estudiantes a la lista interna de la asignatura
        asignatura.addEstudiante(new Estudiante("Hugo", "Bastante", 8.5));
        asignatura.addEstudiante(new Estudiante("Ana", "García", 7.0));
        asignatura.addEstudiante(new Estudiante("Luis", "Martínez", 9.2));

        // 3. Crea una instancia de Gson y SERIALIZA la asignatura a String JSON para mostrarlo por pantalla
        //    La lista de estudiantes aparece como un array JSON [] con objetos anidados {}
        Gson gson = new Gson();
        System.out.println("JSON de la asignatura:");
        System.out.println(gson.toJson(asignatura));

        // 4. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo = "asignatura.json";

        // 5. SERIALIZA a fichero: escribe el JSON completo (asignatura + lista de estudiantes) en "asignatura.json"
        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, asignatura);
        System.out.println("\nAsignatura guardada en: " + rutaArchivo);

        // 6. DESERIALIZA: lee el fichero y reconstruye la Asignatura con su lista de Estudiantes interna
        Asignatura cargada = GsonUtilEjemplo.cargarObjetoDeArchivo(rutaArchivo, Asignatura.class);

        // 7. Imprime la Asignatura recuperada usando toString() (cada estudiante en su propia línea)
        System.out.println("\nAsignatura cargada desde fichero:");
        System.out.println(cargada);
    }
}
