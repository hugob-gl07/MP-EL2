package MPEL2B.Ejercicios.Ejercicio1.GeometricObject1;

import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainGeometricObject1 {
    public static void main(String[] args) {
        // 1. Crea un ResizableCircle con radio inicial=100.0
        ResizableCircle r1=new ResizableCircle(100.0);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="ResizableCircle.json";

        // 3. SERIALIZA: convierte el objeto ResizableCircle a JSON y lo escribe en "ResizableCircle.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,r1);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto ResizableCircle
        ResizableCircle resizableCircle= GsonUtil.cargarObjetoDeArchivo(rutaArchivo,ResizableCircle.class);

        // 5. Imprime el ResizableCircle recuperado usando toString()   // "ResizableCircle[Circle[radius=100.0]]"
        System.out.println("ResizableCircle cargado: " + resizableCircle.toString());
    }
}
