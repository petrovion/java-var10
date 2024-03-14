// Clasa abstractă DocumentFinanciar
abstract class DocumentFinanciar {
    private String numarDocument;
    private String dataEmiterii;

    public DocumentFinanciar(String numarDocument, String dataEmiterii) {
        this.numarDocument = numarDocument;
        this.dataEmiterii = dataEmiterii;
    }

    // Metodă de calcul al totalului (implementați în clasele derivate)
    public abstract double calculeazaTotal();

    // Metodă de afișare a detaliilor documentului
    public void afiseazaDetalii() {
        System.out.println("Număr document: " + numarDocument);
        System.out.println("Data emiterii: " + dataEmiterii);
    }
}

