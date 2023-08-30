/*
Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto.

Implemente os seguintes métodos:
adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
 */

import java.awt.event.WindowFocusListener;
import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    private Map<String, Integer> palavras;

    public ContagemDePalavras(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String p, Integer i){
        palavras.put(p,i);
    }

    public void removerPalavra(String p){
        if (!palavras.isEmpty()){
            palavras.remove(p);
        } else {
            System.out.println("Map vazio");
        }
    }

    public int exibirContagem(){
        int cont = 0;
        for (int c : palavras.values()){
            cont += c;
        }
        return cont;
    }

    public String encontrarPalavraMaisFrequente(){
        String pFrequentre = null;
        int cont = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()){
            if (entry.getValue() > cont){
                cont = entry.getValue();
                pFrequentre = entry.getKey();
            }
        }
        return pFrequentre;
    }

    public static void main(String[] args) {
        ContagemDePalavras contagemLinguagens = new ContagemDePalavras();

        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contagemLinguagens.exibirContagem() + " palavras.");

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}

