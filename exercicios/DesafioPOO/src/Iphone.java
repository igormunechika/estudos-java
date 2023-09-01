public class Iphone implements Navegador,Reprodutor,Telefone{

    private boolean tocando = false;

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina.");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }

    @Override
    public void tocar() {
        tocando = true;
        System.out.println("Tocando musica.");
    }

    @Override
    public void paussar() {
        tocando = false;
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Telefonando");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação.");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Ouvir correio de voz.");
    }
}
