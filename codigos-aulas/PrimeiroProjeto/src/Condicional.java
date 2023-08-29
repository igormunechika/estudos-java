public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento == 2022) {
            System.out.println("Ano lançamento 2022");
        } else {
            System.out.println("Filme não é de 2022");
        }

        if ((incluidoNoPlano==true)||(tipoPlano.equals("Plus"))) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme fora do plano");
        }
    }
}
