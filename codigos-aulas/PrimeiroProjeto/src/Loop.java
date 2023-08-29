import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double media = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite sua avaliaçao: ");
             avaliacao = leitura.nextDouble();
             media += avaliacao;
        }
        System.out.println(media/3);
    }
}
