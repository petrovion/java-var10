// Clasa Document
class Document extends DocumentFinanciar {
    // Adăugați atribute specifice documentului

    public Document(String numarDocument, String dataEmiterii) {
        super(numarDocument, dataEmiterii);
        // Inițializați atributele specifice
    }

    @Override
    public double calculeazaTotal() {
        // Implementați logica specifică
        return 0; // Exemplu
    }
}
