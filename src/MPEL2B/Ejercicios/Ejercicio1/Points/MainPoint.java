package MPEL2B.Ejercicios.Ejercicio1.Points;

import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainPoint {
    public static void main(String[] args) {
        // 1. Crea un Point3D con coordenadas x=1, y=2, z=4
        Point3D point3D=new Point3D(1,2,4);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="Points.json";

        // 3. SERIALIZA: convierte el objeto Point3D a JSON y lo escribe en "Points.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,point3D);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto Point3D
        Point3D point3D1=GsonUtil.cargarObjetoDeArchivo(rutaArchivo,Point3D.class);

        // 5. Imprime el Point3D recuperado usando toString()   // "(1.0, 2.0, 4.0)"
        System.out.println("Point3D cargado: " + point3D1.toString());
    }
}
