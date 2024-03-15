// Clasa Document
class Document extends DocumentFinanciar {

    public Document(String numarDocument, String dataEmiterii) {
        super(numarDocument, dataEmiterii);
    }

    @Override
    public double calculeazaTotal() {
        return 0;
    }
}
