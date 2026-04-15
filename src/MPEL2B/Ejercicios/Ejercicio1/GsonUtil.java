package MPEL2B.Ejercicios.Ejercicio1;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtil {
        public static <T> void guardarObjetoEnArchivo(String rutarchivo, T objeto) {
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(rutarchivo)) {
                gson.toJson(objeto, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static <T> T cargarObjetoDeArchivo(String rutaArchivo, Class<T> clase) {
            Gson gson = new Gson();
            try (FileReader reader = new FileReader(rutaArchivo)) {
                return gson.fromJson(reader, clase);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

