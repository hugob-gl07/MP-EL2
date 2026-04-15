package MPEL2B.Ejercicios.Ejercicio2;

import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainMyLine {
    public static void main(String[] args) {
        // 1. Crea una MyLine desde el punto inicio(x1=0, y1=0) hasta el punto fin(x2=3, y2=4)
        //    La longitud de esta línea es 5.0 (triángulo 3-4-5), donde cada extremo es un objeto MyPoint
        MyLine line1 = new MyLine(0, 0, 3, 4);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="line1.json";

        // 3. SERIALIZA: convierte el objeto MyLine (con sus MyPoint anidados) a JSON y lo escribe en "line1.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,line1);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto MyLine junto con sus objetos MyPoint internos
        MyLine line1Cargada= GsonUtil.cargarObjetoDeArchivo(rutaArchivo, MyLine.class);

        // 5. Imprime la MyLine recuperada usando toString()   // "MyLine[(0,0),(3,4)]"
        System.out.println("line1Cargada encontrado: " + line1Cargada.toString());
    }
}
// Observamos que Gson serializa objetos dentro de objetos automaticamente, creando un JSON anidado
// por tanto vemos que no hay ningún problema