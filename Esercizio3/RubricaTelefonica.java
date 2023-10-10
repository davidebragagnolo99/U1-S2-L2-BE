package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        contatti.remove(nome);
    }

    public String ricercaTelefono(String nome) {
        return contatti.get(nome);
    }


    public String ricercaNome(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void stampaRubrica() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}
