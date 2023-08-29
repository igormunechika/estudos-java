package aula02;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		
		c2.status();
	}

}
