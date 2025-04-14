
public class MainPilha {
    public static void main(String[] args) {
     
        PilhaSimples pilha = new PilhaSimples("Gabriel Machado");
        pilha.empilhar("Joao Walter");
        pilha.empilhar("Carlos Pilla");
        pilha.empilhar("Stefany Schmengler");
        pilha.desempilhar();
        System.out.println("Elementos da pilha:");
        pilha.visualizar();
    }
}


