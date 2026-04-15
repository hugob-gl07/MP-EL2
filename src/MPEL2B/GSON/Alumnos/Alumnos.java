package MPEL2B.GSON.Alumnos;
import MPEL2B.GSON.GsonEjemplo.GsonUtilEjemplo;

/**
 * Clase Alumnos con nombre, apellido, edad y nota.
 * Su main acepta argumentos por línea de comandos para inicializar o mostrar un alumno desde JSON.
 */
public class Alumnos {
    private String nombre;       // nombre del alumno
    private String apellido;     // apellido del alumno
    private int edad;            // edad en años
    private double nota;         // nota numérica (0.0 – 10.0)

    /** Constructor: asigna todos los campos del alumno */
    public Alumnos(String nombre, String apellido, int edad, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }
    public String getNombre() {           // devuelve el nombre del alumno
        return nombre;
    }
    public void setNombre(String nombre) {  // modifica el nombre del alumno
        this.nombre = nombre;
    }
    public String getApellido() {         // devuelve el apellido del alumno
        return apellido;
    }
    public void setApellido(String apellido) {  // modifica el apellido del alumno
        this.apellido = apellido;
    }
    public int getEdad() {                // devuelve la edad del alumno
        return edad;
    }
    public void setEdad(int edad) {       // modifica la edad del alumno
        this.edad = edad;
    }
    public double getNota() {             // devuelve la nota numérica del alumno
        return nota;
    }
    public void setNota(double nota) {    // modifica la nota numérica del alumno
        this.nota = nota;
    }
    public String toString(){
        return "Alumno[nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", nota: " + nota + "]";
    }

    public static void main (String[] args){
        // 1. Si no se pasan argumentos → avisa de que falta el comando
        if (args.length==0){
            System.out.println("No existe el archivo");
        }
        // 2. COMANDO "init": crea un Alumno por defecto y lo SERIALIZA en el fichero indicado en args[1]
        else if (args[0].equals("init")){
            Alumnos alumno=new Alumnos("Hugo", "Bastante Gómez Limón", 19, 8.5);
            GsonUtilEjemplo.guardarObjetoEnArchivo(args[1],alumno);  // escribe el JSON en args[1]
            System.out.println("Alumno iniciado");
        }
        // 3. COMANDO "show": DESERIALIZA el fichero indicado en args[1] y muestra el Alumno por pantalla
        else if (args[0].equals("show")){
            Alumnos alumnocargado= GsonUtilEjemplo.cargarObjetoDeArchivo(args[1],Alumnos.class);
            System.out.println("Alumno cargado: " + alumnocargado.toString());  // "Alumno[nombre: Hugo, ...]"
        }
    }
}
