package MPEL2B.Ejercicios.Ejercicio4;
import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainAsignaturas {
    public static void main(String[] args) {
        // 1. Crea tres objetos Estudiantes: nombre, apellido y número de expediente
        Estudiantes estudiante1= new Estudiantes("Juan", "Perez", 12345);
        Estudiantes estudiante2= new Estudiantes("Maria", "Gomez", 67890);
        Estudiantes estudiante3= new Estudiantes("Carlos", "Lopez", 54321);

        // 2. Crea una Asignaturas con nombre="Matematicas" y una lista interna vacía de estudiantes
        Asignaturas asignatura1= new Asignaturas("Matematicas");

        // 3. AÑADE los tres estudiantes a la lista interna de la asignatura
        asignatura1.getEstudiantes().add(estudiante1);
        asignatura1.getEstudiantes().add(estudiante2);
        asignatura1.getEstudiantes().add(estudiante3);

        // 4. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo = "asignaturas.json";

        // 5. SERIALIZA: convierte la Asignatura (con su lista de Estudiantes anidada) a JSON y lo escribe en "asignaturas.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo, asignatura1);

        // 6. DESERIALIZA: lee el JSON y reconstruye el objeto Asignaturas con su lista de estudiantes interna
        Asignaturas asignaturasCargadas = GsonUtil.cargarObjetoDeArchivo(rutaArchivo, Asignaturas.class);

        // 7. Imprime la Asignatura recuperada usando toString()   // "Asignaturas[Matematicas, [Juan Perez, Maria Gomez, Carlos Lopez]]"
        System.out.println("Asignatura cargada desde fichero:" + asignaturasCargadas.toString());
    }
}
//"Observamos que Gson maneja la lista de objetos automáticamente, representándolos como un array JSON []. Cada estudiante dentro de la asignatura
// aparece como un objeto anidado con sus atributos. Es posible modificar los datos directamente en el fichero JSON a mano y obtener los nuevos objetos al cargarlo,
// siempre que eliminemos o comentemos la línea de guardar, ya que si no, el programa sobreescribe el fichero con los valores originales del código."