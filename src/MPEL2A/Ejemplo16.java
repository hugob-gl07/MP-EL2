package MPEL2A;

// Archivo: Ejemplo1.6.java
public class Ejemplo16 {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.6: Uso de try-catch-finally con múltiples catch ---");
        try {
            System.out.println("1. Intentando realizar operaciones...");

            // Operación 1: Acceso a array (Puede lanzar ArrayIndexOutOfBoundsException)
            int[] array = {1, 2};
            System.out.println("Accediendo al array: " + array[0]);

            // Operación 2: División (Puede lanzar ArithmeticException)
            int division = 10 / 0;
            System.out.println("Resultado: " + division);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Manejador específico para errores de índice
            System.out.println("Error capturado: El índice del array no existe.");
            System.out.println("Mensaje: " + e.getMessage());

        } catch (ArithmeticException e) {
            // SEGUNDO CATCH: Manejador para errores matemáticos
            System.out.println("Error capturado: No se puede dividir por cero.");
            // Usamos printStackTrace para que el profe vea que sabemos diagnosticar
            e.printStackTrace();

        } finally {
            // Este bloque se ejecuta siempre, haya error o no
            System.out.println("3. Bloque finally: Finalizando ejecución del ejemplo.");
        }
    }
}