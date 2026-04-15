package MPEL2B.Ejercicios.Ejercicio2;
/**
 * Representa un punto en el plano con coordenadas x e y.
 */
public class MyPoint {
    private int x;
    private int y;
    /** Constructor por defecto.*/
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    /** Constructor con coordenadas x e y.*/
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /** Devuelve la coordenada x del punto.*/
    public int getX() {
        return x;
    }
    /** Modifica la coordenada x del punto.*/
    public void setX(int x) {
        this.x = x;
    }

    /** Devuelve la coordenada y del punto.*/
    public int getY() {
        return y;
    }
    /** Modifica la coordenada y del punto.*/
    public void setY(int y) {
        this.y = y;
    }
    /** Devuelve las coordenadas x e y del punto como array.*/
    public int[] getXY() {
        int[] puntos = new int[2];
        puntos[0] = this.x;
        puntos[1] = this.y;
        return puntos;
    }
    /** Modifica las coordenadas x e y del punto a la vez.*/
    public void setXY(int x, int y) {
        this.x=x;
        this.y=y;
    }
    /** Calcula y devuelve la distancia entre este punto y las coordenadas dadas.*/
    public double distance(int x, int y){
        int variablex=this.x-x;
        int variabley=this.y-y;
        return Math.sqrt((variablex*variablex)+(variabley*variabley));
    }
    /** Calcula y devuelve la distancia entre este punto y otro punto.*/
    public double distance(MyPoint another){
        return this.distance(another.getX(),another.getY());
    }
    /** Calcula y devuelve la distancia entre este punto y el origen (0,0).*/
    public double distance(){
        return this.distance(0,0);
    }
    /** Devuelve una representación en texto del punto.*/
    public String toString() {
        return "("+ this.x + "," + this.y + ")";
    }
}


