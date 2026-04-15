package MPEL2A;

// Archivo: Ejemplo1.2.java
public class Ejemplo12 {
    //Creamos la función ejecutar, para facilitar la incorporación al main
    public static void ejecutar() {
        //Declaramos la excepción:
        System.out.println("\n--- Ejemplo 1.2: Pila de llamadas y ArithmeticException ---");
        try {
            metodoA();
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en el nivel superior.");//no establece el manejo de la excepcion.
            e.printStackTrace(); // Muestra el rastro de la pila de llamadas
        }
    }
    //Metodo A desarrollado en la practica (El metodo que sea, da igual)
    public static void metodoA() {
        System.out.println("Entrando en metodoA");
        metodoB();
        System.out.println("Saliendo de metodoA");
    }
    //Metodo B desarrollado en la practica (El metodo que sea, da igual)
    public static void metodoB() {
        System.out.println("Entrando en metodoB");
        metodoC();
        System.out.println("Saliendo de metodoB");
    }
//Modificamos el metodo C para obtener el resultado division entre 0:
    public static void metodoC() {
        System.out.println("Entrando en metodoC");
        // Provoca una ArithmeticException (división por cero)
        int resultado = 10 / 0;
        System.out.println("Saliendo de metodoC");
    }
}
//La salida de codigo será la lectura normal hasta la excepcion en el metodo C
//para despues saltara el mensaje de que se ha capturado la excepcion en un nivel superior y
//devuelve por pantalla la excepcion, recorreindo la pila de llamadas, dado que ninguna maneja la
// excepcion por construccion del ejercicio, el programa termina e imprime el rastreo de la pila
// de llamadas.