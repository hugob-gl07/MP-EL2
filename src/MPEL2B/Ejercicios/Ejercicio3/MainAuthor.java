package MPEL2B.Ejercicios.Ejercicio3;
import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class MainAuthor {
    public static void main(String[] args) {
        // 1. Crea dos objetos Author: nombre, email y género ('F'=ficción)
        Author autor1=new Author("Neil Gaiman", "NeilGaiman@gmail.com ", 'F');
        Author autor2=new Author("Terry Pratchett", "TerryPratchett@gmail.com",'F');

        // 2. AGRUPA los dos autores en un array
        Author[]autores= {autor1,autor2};

        // 3. Crea un Book2 con título="Buenos Pasajes", el array de autores, precio=29.99 y páginas=100
        Book2 libros= new Book2("Buenos Pasajes",autores, 29.99, 100);

        // 4. Define la ruta del archivo JSON donde se guardará el objeto
        String rutaArchivo="autores.json";

        // 5. SERIALIZA: convierte el Book2 (con su array de Author anidado) a JSON y lo escribe en "autores.json"
        GsonUtil.guardarObjetoEnArchivo(rutaArchivo,libros);

        // 6. DESERIALIZA: lee el JSON y reconstruye el objeto Book2 con su array de autores interno
        Book2 librosCargados= GsonUtil.cargarObjetoDeArchivo(rutaArchivo, Book2.class);

        // 7. Imprime el Book2 recuperado usando toString()   // "Book2[Buenos Pasajes, [Neil Gaiman, Terry Pratchett], 29.99, 100]"
        System.out.println("la ruta autores encontrado: " + librosCargados.toString());
    }
}
// Observamos que Gson maneja los arrays automáticamente, representándolos como arrays JSON [].