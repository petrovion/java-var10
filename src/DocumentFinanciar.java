// Clasa DocumentFinanciar
abstract class DocumentFinanciar {
    private String numarDocument;
    private String dataEmiterii;

    public DocumentFinanciar(String numarDocument, String dataEmiterii) {
        this.numarDocument = numarDocument;
        this.dataEmiterii = dataEmiterii;
    }

    public abstract double calculeazaTotal();

    public void afiseazaDetalii() {
        System.out.println("Număr document: " + numarDocument);
        System.out.println("Data emiterii: " + dataEmiterii);
    }
}

