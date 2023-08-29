/*
Conjunto de Palavras Únicas
        Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo.

        Implemente os seguintes métodos:
        adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
        removerPalavra(String palavra): Remove uma palavra do conjunto.
        verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
        exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
*/

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoDePalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String p){
        palavras.add(p);
    }

    public void removerPalavra(String p){
        if (!palavras.isEmpty()){
            if (palavras.contains(p)){
                palavras.remove(p);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String p){
        return palavras.contains(p);
    }

    public void exibirPalavras(){
        if (!palavras.isEmpty()){
            System.out.println(palavras);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas conjuntoLinguagens = new ConjuntoDePalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        conjuntoLinguagens.exibirPalavras();

        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavras();

        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        conjuntoLinguagens.exibirPalavras();
    }

}
