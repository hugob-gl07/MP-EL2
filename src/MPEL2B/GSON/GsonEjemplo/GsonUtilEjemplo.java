package MPEL2B.GSON.GsonEjemplo;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Clase de utilidad genérica para serializar y deserializar objetos Java con Gson.
 * Proporciona dos métodos estáticos reutilizables desde cualquier clase del proyecto.
 */
public class GsonUtilEjemplo {

    /**
     * SERIALIZA cualquier objeto Java a JSON y lo escribe en el fichero indicado.
     * Usa genéricos <T> para aceptar cualquier tipo de objeto.
     * El try-with-resources cierra el FileWriter automáticamente al terminar.
     */
    public static <T> void guardarObjetoEnArchivo(String rutarchivo, T objeto){
        Gson gson = new Gson();
        try(FileWriter writer=new FileWriter(rutarchivo)){  // abre (o crea) el fichero para escritura
            gson.toJson(objeto, writer);                    // escribe el JSON directamente en el fichero
        }catch(IOException e){
            e.printStackTrace();  // muestra el error si el fichero no se puede escribir
        }
    }
    /**
     * DESERIALIZA un fichero JSON y reconstruye el objeto del tipo indicado por 'clase'.
     * Devuelve null si el fichero no existe o hay un error de lectura.
     * El try-with-resources cierra el FileReader automáticamente al terminar.
     */
    public static <T> T cargarObjetoDeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try(FileReader reader=new FileReader(rutaArchivo)){  // abre el fichero para lectura
           return gson.fromJson(reader,clase);               // convierte el JSON al tipo indicado
        }
        catch (IOException e){
            e.printStackTrace();  // muestra el error si el fichero no existe o no se puede leer
            return null;          // devuelve null para indicar que la carga ha fallado
        }
    }

    public static void main(String[] args) {
        // 1. Crea un Usuario de prueba con nombre, edad y email
        Usuario usuario= new Usuario("Juan",30, "juan@example.com");
        String rutarchivo="usuarios.json";

        // 2. SERIALIZA: guarda el Usuario en "usuarios.json"
        guardarObjetoEnArchivo(rutarchivo,usuario);

        // 3. DESERIALIZA: recupera el Usuario desde "usuarios.json"
        Usuario usuariocargado= cargarObjetoDeArchivo(rutarchivo,Usuario.class);

        // 4. Imprime el nombre del usuario cargado si la deserialización fue exitosa
        if(usuariocargado!=null){
            System.out.println("Usuario cargado: " +usuariocargado.nombre);  // "Usuario cargado: Juan"
        }
    }

    /** Clase interna estática de prueba para demostrar el uso de GsonUtilEjemplo */
    static class Usuario{
        String nombre;
        int edad;
        String email;
        public Usuario(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }
    }
}
