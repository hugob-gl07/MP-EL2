package MPEL2B.Ejercicios.Ejercicio1.GeometricObject1;
public interface Resizable {                // Interfaz para objetos que se pueden redimensionar

    public double resize(int percent);      // Metodo abstracto → OBLIGA a implementar redimensionado
    // Recibe % de cambio (100 = mismo tamaño, 150 = 50% más grande, 75 = 25% más pequeño)
}
