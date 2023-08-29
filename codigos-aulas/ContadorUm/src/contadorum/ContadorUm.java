package contadorum;

public class ContadorUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		/*
		while (cont<10) {
			cont++;
			System.out.println("Cambalhota "+cont);
		}
		*/
		
		while (cont<10) {
			cont++;
			if (cont == 5 || cont == 6) {
				continue;//interrompe o fluxo, volta pro inicio do laço
			}
			if(cont == 8) {
				break;//Interrompe o laço
			}
			System.out.println("Cambalhota "+cont);
		}
		
	}

}
