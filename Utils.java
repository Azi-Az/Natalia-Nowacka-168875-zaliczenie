
import java.util.List;

public class Utils {
    static Company initdata() {

        Person firstPerson = new Person("Paulina", "Budyń");
        Person secondPerson = new Person("Karolina", "Sernik");
        Person thirdPerson = new Person("Mateusz", "Tort");

        Employee firstEmployee = new Employee(firstPerson, Department.SALES);
        Employee secondEmployee = new Employee(secondPerson, Department.ADMINISTRATION);
        Employee thirdEmployee = new Employee(thirdPerson, Department.FINANCE);

        Company company = new Company("Słodka Firma");
        List<Employee> employees = company.getEmployees();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);


        return company;

    }

    public static void introduction() {
        Company company = Utils.initdata();
        String title = "Panel administracyjny firmy " + company.getName();
        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));
    }
}
