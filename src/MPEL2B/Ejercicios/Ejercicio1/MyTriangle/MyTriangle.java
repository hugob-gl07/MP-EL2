package MPEL2B.Ejercicios.Ejercicio1.MyTriangle;
import MPEL2B.Ejercicios.Ejercicio1.MyLine.MyPoint;
/**
 * Representa un triángulo con tres vértices.
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    /** Constructor con coordenadas de los tres vértices.*/
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }
    /** Constructor con los tres vértices como puntos.*/
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    /** Calcula y devuelve el perímetro del triángulo sumando las distancias entre los tres vértices.*/
    public double getPerimeter(){
        return this.v1.distance(v2)+this.v2.distance(v3)+this.v3.distance(v1);
    }
    /** Determina y devuelve el tipo de triángulo según la longitud de sus lados.*/
    public String getType(){
        double lado1= this.v1.distance(v2);
        double lado2= this.v2.distance(v3);
        double lado3= this.v3.distance(v1);

        if (lado1==lado2 && lado2==lado3){
            return "Equilateral";
        }
        else if (lado1==lado2||lado1==lado3||lado2==lado3) {
            return "Isosceles";
        }
        else{
            return "Scalene";
        }
    }
    /** Devuelve una representación en texto del triángulo.*/
    public String toString() {
        return "MyTriangle[v1= " + v1.toString() + ", v2= " + v2.toString() + ", v3= " + v3.toString() + "]";
    }
}