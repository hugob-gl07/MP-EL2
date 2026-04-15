package MPEL2B.Ejercicios.Ejercicio1.Employee;
/**
 * Representa un empleado con id, nombre, apellido y salario.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
/** Constructor con id, nombre, apellido y salario. */
    public Employee(int id, String firstName, String lastName, int salary){
        this.id= id;
        this.firstName= firstName;
        this.lastName= lastName;
        this.salary=salary;
    }
/** Devuelve el identificador del empleado. */
    public int getId(){
        return id;
    }
/** Devuelve el nombre del empleado. */
    public String getFirstName(){
        return firstName;
    }
/** Devuelve el apellido del empleado. */
    public String getLastName(){
        return lastName;
    }
/** Devuelve el nombre completo del empleado. */
    public String getName(){
        return firstName+" "+lastName;
    }
/** Devuelve el salario mensual del empleado. */
    public int getSalary(){
        return salary;
    }
/** Modifica el salario mensual del empleado. */
    public void setSalary(int salary){
        this.salary=salary;
    }
/** Calcula y devuelve el salario anual del empleado. */
    public int getAnnualSalary(){
        return salary*12;
    }
/** Aumenta el salario del empleado en un porcentaje dado. */
    public int raiseSalary(int percent){
        double aumento= this.salary *(percent/100.0);
        this.salary+=(int)aumento;
        return this.salary;
    }
/** Devuelve una representación en texto del empleado.*/
    public String toString(){
        return "Employee[id="+ id +",name="+ firstName + " " +lastName+",salary="+ salary +"]";
    }
}

