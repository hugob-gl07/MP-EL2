package MPEL2A;

// Archivo: Ejemplo14.java
public class Ejemplo14 {

    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.4: Jerarquía de Clases (Throwable) ---");

        // 1. Rama de ERROR (Unchecked)
        // Representan problemas graves del sistema (ej: VirtualMachineError)
        // Generalmente no se capturan porque poco se puede hacer
        System.out.println("Nota: Los objetos 'Error' como OutOfMemoryError no se suelen capturar.");

        // 2. Rama de EXCEPTION - Subclase RuntimeException (Unchecked)
        // Son errores lógicos del programador
        try {
            int resultado = 10 / 0; // Lanza ArithmeticException
        } catch (RuntimeException e) {
            // Capturamos usando la superclase RuntimeException
            System.out.println("Capturada Unchecked (vía RuntimeException): " + e.toString());
        }

        // 3. Rama de EXCEPTION - Otras subclases (Checked)
        // El compilador OBLIGA a capturarlas o declararlas
        try {
            metodoConExcepcionVerificada();
        } catch (Exception e) {
            // Capturamos usando la clase base Exception
            System.out.println("Capturada Checked (vía Exception): " + e.getMessage());
        }

        // 4. Demostración de Polimorfismo con Throwable
        Throwable miExcepcion = new IllegalArgumentException("Dato no válido");
        System.out.println("¿Es IllegalArgumentException un Throwable?: " + (miExcepcion instanceof Throwable));
    }

    // Metodo que lanza una excepción verificada (Checked)
    public static void metodoConExcepcionVerificada() throws Exception {
        // Exception y sus subclases (menos RuntimeException) son Checked
        throw new Exception("Error de E/S simulado");
    }
}
