package Esercizio3;

public class App {

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Mario", "222222222");
        rubrica.inserisciContatto("Luigi", "444444444");
        rubrica.inserisciContatto("Maria", "555555555");

        rubrica.stampaRubrica();

        System.out.println("Telefono di Mario: " + rubrica.ricercaTelefono("Mario"));
        System.out.println("Nome associato al numero 555555555: " + rubrica.ricercaNome("444444444"));

        rubrica.cancellaContatto("Luigi");

        rubrica.stampaRubrica();

    }

}
