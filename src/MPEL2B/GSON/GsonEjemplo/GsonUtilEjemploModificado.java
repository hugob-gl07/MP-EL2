package MPEL2B.GSON.GsonEjemplo;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

/**
 * Versión reducida de GsonUtilEjemplo que SOLO incluye el método de carga (deserialización).
 * Útil cuando el fichero JSON ya existe y solo se quiere leer, sin sobreescribirlo.
 */
public class GsonUtilEjemploModificado {

    /**
     * DESERIALIZA un fichero JSON existente y reconstruye el objeto del tipo indicado por 'clase'.
     * A diferencia de GsonUtilEjemplo, esta versión no tiene método de guardado para evitar
     * sobreescribir el fichero con los valores originales del código.
     */
    public static <T> T cargarObjetoDeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try(FileReader reader=new FileReader(rutaArchivo)){  // abre el fichero para lectura
            return gson.fromJson(reader,clase);              // convierte el JSON al tipo indicado
        }
        catch (IOException e){
            e.printStackTrace();  // muestra el error si el fichero no existe o no se puede leer
            return null;          // devuelve null para indicar que la carga ha fallado
        }
    }
    public static void main(String[] args) {
        // 1. Define la ruta del fichero JSON ya existente (creado previamente por GsonUtilEjemplo)
        String rutarchivo= "usuario.json";

        // 2. DESERIALIZA: lee "usuario.json" y reconstruye el objeto Usuario
        //    Si el fichero ha sido editado a mano, aquí se cargan los nuevos valores
        Usuario usuariocargado= cargarObjetoDeArchivo(rutarchivo,Usuario.class);

        // 3. Imprime el nombre del usuario cargado si la deserialización fue exitosa
        if(usuariocargado!=null){
            System.out.println("Usuario cargado: " +usuariocargado.nombre);  // valor leído del JSON
        }
    }

    /** Clase interna estática de prueba con los mismos campos que el JSON del fichero */
    static class Usuario{
        String nombre;  // nombre del usuario
        int edad;       // edad en años
        String email;   // dirección de correo electrónico

        /** Constructor: asigna nombre, edad y email */
        public Usuario(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }
    }
}
