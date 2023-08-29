package contadordois;

import java.util.Scanner;

public class ContadorDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		do {
			System.out.println(cont);
			cont++;
		} while (cont<4);
		
		int num, sm = 0;
		String resp;
		Scanner tec = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero: ");
			num = tec.nextInt();
			sm += num;
			System.out.print("Quer continuar? S/N ");
			resp = tec.next();
		} while (resp.equals("s"));
		System.out.println("A soma dos valores: "+ sm);

	}

}
