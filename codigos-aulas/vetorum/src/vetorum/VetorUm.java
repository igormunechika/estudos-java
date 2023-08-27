package vetorum;

import java.util.Arrays;

public class VetorUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n[] = new int[4];
		int n[]= {3,2,4,5,7,8,5,1};
		
//		for (int i = 0; i < n.length; i++) {
//			System.out.println("Posição "+i+" n["+n[i]+"]");
//		}
		
//		for (int i = 0; i < n.length; i++) {
//			int j = n[i];
//			System.out.println("Posição "+i+" n["+j+"]");
//		}
	
		Arrays.sort(n);
		for (int i : n) {
			System.out.print(i);	
		}
		
		int v[] = new int[20];
		Arrays.fill(v, 0);//Preencher com 0
		
		for (int i : v) {
			System.out.print(i);	
		}
		
//		String mes[] = {"Jan","Fev","Mar","Abr","Jun","Jul","Ago","Set","Out","Nov","Dez"};
//		int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		for (int i = 0; i < tot.length; i++) {
//			System.out.println(mes[i]+" "+tot[i]);
//		}
		
	}

}
