package MPEL2B.Ejercicios.Ejercicio1.Movable1;
public class MovableCircle implements Movable {  // Círculo móvil que implementa interfaz Movable

    private int radius;                      // Radio del círculo (privado)
    private MovablePoint center;             // Centro del círculo (objeto MovablePoint COMPOSICIÓN)

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius){ // Constructor completo
        this.center=new MovablePoint(x, y, xSpeed, ySpeed); // Crea centro móvil en (x,y) con velocidades
        this.radius=radius;              // Asigna radio del círculo
    }

    @Override
    public String toString() {               // Representación textual del círculo móvil
        return "["+ center.toString()+ ", radius=" +this.radius + "]"; // "(x,y) speed=(xs,ys), radius=r"
    }

    @Override
    public void moveUp(){                   // Mueve círculo ARRIBA moviendo su centro
        center.moveUp();                    // Delega movimiento al centro (y -= ySpeed)
    }

    @Override
    public void moveDown(){                 // Mueve círculo ABAJO moviendo su centro
        center.moveDown();                  // Delega movimiento al centro (y += ySpeed)
    }

    @Override
    public void moveLeft(){                 // Mueve círculo IZQUIERDA moviendo su centro
        center.moveLeft();                  // Delega movimiento al centro (x -= xSpeed)
    }

    @Override
    public void moveRight(){                // Mueve círculo DERECHA moviendo su centro
        center.moveRight();                 // Delega movimiento al centro (x += xSpeed)
    }
}
