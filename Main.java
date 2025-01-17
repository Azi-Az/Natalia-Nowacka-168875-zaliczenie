import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Company company = Utils.initdata();

        Utils.introduction();

        Utils.menu();

        boolean running = true;

        while (running) {

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Podaj numer opcji:");
                int number = input.nextInt();

                switch (number) {
                    case 1:
                        for (int i = 0; i < company.getEmployees().size(); i++) {
                            System.out.println(company.getEmployees().get(i).toString());
                    }
                        break;

                    case 2:
                        String name = Utils.inputString("Podaj imię: ");
                        String surname = Utils.inputString("Podaj nazwisko: ");
                        company.addEmployee(name, surname);
                        System.out.println("Dodano pomyślnie pracownika: " + name + " " + surname);

                        break;

                        case 3:
                            String nameRemoval = Utils.inputString("Podaj imię pracownika do usunięcia: ");
                            String surnameRemoval = Utils.inputString("Podaj nazwisko pracownika do usunięcia: ");
                            boolean removed = company.removeEmployee(nameRemoval, surnameRemoval);

                            if (removed) {
                                System.out.println("Pomyślnie usunięto pracownika " + nameRemoval + " " + surnameRemoval);
                            } else {
                                System.out.println("Nie znaleziono pracownika: " +  nameRemoval + " " + surnameRemoval);
                            }

                            break;

                    case 4:
                        String currentName = Utils.inputString("Podaj obecne imię pracownika: ");
                        String currentSurname = Utils.inputString("Podaj obecne nazwisko pracownika: ");
                        String newName = Utils.inputString("Podaj nowe imię (naciśnij Enter, aby pominąć): ");
                        String newSurname = Utils.inputString("Podaj nowe nazwisko (naciśnij Enter, aby pominąć): ");

                        boolean updated = company.updateEmployee(currentName, currentSurname, newName, newSurname);

                        if (updated) {
                            System.out.println("Dane pracownika zostały zaktualizowane.");
                        } else {
                            System.out.println("Nie znaleziono pracownika: " + currentName + " " + currentSurname);
                        }
                        break;

                    case 0:
                        System.out.println("Zamykanie programu...");
                        running = false;
                        break;

                    default:
                        System.out.println("Podano zly numer opcji");

                }
                if (running != false) {
                    int answer = Utils.inputInt("Wciśnij 1 na klawiaturze jeśli chcesz wrócić do menu lub 2 jeśli chcesz zamknąć program.");
                    if (answer == 1) {
                        running = true;
                        Utils.menu();
                    } else {
                        System.out.println("Zamykanie programu...");
                        running = false;
                    }
                } else {
                    running = false;
                }


            } catch (InputMismatchException e) {
                System.out.println("Podana opcja nie istnieje");


                }
            }

        }


    }

