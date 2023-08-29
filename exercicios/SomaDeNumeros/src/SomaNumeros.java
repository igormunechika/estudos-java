

/*
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo.

Implemente os seguintes métodos:
adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.

 */

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        this.numeros.add(num);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
            return  soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero >= maior){
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero <= menor){
                    menor = numero;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());


        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}
