package MPEL2A;

// Archivo: Ejemplo1.7.java
public class Ejemplo17 {

    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.7: Excepciones Comunes (Teoría y Práctica) ---");

        // 1. ArrayIndexOutOfBoundsException
        // Lanzada cuando se accede a un índice fuera del rango
        try {
            int[] anArray = new int[3];
            System.out.println("Accediendo a posición 3 de un array de tamaño 3...");
            System.out.println(anArray[3]); // Índices válidos: 0, 1, 2
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturada: " + e.toString());
        }

        // 2. NullPointerException
        // Lanzada al intentar usar una referencia nula
        try {
            String[] strs = new String[3]; // El array tiene 3 posiciones, todas null
            System.out.println("Intentando medir longitud de strs[0] (que es null)...");
            System.out.println(strs[0].length());
        } catch (NullPointerException e) {
            System.out.println("Capturada: " + e.toString());
        }

        // 3. NumberFormatException
        // Lanzada al convertir una cadena con formato inválido a número
        try {
            System.out.println("Intentando convertir 'abc' a entero...");
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Capturada: " + e.toString());
        }

        // 4. ClassCastException
        // Lanzada al realizar un casting incompatible entre objetos
        try {
            Object o = new Object();
            System.out.println("Intentando convertir un Object puro a Integer...");
            Integer i = (Integer)o;
        } catch (ClassCastException e) {
            System.out.println("Capturada: " + e.toString());
        }

        // 5. IllegalArgumentException
        // Se usa programáticamente para indicar parámetros no apropiados
        try {
            System.out.println("Llamando a un método con un argumento ilegal...");
            setEdad(-5); // Metodo definido abajo
        } catch (IllegalArgumentException e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }

    // Ejemplo para IllegalArgumentException
    public static void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa: " + edad);
        }
    }
}
