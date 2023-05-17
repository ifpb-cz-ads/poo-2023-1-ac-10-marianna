import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Cachorro doguinho = new Cachorro(3, true, false, "onivoro", "quase todo lugar");
        doguinho.setNome("Astolfo");

        Gato gatito = new Gato(2, true, false, "carnívoro", "urbano");
        gatito.setNome("Jorge");

        Cobra cobrinha = new Cobra(5, false, true);

        ArrayList<Animal> animaizinhos = new ArrayList<>();
        animaizinhos.add(doguinho);
        animaizinhos.add(gatito);
        animaizinhos.add(cobrinha);

        for (Animal a : animaizinhos) {
            System.out.println(a.imprimir());
        }
    }
}
