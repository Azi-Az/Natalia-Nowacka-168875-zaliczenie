public enum Department {

    SALES("Sprzedaż"),
    ADMINISTRATION("Administracja"),
    FINANCE("Finanse");

    private String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
