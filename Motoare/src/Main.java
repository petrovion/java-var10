public class Main {
    public static void main(String[] args) {
        List<Motor> motoare = new ArrayList<>();
        motoare.add(new MotorDiesel("Motor Diesel 1", 150, true));
        motoare.add(new MotorCombustieInterna("Motor Combustie Interna 1", 200, 2500));
        motoare.add(new MotorReactie("Motor Reactie 1", 5000, 100.5));

        // Filtrare după putere minimă
        Motor.filtreazaDupaPutere(motoare, 200);

        for (Motor motor : motoare) {
            System.out.println(motor);
        }
    } 
}
