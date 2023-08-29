package br.com.alura.minhasmusicas.Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacoes() >= 9) {
            System.out.println(audio.getTitulo()+" é considerado sucesso");
        } else {
            System.out.println(audio.getTitulo()+" - Escutar depois.");
        }
    }

}
