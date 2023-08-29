import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double media = 0;
        int cont = 0;
        while (avaliacao != -1){
            System.out.print("Digite sua avaliaçao: ");
            avaliacao = leitura.nextDouble();
            if (avaliacao != -1) {
                media += avaliacao;
                cont++;
            }
        }
        System.out.println(media/cont);
    }
}
