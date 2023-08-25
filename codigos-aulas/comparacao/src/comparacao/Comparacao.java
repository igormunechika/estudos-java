package comparacao;

public class Comparacao {

	public static void main(String[] args) {
		
		String nome1 = "Igor";
		String nome2 = "Igor";
		String nome3 = new String("Igor");
		String res;
		
		//res = (nome1==nome2)?"igual":"diferente";
		//Usar equals para objetos
		res = (nome1.equals(nome3))?"igual":"diferente";
		
		System.out.println(res);
	}

}
