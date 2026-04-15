package MPEL2B.Ejercicios.Ejercicio1.Circle;
/**
 * Representa un cilindro compuesto por una base circular y una altura.
 */
public class Cylinder {
    private Circle base;
    private double height;
    /** Constructor por defecto.*/
    public Cylinder(){
        this.base=new Circle();
        this.height=1.0;
    }
    /** Constructor con radio dado.*/
    public Cylinder(double radius){
        this.base=new Circle(radius);
    }
    /** Constructor con radio y altura dados.*/
    public Cylinder(double radius, double height){
        this.base=new Circle(radius);
        this.height=height;
    }
    /** Constructor con radio, altura y color dados.*/
    public Cylinder(double radius, double height, String color){
        this.base=new Circle(radius,color);
        this.height=height;
    }
    /** Devuelve la altura del cilindro.*/
    public double getHeight() {
        return height;
    }
    /** Modifica la altura del cilindro.*/
    public void setHeight(double height) {
        this.height = height;
    }
    /** Calcula y devuelve el volumen del cilindro multiplicando el área de la base por la altura.*/
    public double getVolume(){
        return base.getArea()*height;
    }
     /** Devuelve una representación en texto del cilindro, incluyendo la información de la base y la altura.*/
    @Override
    public String toString() {
        return "Cylinder[" + base.toString() + ", height= " + height + "]";
    }
}