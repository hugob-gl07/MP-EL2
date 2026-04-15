package MPEL2B.Ejercicios.Ejercicio1.InvoiceItem;

import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainInterface {
    public static void main(String[] args) {
        // 1. Crea un InvoiceItem con itemId="A101", description="Pen Red", quantity=888, unitPrice=0.88
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.88);

        // 2. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo = "invoiceitem.json";

        // 3. SERIALIZA: convierte el objeto InvoiceItem a JSON y lo escribe en "invoiceitem.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo, i1);

        // 4. DESERIALIZA: lee el JSON y reconstruye el objeto InvoiceItem
        InvoiceItem i2 = GsonUtil.cargarObjetoDeArchivo(rutaArchivo, InvoiceItem.class);

        // 5. Imprime el InvoiceItem recuperado usando toString()   // "InvoiceItem[A101, Pen Red, 888, 0.88]"
        System.out.println("InvoiceItem encontrado: " + i2.toString());
    }
}
