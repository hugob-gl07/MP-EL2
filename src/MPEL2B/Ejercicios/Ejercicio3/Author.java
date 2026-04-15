package MPEL2B.Ejercicios.Ejercicio3;
/**
 * Representa un autor con nombre, email y género.
 */
public class Author {
    private String name;
    private String email;
    private char gender;
/** Constructor con nombre, email y género. */
    public Author(String name, String email , char gender){
        this.name= name;
        this.email= email;
        this.gender= gender;
    }
/** Devuelve el nombre del autor. */
    public String getName() {
        return name;
    }
/** Devuelve el email del autor. */
    public String getEmail(){
        return  email;
    }
/** Devuelve el género del autor. */
    public char getGender() {
        return gender;
    }
/** Modifica el email del autor. */
    public void setEmail(String email) {
        this.email = email;
    }
/** Devuelve una representación en texto del autor */
    public String toString(){

        return "AuthorandBook.Author[name= " + name + ", email= " + email + ", gender= " + gender +"]";
    }
}
