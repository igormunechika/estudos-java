/*
Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições.

Implemente os seguintes métodos:
adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
 */

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String def){
        dicionario.put(palavra, def);
    }

    public void removerPalavra(String p){
        if (!dicionario.isEmpty()){
            dicionario.remove(p);
        } else {
            System.out.println("Dicionario vazio");
        }
    }

    public String pesquisarPalavra(String p){
        String def = dicionario.get(p);
        if (def != null){
            return def;
        }
        return "Palavra não encontrada";
    }

    public void exibirPalavras(){
        if (!dicionario.isEmpty()){
            System.out.println(dicionario);
        } else {
            System.out.println("Dicioanrio vazio");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPalavra("csharp");
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
