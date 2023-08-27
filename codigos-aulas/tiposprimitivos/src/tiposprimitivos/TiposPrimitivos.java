package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		float nota = 8.5f;
		System.out.println("Nota: "+nota);
		System.out.printf("Nota: %.2f \n", nota);
		System.out.format("Nota: %.3f \n", nota);
		
		Scanner  lerTeclado = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = lerTeclado.nextLine();
		System.out.print("Digite a nota: ");
		nota = (Float)lerTeclado.nextFloat();
		System.out.format("A nota de %s e: %.2f \n", nome, nota);
	}
}