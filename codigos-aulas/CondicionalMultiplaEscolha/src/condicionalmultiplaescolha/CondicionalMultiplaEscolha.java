package condicionalmultiplaescolha;

import java.util.Scanner;

public class CondicionalMultiplaEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Quantas pernas: ");
		int perna = tec.nextInt();
			
		String tipo = "";

		switch (perna) {
			case 1:
				tipo = "Saci";
				break;
			case 2:
				tipo = "Bipede";
				break;
			case 3:
				tipo = "Tripe";
				break;
			case 4:
				tipo = "Quadrupede";
				break;
			case 5,6:
				tipo = "Aranha";
				break;
			default:
				break;
			}
		System.out.print("Isso é um(a): "+tipo);
	}

}
