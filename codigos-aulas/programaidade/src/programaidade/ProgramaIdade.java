package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ano de nascimento: ");
		int nasc = teclado.nextInt();
		int idade = 2023 - nasc;
		System.out.println("Sua idade e:"+idade);
		if(idade>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
	}

}
