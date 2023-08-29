import java.util.ArrayList;
import java.util.List;

/*
List Operações Basicas
Carrinho de Compras:
        Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online.
        O carrinho deve ser implementado como uma lista de itens.
        Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade.

        Implemente os seguintes métodos:
        adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
        removerItem(String nome): Remove um item do carrinho com base no seu nome.
        calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
        exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */
public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.listaDeItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!listaDeItens.isEmpty()){
            for (Item i : listaDeItens) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            listaDeItens.removeAll(itemParaRemover);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaDeItens.isEmpty()){
            for (Item i : listaDeItens){
                double valorItem = i.getPreco() * i.getQuant();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirItens(){
        if (!listaDeItens.isEmpty()) {
            System.out.println(this.listaDeItens);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaDeItens=" + listaDeItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
