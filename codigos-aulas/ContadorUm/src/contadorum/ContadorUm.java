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
				continue;//interrompe o fluxo, volta pro inicio do la�o
			}
			if(cont == 8) {
				break;//Interrompe o la�o
			}
			System.out.println("Cambalhota "+cont);
		}
		
	}

}
