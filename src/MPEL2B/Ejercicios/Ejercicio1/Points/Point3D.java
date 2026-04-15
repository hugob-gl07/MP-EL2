package MPEL2B.Ejercicios.Ejercicio1.Points;
/**
 * Representa un punto en el espacio 3D como subclase de Point2D, añadiendo coordenada z.
 */
public class Point3D extends Point2D {
    private float z=0.0f;
    /** Constructor con coordenadas x, y y z.*/
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }
    /** Constructor por defecto.*/
    public Point3D(){
    }
    /** Devuelve la coordenada z del punto.*/
    public float getZ(){
        return this.z;
    }
    /** Modifica la coordenada z del punto.*/
    public void setZ(float z) {
        this.z = z;
    }

    /** Modifica las coordenadas x, y y z del punto a la vez. */
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    /** Devuelve las coordenadas x, y y z del punto como array. */
    public float[] getXYZ(){
        float[] xy=super.getXY();
        float[] punto= new float[3];
        punto[0]=xy[0];
        punto[1]=xy[1];
        punto[2]=this.z;
        return punto;
    }
    /** Devuelve una representación en texto del punto. */
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}