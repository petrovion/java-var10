// Clasa Factura
class Factura extends DocumentFinanciar {
    private double sumaFacturata;

    public Factura(String numarDocument, String dataEmiterii, double sumaFacturata) {
        super(numarDocument, dataEmiterii);
        this.sumaFacturata = sumaFacturata;
    }

    @Override
    public double calculeazaTotal() {
        return sumaFacturata;
    }
}
