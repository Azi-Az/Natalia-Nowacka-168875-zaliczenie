
import java.util.List;
import java.util.Scanner;

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

    public static void menu() {
        String options = "Menu opcji";
        System.out.println("-".repeat(options.length()));
        System.out.println(options);
        System.out.println("-".repeat(options.length()));
        System.out.println("1. Wyświetl listę pracowników");
        System.out.println("2. Dodaj pracownika.");
        System.out.println("3. Usuń pracownika");
        System.out.println("4. Zmień dane pracownika");
        System.out.println("0. Zamknij program");
    }

    public static String inputString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }

    public static int inputInt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextInt();
    }

}
