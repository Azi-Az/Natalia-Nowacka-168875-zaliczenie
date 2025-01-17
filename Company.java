import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name, String surname) {
        Person person = new Person(name, surname);
        Employee employee = new Employee(person, Department.ADMINISTRATION);

        employees.add(employee);
    }

    public boolean removeEmployee(String name, String surname) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                iterator.remove();
                return true;
            }
        }
        return false;

    }

    public boolean updateEmployee(String currentName, String currentSurname, String newName, String newSurname) {
        for (Employee employee : employees) {
            if (employee.getName().equals(currentName) && employee.getSurname().equals(currentSurname)) {
                if (!newName.isBlank()) {
                    employee.setName(newName);
                }
                if (!newSurname.isBlank()) {
                    employee.setSurname(newSurname);
                }
                return true;
            }
        }
        return false;
    }
}
