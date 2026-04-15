package MPEL2B.Ejercicios.Ejercicio1.InvoiceItem;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
/** Constructor con id, descripción, cantidad y precio unitario. */
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
/** Devuelve el identificador del artículo. */
    public String getId(){
        return id;
    }
/** Devuelve la descripción del artículo. */
    public String getDesc(){
        return desc;
    }
/** Devuelve la cantidad del artículo. */
    public int getQty(){
        return qty;
    }
/** Modifica la cantidad del artículo. */
    public void setQty(int qty){
        this.qty=qty;
    }
/** Devuelve el precio unitario del artículo. */
    public double getUnitPrice(){
        return unitPrice;
    }
/** Modifica el precio unitario del artículo. */
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
/** Calcula y devuelve el total del artículo multiplicando cantidad por precio unitario. */
    public double getTotal(){

        return unitPrice* qty;
    }
/** Devuelve una representación en texto del artículo. */
    public String toString(){

        return "InvoiceItem[id="+ id +",desc="+ desc + ",qty="+ qty + ",unitPrice="+ unitPrice +"]";

    }
}

