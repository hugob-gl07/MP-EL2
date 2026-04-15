package MPEL2B.Ejercicios.Ejercicio1.GeometricObject1;
public class ResizableCircle extends Circle implements Resizable {  // Circle redimensionable: hereda Circle + implementa Resizable

    public ResizableCircle (double radius){   // Constructor que pasa radio al constructor de Circle
        super(radius);                       // Llama Circle(radius)
    }

    @Override
    public String toString() {                // toString() específico de ResizableCircle
        return "ResizableCircle[" + super.toString()+ "]"; // Envuelve Circle.toString()
    }

    @Override
    public double resize(int percent){        // Implementa resize() de interfaz Resizable
        super.radius*=percent/100.0;          // Nuevo radio = radio_actual × (percent/100)
        return super.radius;                  // Devuelve radio MODIFICADO (nuevo valor)
    }
}
