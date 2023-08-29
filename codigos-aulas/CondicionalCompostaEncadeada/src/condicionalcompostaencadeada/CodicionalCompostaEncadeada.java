package condicionalcompostaencadeada;

import java.util.Scanner;

public class CodicionalCompostaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite ano nascimento: ");
		idade = 2023 - teclado.nextInt();
		System.out.println("Sua idade: "+ idade);
		
		if (idade<16) {
			System.out.println("Não pode votar");
		}else if((idade>=16 && idade<18)||(idade>70)){
			System.out.println("Voto opcional");
		}else if(idade<=70) {
			System.out.println("Voto Obrigatorio");
		}
	}
}
