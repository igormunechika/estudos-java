import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Igor";
        String conta = "Corrente";
        double saldoAtual = 1000.99;
        int opcao = 0;


        String menu = """
                *********
                Digite uma opção:
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                *********""";

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo: "+saldoAtual);
            } else if (opcao == 2) {
                System.out.print("Qual Valor deseja transferir: ");
                double valor = leitura.nextDouble();
                if (saldoAtual >= valor) {
                    saldoAtual -= valor;
                    System.out.println("Novo Saldo: "+saldoAtual);
                }else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (opcao == 3) {
                System.out.print("Qual Valor deseja receber: ");
                double valor = leitura.nextDouble();
                saldoAtual += valor;
                System.out.println("Novo Saldo: "+saldoAtual);
            } else if (opcao == 4) {
                System.out.println("Saindo");
            } else if (opcao != 4) {
                System.out.println("Opção Invalida");
            }
        }
    }
}