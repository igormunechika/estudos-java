import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor = new Random().nextInt(100);
        System.out.println(valor);
        int cont = 1;
        int teste;

        while (cont<=5) {
            System.out.print(cont+" Tentativa - Digite um valor: ");
            teste = leitura.nextInt();
            cont++;
            if (valor == teste){
                System.out.println("Parabens voce acertou");
                break;
            } else if (valor < teste) {
                System.out.println("O numero é menor");
            } else if (valor > teste) {
                System.out.println("O numero é maior");
            }
        }
        if (cont>5){
            System.out.println("Tentativas esgotadas");
        }
    }
}