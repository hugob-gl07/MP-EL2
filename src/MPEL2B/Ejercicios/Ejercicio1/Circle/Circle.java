package MPEL2B.Ejercicios.Ejercicio1.Circle;
/**
 * Representa un círculo con un radio y un color.
 */
public class Circle {
    private double radius;
    private String color;
    /** Constructor por defecto.*/
    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
    /** Constructor con radio dado.*/
    public Circle(double radius){
        this.radius=radius;
    }
    /** Constructor con radio y color dados.*/
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    /** Devuelve el radio del círculo.*/
    public double getRadius() {
        return radius;
    }
    /** Modifica el radio del círculo.*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Devuelve el color del círculo.*/
    public String getColor() {
        return color;
    }
    /** Modifica el color del círculo.*/
    public void setColor(String color) {
        this.color = color;
    }
    /** Calcula y devuelve el área del círculo.*/
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    /** Devuelve una representación en texto del círculo.*/
    public String toString() {
        return "Circle[radius= " + radius + ", color= " + color + "]";
    }
}