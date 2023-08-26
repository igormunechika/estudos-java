package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> listaItens;

    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void  adicionarItem(String nome, double preco, int quantidade){
        Itens item = new Itens(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome){
        List<Itens> itensParaRemover = new ArrayList<>();
        if (!listaItens.isEmpty()){
            for (Itens i: listaItens) {
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItens.isEmpty()){
            for (Itens item : listaItens) {
                double valorItem = item.getPreco()*item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if (!listaItens.isEmpty()){
            System.out.println(this.listaItens);
        } else {
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}


