package MPEL2A;

// Archivo: MiExcepcionPersonalizada (Apartado 1.8).java
class MiExcepcionPersonalizada extends Exception {
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);//Generamos una excepción con un mensaje que saltará cuando se dé
    }
}

// Archivo: Ejemplo1.8.java
public class Ejemplo18 {
    public static void test(int nota) throws MiExcepcionPersonalizada {
        if (nota < 0) {
            // Lanzamos manualmente la excepción con 'throw' en el Test
            throw new MiExcepcionPersonalizada("La nota no puede ser negativa: " + nota);
        }
        System.out.println("Nota válida: " + nota);
    }
    //Creamos este metodo para ejecutar el ejemplo mas tarde en el main:
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.8: Excepciones propias ---");
        try {
            test(-5);//Le asignamos este valor a la nota del test, en el caso de que se cumpla la condición
                          // de test (True: nota<0), salta nuestra excepción presonalizada, devolviendo el mensaje.
        } catch (MiExcepcionPersonalizada e) {//Salta nuestra excepción
            System.out.println("Capturada personalizada: " + e.getMessage());
        }
    }
}
