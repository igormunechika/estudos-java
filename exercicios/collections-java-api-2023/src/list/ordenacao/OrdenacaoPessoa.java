package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoaPorIdade);
            return pessoaPorIdade;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoaPorAltura);
            return pessoaPorAltura;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Igor",35,1.75);
        ordenacaoPessoa.adicionarPessoa("Carol",29,1.60);
        ordenacaoPessoa.adicionarPessoa("Alice",25,1.56);
        ordenacaoPessoa.adicionarPessoa("Bob",17,1.60);
        ordenacaoPessoa.adicionarPessoa("David",30,1.80);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}