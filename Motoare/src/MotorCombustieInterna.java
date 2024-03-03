// Clasa pentru motoare cu combustie internă
class MotorCombustieInterna extends Motor {
    private int cilindree;

    public MotorCombustieInterna(String nume, int putere, int cilindree) {
        super(nume, putere);
        this.cilindree = cilindree;
    }

    @Override
    public String toString() {
        return super.toString() + " (Combustie internă)";
    }
}
