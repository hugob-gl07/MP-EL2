package MPEL2B.Ejercicios.Ejercicio1.GeometricObject1;
public class Circle implements GeometricObject{   // Clase Circle que implementa interfaz GeometricObject

    protected double radius;                     // Atributo protegido radio (accesible en subclases)

    public Circle(double radius){               // Constructor que OBLIGA a especificar radio
        this.radius=radius;                     // Asigna el radio recibido
    }

    @Override
    public String toString() {                  // Implementa toString() de Object
        return "Circle[radius=" +this.radius +"]"; // Formato específico del círculo
    }

    public double getArea(){                    // Implementa getArea() de GeometricObject
        return Math.PI*this.radius*this.radius; // π·r² (área del círculo)
    }

    public double getPerimeter(){               // Implementa getPerimeter() de GeometricObject
        return 2*Math.PI*this.radius;           // 2·π·r (circunferencia)
    }
}
