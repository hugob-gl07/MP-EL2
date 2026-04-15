package MPEL2B.Ejercicios.Ejercicio1.MyTriangle;
import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

import java.io.IOException;

public class MainMyTriangle {
    public static void main(String[] args) throws IOException {
        // 1. Crea un MyTriangle con tres vértices: v1(0,0), v2(3,0), v3(0,4)
        // Forma un triángulo rectángulo 3-4-5 con área=6.0 y perímetro=12.0
        MyTriangle triangle=new MyTriangle(0,0, 3,0, 0,4);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="triangle.json";

        // 3. SERIALIZA: convierte el objeto MyTriangle a JSON y lo escribe en "triangle.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,triangle);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto MyTriangle
        MyTriangle triangle2=GsonUtil.cargarObjetoDeArchivo(rutaArchivo,MyTriangle.class);

        // 5. Imprime el MyTriangle recuperado usando toString()   // "MyTriangle[(0,0),(3,0),(0,4)]"
        System.out.println("Triangle cargado: " + triangle2.toString());
    }
}
