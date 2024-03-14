class GestiuneFinanciara {
    public static void main(String[] args) {
        // Creați instanțe ale claselor și testați funcționalitatea
        Chitanta chitanta = new Chitanta("CH123", "2024-03-14", 150.0);
        Factura factura = new Factura("F123", "2024-03-14", 200.0);

        chitanta.afiseazaDetalii();
        System.out.println("Total chitanță: " + chitanta.calculeazaTotal());

        factura.afiseazaDetalii();
        System.out.println("Total factură: " + factura.calculeazaTotal());
    }
}
