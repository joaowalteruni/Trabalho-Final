public class PilhaSimples {
    private No topo;

    public PilhaSimples(String conteudo) {
        this.topo = new No(conteudo);
    }

    public void empilhar(String conteudo) {
        No novoElemento = new No(conteudo);
        novoElemento.setProx(this.topo);
        this.topo = novoElemento;
    }

    public void desempilhar() {
        if (topo == null) {
            System.out.println("A pilha está vazia, nada para ser removido .");
        } else {
            this.topo = this.topo.getProx();
        }
    }

    public void visualizar() {
        if (topo == null) {
            System.out.println("A pilha está vazia.");
        } else {
            No atual = topo;
            while (atual != null) {
                System.out.println(atual.getConteudo());
                atual = atual.getProx();
            }
        }
    }

    public boolean vazia() {
        return this.topo == null;
    }

    public void ordenarCrescente() {
        if (topo == null || topo.getProx() == null) {
            return;
        }

        No primeiro = topo;
        while (primeiro != null) {
            No segundo = primeiro.getProx();
            while (segundo != null) {
                if (primeiro.getConteudo().compareTo(segundo.getConteudo()) > 0) {
                    String troca = primeiro.getConteudo();
                    primeiro.setConteudo(segundo.getConteudo());
                    segundo.setConteudo(troca);
                }
                segundo = segundo.getProx();
            }
            primeiro = primeiro.getProx();
        }
    }
}



