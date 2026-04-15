package MPEL2A;

// Archivo: Ejemplo1.3.java


// Definimos una excepción personalizada para el ejemplo (XxxException), por comodidad.
class XxxException extends Exception {
    public XxxException(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo13 {
//Creamos la función ejecutar para probar el ejemplo:
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo 1.3: Propagación y Captura en la Pila ---");
        metodoA(); // Iniciamos la cadena de llamadas
    }

    // El metodo A tiene el bloque catch para manejar la excepción
    public static void metodoA() {
        try {
            System.out.println("metodoA llama a metodoB");
            metodoB();
        } catch (XxxException ex) {
            System.out.println("Excepción capturada en metodoA: " + ex.getMessage());
            // Imprimimos el rastreo para ver el camino que recorrió la excepción
            ex.printStackTrace();
        }
    }

    // El metodo B NO maneja la excepción, por lo que DEBE declararla en su firma (extiende hacia arriba).
    public static void metodoB() throws XxxException {//Debemos declarar que lanza excepcion para compilar el programa
        System.out.println("metodoB llama a metodoC");
        metodoC();
    }

    // El metodo C también la propaga hacia arriba, cabe destacar que tampoco maneja la excepción
    public static void metodoC() throws XxxException {//Debemos declarar que lanza excepcion para compilar el programa
        System.out.println("metodoC llama a metodoD");
        metodoD();
    }

    // El metodo D es donde ocurre la condición anormal y se lanza el objeto Exception
    public static void metodoD() throws XxxException {
        System.out.println("metodoD encuentra un error y lanza XxxException");
        throw new XxxException("Error originado en metodoD"); // Se "lanza" a la JVM
        //Despues, la JVM busca hacia atrras en la pila de llamadasbuscando un manejador
        // de excepciones apropiado (que se encuentra en el metodoA)
    }
}
