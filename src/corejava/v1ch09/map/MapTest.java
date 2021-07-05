package v1ch09.map;



import java.util.*;

public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee> staff = new LinkedHashMap<>();        
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));
        //Set<String> keys = staff.keySet();
        staff.forEach((key, value) -> System.out.println(key + value));
    }

}

class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     * 
     * @param n the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
