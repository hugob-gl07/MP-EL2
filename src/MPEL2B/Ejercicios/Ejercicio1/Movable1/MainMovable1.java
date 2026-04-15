package MPEL2B.Ejercicios.Ejercicio1.Movable1;

import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainMovable1 {
    public static void main(String[] args) {
        // 1. Crea un MovableCircle: centro(x=0, y=0), velocidad(xSpeed=1, ySpeed=1), radio=5
        MovableCircle m1= new MovableCircle(0,0,1,1,5);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="MovableCircle.json";

        // 3. SERIALIZA: convierte el objeto MovableCircle a JSON y lo escribe en "MovableCircle.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,m1);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto MovableCircle
        MovableCircle movableCircle= GsonUtil.cargarObjetoDeArchivo(rutaArchivo,MovableCircle.class);

        // 5. Imprime el MovableCircle recuperado usando toString()   // "(0, 0) speed=(1, 1), radius=5"
        System.out.println("MovableCircle cargado: " + movableCircle.toString());
    }
}
