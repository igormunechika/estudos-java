
/*
Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo.
 ada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não.

Implemente os seguintes métodos:
adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    private Set<Tarefa> tarefas;

    public ListaDeTarefas(){
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String d){
        tarefas.add(new Tarefa(d));
    }

    public void removerTarefa(String d){
        Tarefa tarefaParaRemover = null;
        if (!tarefas.isEmpty()){
            for (Tarefa t : tarefas){
                if(t.getDescricao().equalsIgnoreCase(d)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefas.remove(tarefaParaRemover);
        } else {
            System.out.println("Conjunto vazio");
        }
        if (tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas(){
        if(!tarefas.isEmpty()){
            System.out.println(tarefas);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t : tarefas){
            if (t.isConcluida()){
                concluidas.add(t);
            }
        }
        return  concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        {
            for (Tarefa t : tarefas){
                if (!t.isConcluida()){
                    pendentes.add(t);
                }
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String d){
        for (Tarefa t: tarefas){
            if (t.getDescricao().equalsIgnoreCase(d)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String d){
        Tarefa marcarPendente = null;
        for (Tarefa t: tarefas){
            if (t.getDescricao().equalsIgnoreCase(d)){
                marcarPendente = t;
                break;
            }
        }
        if (marcarPendente != null){
            marcarPendente.setConcluida(true);
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void limparListaTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Lista vazia");
        } else {
            tarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaTarefas = new ListaDeTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
