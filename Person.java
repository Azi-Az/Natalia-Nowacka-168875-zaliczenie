public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        System.out.println("UWAGA nastąpiła zmiana imienia");
        this.name = name;
        System.out.println(name);
    }

    public void setSurname(String surname) {
        System.out.println("UWAGA nastąpiła zmiana nazwiska");
        this.surname = surname;
        System.out.println(surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
