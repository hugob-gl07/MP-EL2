package MPEL2B.GSON.Ejercicio3;
import MPEL2B.GSON.GsonEjemplo.GsonUtilEjemplo;
import com.google.gson.Gson;
// Ejercicio 3: arrays → JSON
// Gson serializa arrays y listas iguales que objetos normales.
// Para deserializar un array genérico hay que usar TypeToken.
public class MainEjercicio3 {
    public static void main(String[] args) {
        // 1. Crea una instancia de Gson (motor de serialización/deserialización)
        Gson gson = new Gson();

        // 2. Crea un array de Strings con tres nombres
        String[] nombres = {"Hugo", "Ana", "Luis"};

        // 3. SERIALIZA el array a JSON   // ["Hugo","Ana","Luis"]
        String jsonArray = gson.toJson(nombres);
        System.out.println("Array de Strings en JSON:");
        System.out.println(jsonArray);

        // 4. DESERIALIZA el JSON de vuelta a un array de Strings usando String[].class
        String[] nombresRecuperados = gson.fromJson(jsonArray, String[].class);
        System.out.println("Primer elemento recuperado: " + nombresRecuperados[0]);  // "Hugo"

        // 5. Crea un GrupoAlumnos con nombre="1DAM" y un array inline de tres alumnos
        GrupoAlumnos grupo = new GrupoAlumnos("1DAM", new String[]{"Hugo", "Ana", "Luis"});

        // 6. SERIALIZA el objeto con su array interno a JSON y lo muestra por pantalla
        String jsonGrupo = gson.toJson(grupo);
        System.out.println("\nObjeto con array en JSON:");
        System.out.println(jsonGrupo);  // {"nombreGrupo":"1DAM","alumnos":["Hugo","Ana","Luis"]}

        // 7. SERIALIZA a fichero: escribe el JSON en "grupo.json"
        GsonUtilEjemplo.guardarObjetoEnArchivo("grupo.json", grupo);

        // 8. DESERIALIZA: lee el fichero y reconstruye el GrupoAlumnos con su array interno
        GrupoAlumnos grupoCargado = GsonUtilEjemplo.cargarObjetoDeArchivo("grupo.json", GrupoAlumnos.class);

        // 9. Imprime el GrupoAlumnos recuperado usando toString()
        System.out.println("\nGrupo cargado desde fichero:");
        System.out.println(grupoCargado);  // "GrupoAlumnos[grupo: 1DAM, alumnos: [Hugo, Ana, Luis]]"
    }
}
