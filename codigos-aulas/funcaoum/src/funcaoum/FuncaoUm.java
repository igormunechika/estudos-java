package funcaoum;

public class FuncaoUm {

	static void soma(int a, int b) {
		int s = a + b;
		System.out.println(s);
	}
	
	static int somar(int a, int b) {
		int s = a + b;
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soma(2,4);
		
		int sm = somar(3,4);
		System.out.println(sm);
	}

}
