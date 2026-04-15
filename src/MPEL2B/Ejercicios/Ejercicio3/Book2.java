package MPEL2B.Ejercicios.Ejercicio3;
import java.util.Arrays;
/**
 * Representa un libro con múltiples autores, precio y cantidad.
 */
public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
/** Constructor sin cantidad inicial. */
    public Book2(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
/** Constructor con cantidad inicial. */
    public Book2(String name, Author[] authors, double price, int qty) {

        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
/** Devuelve el nombre del libro */
    public String getName(){
        return name;
    }
/** Devuelve el array de autores del libro */
    public Author[] getAuthors() {
        return authors;
    }
/** Devuelve el precio del libro. */
    public double getPrice(){

        return  price;
    }
/** Modifica el precio del libro. */
    public void setPrice(double price) {
        this.price = price;
    }
/** Devuelve la cantidad disponible del libro. */
    public int getQty(){
        return qty;
    }
/** Modifica la cantidad disponible del libro */
    public void setQty(int qty) {
        this.qty = qty;
    }
/** Devuelve el array de autores del libro */
    public String[] getAuthorName(){
        String[] nombres = new String[authors.length];
        int contador=0;
        while(contador<authors.length){
            nombres[contador]=authors[contador].getName();
            contador++;
        }
        return nombres;
    }
/** Devuelve una representación en texto del libro. */
    public String toString(){
        return "AuthorandBook.Book[name= " +name + ",authors= "+ Arrays.toString(authors)+ ", price= " + price + ", qty= " + qty + "]";
    }
}
