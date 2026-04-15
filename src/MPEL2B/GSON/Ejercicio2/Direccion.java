package MPEL2B.GSON.Ejercicio2;

/** Clase auxiliar que representa una dirección postal. Es usada como objeto anidado dentro de AlumnoConDireccion. */
public class Direccion {
    private String calle;         // nombre de la calle y número
    private String ciudad;        // ciudad de residencia
    private String codigoPostal;  // código postal de 5 dígitos

    /** Constructor: asigna los tres campos de la dirección */
    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() { return calle; }
    public String getCiudad() { return ciudad; }
    public String getCodigoPostal() { return codigoPostal; }

    @Override
    public String toString() {
        return "Direccion[calle: " + calle + ", ciudad: " + ciudad + ", CP: " + codigoPostal + "]";
    }
}
