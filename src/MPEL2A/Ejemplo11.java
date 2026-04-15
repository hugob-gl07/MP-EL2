package MPEL2A;

// Archivo: Ejemplo1.1.java
public class Ejemplo11 {
    //Creamos la función ejecutar para luego ejecutar dicho ejemplo en el main
    public static void ejecutar() {
        System.out.println("--- Ejemplo 1.1: Estilo antiguo (if-else) ---");
        //Fijamos con un booleano que es falso (Importante esto).
        boolean archivoExiste = false; // Simulamos que no existe.

        // En lenguajes antiguos, la lógica de error ensucia el flujo principal
        if (archivoExiste) {//Si se da este caso (el booleano es True) procesa el archivo.
            System.out.println("Procesando archivo...");
        } else {//Como el archivo es siempre falso, nunca se da la condición if
                //, luego queda encasillado en el else como error.
            System.out.println("ERROR: El archivo no existe.");//Esta será la salida por pantalla.
        }
    }
}
//Este codigo no es una excepcion como tal: Esta estructura de codigo no es capaz de contener las
// excepciones, en el momento que ocurra una excepcion, el programa lanza un error, no se compilara, esto
//