class Motor {
    private String nume;
    private int putere;

    public Motor(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    // Metoda de filtrare
    public static void filtreazaDupaPutere(List<Motor> motoare, int putereMinima) {
        motoare.removeIf(motor -> motor.putere < putereMinima);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "nume='" + nume + '\'' +
                ", putere=" + putere +
                '}';
    }
}

