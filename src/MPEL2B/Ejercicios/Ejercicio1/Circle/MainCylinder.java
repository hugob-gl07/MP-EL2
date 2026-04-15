package MPEL2B.Ejercicios.Ejercicio1.Circle;
import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainCylinder {
    public static void main(String[] args) {
        // 1. Crea un Cylinder con radio=5 y altura=10
        Cylinder cylinder = new Cylinder(5, 10);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo = "cylinder.json";

        // 3. SERIALIZA: convierte el objeto Cylinder a JSON y lo escribe en "cylinder.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo, cylinder);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto Cylinder
        Cylinder cylinderCargado = GsonUtil.cargarObjetoDeArchivo(rutaArchivo, Cylinder.class);

        // 5. Imprime el Cylinder recuperado usando toString()   // "Cylinder[radius=5, height=10]"
        System.out.println("Cylinder cargado: " + cylinderCargado.toString());
    }
}
