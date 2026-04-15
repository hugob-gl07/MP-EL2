package MPEL2B.Ejercicios.Ejercicio1.Movable1;
public class MovablePoint implements Movable {  // Punto móvil que implementa interfaz Movable

    int x;                              // Coordenada X actual (package access)
    int y;                              // Coordenada Y actual (package access)
    int xSpeed;                         // Velocidad horizontal (package access)
    int ySpeed;                         // Velocidad vertical (package access)

    public MovablePoint( int x, int y, int xSpeed, int ySpeed){ // Constructor completo
        this.x=x;                       // Posición inicial X
        this.y=y;                       // Posición inicial Y
        this.xSpeed=xSpeed;             // Velocidad horizontal
        this.ySpeed=ySpeed;             // Velocidad vertical
    }

    @Override
    public String toString() {          // Representación textual del punto
        return "(" + this.x + ", " + this.y + ")" +  " speed=" + "(" + this.xSpeed + ", " + this.ySpeed + ")"  ;
        // "(x, y) speed=(xSpeed, ySpeed)"
    }

    @Override
    public void moveUp(){               // Implementa moveUp() de Movable
        this.y-=ySpeed;                 // Y disminuye (sube en sistemas donde ↑ es negativo)
    }

    @Override
    public void moveDown(){             // Implementa moveDown() de Movable
        this.y+=ySpeed;                 // Y aumenta (baja en sistemas donde ↑ es negativo)
    }

    @Override
    public void moveLeft(){             // Implementa moveLeft() de Movable
        this.x-=xSpeed;                 // X disminuye (izquierda)
    }

    @Override
    public void moveRight(){            // Implementa moveRight() de Movable
        this.x+=xSpeed;                 // X aumenta (derecha)
    }
}
