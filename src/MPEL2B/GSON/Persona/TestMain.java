package MPEL2B.GSON.Persona;
import com.google.gson.Gson;

public class TestMain {
    public static void main(String[] args) {
        // 1. Crea una instancia de Gson (motor de serialización/deserialización)
        Gson gson = new Gson();

        // 2. Crea una Persona con nombre="Antonio Moratilla" y edad=97
        Persona p=new Persona("Antonio Moratilla", 97);

        // 3. SERIALIZA: convierte el objeto Persona a su representación JSON en un String
        String json = gson.toJson(p);

        // 4. Imprime el JSON generado por pantalla   // {"nombre":"Antonio Moratilla","edad":97}
        System.out.println(json);
    }
}