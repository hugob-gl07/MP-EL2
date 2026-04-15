package MPEL2A;

// Archivo: Ejemplo 1.5.java

// Definimos dos excepciones de ejemplo (Subclases de Exception = Verificadas)
class zzzException extends Exception {
    public zzzException(String msg) { super(msg); }
}

class YyyException extends Exception {
    public YyyException(String msg) { super(msg); }
}

public class Ejemplo15 {

    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.5: Declarar, Lanzar y Atrapar ---");

        // Llamamos a methodC, que es el que gestiona el problema
        methodC();
    }

    /**
     * 3. ATRAPAR UNA EXCEPCIÓN
     * methodC envuelve la llamada a methodD en un bloque try-catch
     */
    public static void methodC() {
        try {
            System.out.println("methodC: Llamando a methodD...");
            // Simulamos un escenario donde queremos lanzar la segunda excepción
            boolean errorGrave = true;
            methodD(errorGrave);

        } catch (zzzException ex) {
            // Manejador para XxxException
            System.out.println("Atrapada en methodC: " + ex.getMessage());
        } catch (YyyException ex) {
            // Manejador para YyyException
            System.out.println("Atrapada en methodC: " + ex.getMessage());
        } finally {
            // Bloque opcional para limpieza
            System.out.println("methodC: Ejecutando bloque finally (limpieza).");
        }
    }

    /**
     * 1. DECLARAR EXCEPCIONES
     * Usamos 'throws' en la firma para avisar que este metodo es "peligroso"
     */
    public static void methodD(boolean tipoError) throws zzzException, YyyException {

        // 2. LANZAR UNA EXCEPCIÓN
        // Creamos el objeto de la excepción y lo lanzamos a la JVM con 'throw'
        if (tipoError) {
            throw new YyyException("Error tipo Y detectado en methodD");
        } else {
            throw new zzzException("Error tipo X detectado en methodD");
        }
    }
}
