package MPEL2B.Ejercicios.Ejercicio1.Employee;
import MPEL2B.Ejercicios.Ejercicio1.GsonUtil;

public class TestMainEjercicio1 {
    public static void main(String[] args) {
      // 1. Crea un Employee con id=8, nombre="Peter", apellido="Tan", salario=2500
      Employee e1 = new Employee(8, "Peter", "Tan", 2500);

      // 2. Define la ruta del archivo JSON donde se guardará el objeto
      String rutarchivo="employee.json ";

      // 3. SERIALIZA: convierte el objeto Employee a JSON y lo reescribe en "employee.json"
      GsonUtil.guardarObjetoEnArchivo(rutarchivo,e1);

      // 4. DESERIALIZA: lee el JSON y reconstruye el objeto Employee
      Employee empleado=GsonUtil.cargarObjetoDeArchivo(rutarchivo,Employee.class);

      // 5. Imprime el Employee recuperado usando toString()   // "Employee[id=8, name=Peter Tan, salary=2500]"
      System.out.println("Employee cargado: " + empleado.toString());
        }
    }


