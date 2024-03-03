// Clasa pentru motoare diesel
class MotorDiesel extends Motor {
    private boolean areTurbo;

    public MotorDiesel(String nume, int putere, boolean areTurbo) {
        super(nume, putere);
        this.areTurbo = areTurbo;
    }

    @Override
    public String toString() {
        return super.toString() + " (Diesel)";
    }
}
