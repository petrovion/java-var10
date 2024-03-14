// Clasa Chitanta
class Chitanta extends DocumentFinanciar {
    private double sumaPlatita;

    public Chitanta(String numarDocument, String dataEmiterii, double sumaPlatita) {
        super(numarDocument, dataEmiterii);
        this.sumaPlatita = sumaPlatita;
    }

    @Override
    public double calculeazaTotal() {
        return sumaPlatita;
    }
}
