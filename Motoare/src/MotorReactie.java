// Clasa pentru motoare cu reacție
class MotorReactie extends Motor {
    private double consumKerosen;

    public MotorReactie(String nume, int putere, double consumKerosen) {
        super(nume, putere);
        this.consumKerosen = consumKerosen;
    }

    @Override
    public String toString() {
        return super.toString() + " (Reacție)";
    }
}
