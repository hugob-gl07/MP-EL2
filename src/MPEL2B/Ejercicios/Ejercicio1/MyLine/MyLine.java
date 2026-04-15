package MPEL2B.Ejercicios.Ejercicio1.MyLine;
/**
 * Representa una línea con un punto de inicio y un punto de fin.
 */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    /** Constructor con coordenadas de inicio y fin.*/
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }
    /** Constructor con puntos de inicio y fin.*/
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }
    /** Devuelve el punto de inicio de la línea.*/
    public MyPoint getBegin() {
        return begin;
    }
    /** Modifica el punto de inicio de la línea.*/
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    /** Devuelve el punto de fin de la línea.*/
    public MyPoint getEnd() {
        return end;
    }
    /** Modifica el punto de fin de la línea.*/
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    /** Devuelve la coordenada x del punto de inicio.*/
    public int getBeginX(){
        return begin.getX();
    }
    /** Modifica la coordenada x del punto de inicio.*/
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    /** Devuelve la coordenada y del punto de inicio.*/
    public int getBeginY(){
        return begin.getY();
    }
    /** Modifica la coordenada y del punto de inicio.*/
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    /** Devuelve la coordenada x del punto de fin.*/
    public int getEndX(){
        return this.end.getX();
    }
    /** Modifica la coordenada x del punto de fin.*/
    public void setEndX(int x){
        this.end.setX(x);
    }
    /** Devuelve la coordenada y del punto de fin.*/
    public int getEndY(){
        return this.end.getY();
    }
    /** Modifica la coordenada y del punto de fin.*/
    public void setEndY(int y){
        this.end.setY(y);
    }
    /** Devuelve las coordenadas x e y del punto de inicio como array.*/
    public int[] getBeginXY(){
        return begin.getXY();
    }
    /** Modifica las coordenadas x e y del punto de inicio a la vez.*/
    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }
    /** Devuelve las coordenadas x e y del punto de fin como array.*/
    public int[] getEndXY(){
        return end.getXY();
    }
    /** Modifica las coordenadas x e y del punto de fin a la vez.*/
    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }
    /** Calcula y devuelve la longitud de la línea.*/
    public double getLength(){
        return this.begin.distance(this.end);
    }
    /** Calcula y devuelve el ángulo de inclinación de la línea en radianes.*/
    public double getGradient(){
        int xDiff= this.end.getX()-this.begin.getX();
        int yDiff= this.end.getY()-this.begin.getY();
        return Math.atan2(yDiff,xDiff);
    }
    /** Devuelve una representación en texto de la línea.*/
    public String toString() {
        return "MyLine[begin= "+begin.toString()+", end=" + end.toString() + "]";
    }
}