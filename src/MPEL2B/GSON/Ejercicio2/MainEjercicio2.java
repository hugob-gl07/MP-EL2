package MPEL2B.GSON.Ejercicio2;

import MPEL2B.GSON.GsonEjemplo.GsonUtilEjemplo;
import com.google.gson.Gson;

// Ejercicio 2: objetos dentro de objetos → JSON
// Gson serializa automáticamente todos los campos, incluidos los que son otros objetos.
public class MainEjercicio2 {
    public static void main(String[] args) {
        // 1. Crea una instancia de Gson (motor de serialización/deserialización)
        Gson gson = new Gson();

        // 2. Crea un objeto Direccion con calle, ciudad y código postal
        Direccion dir = new Direccion("Calle Mayor 10", "Alcalá de Henares", "28801");

        // 3. Crea un AlumnoConDireccion con nombre="Hugo", edad=19 y la dirección anterior como objeto anidado
        AlumnoConDireccion alumno = new AlumnoConDireccion("Hugo", 19, dir);

        // 4. SERIALIZA a String JSON y lo muestra por pantalla → el campo "direccion" aparece como objeto anidado {}
        String json = gson.toJson(alumno);
        System.out.println("JSON generado:");
        System.out.println(json);   // {"nombre":"Hugo","edad":19,"direccion":{"calle":"Calle Mayor 10",...}}

        // 5. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo = "alumno_con_direccion.json";

        // 6. SERIALIZA a fichero: escribe el JSON anidado en "alumno_con_direccion.json"
        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, alumno);

        // 7. DESERIALIZA: lee el fichero y reconstruye el AlumnoConDireccion con su Direccion interna
        AlumnoConDireccion cargado = GsonUtilEjemplo.cargarObjetoDeArchivo(rutaArchivo, AlumnoConDireccion.class);

        // 8. Imprime el objeto recuperado usando toString()
        System.out.println("\nObjeto cargado desde fichero:");
        System.out.println(cargado);  // "AlumnoConDireccion[nombre: Hugo, edad: 19, direccion: Direccion[...]]"
    }
}
