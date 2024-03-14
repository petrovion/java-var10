// Clasa Cont
class Cont extends DocumentFinanciar {
    // Adăugați atribute specifice contului

    public Cont(String numarDocument, String dataEmiterii) {
        super(numarDocument, dataEmiterii);
        // Inițializați atributele specifice
    }

    @Override
    public double calculeazaTotal() {
        // Implementați logica specifică
        return 0; // Exemplu
    }
}
