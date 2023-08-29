/*
Ordenação de Números
        Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

        adicionarNumero(int numero): Adiciona um número à lista.
        ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
        ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {
    private List<Integer> listaNumero;

    public OrdenacaoDeNumeros() {
        this.listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        this.listaNumero.add(num);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendentes = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()) {
            Collections.sort(ascendentes);
            return ascendentes;
        } else {
            throw new RuntimeException("lista Vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> descendente = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()) {
            descendente.sort(Collections.reverseOrder());
            return descendente;
        } else {
            throw new RuntimeException("lista vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaNumero.isEmpty()) {
            System.out.println(this.listaNumero);
        } else {
            System.out.println("lista vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
