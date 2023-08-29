package aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	
//	public Caneta() {//Construtor
//		this.tampar();
//		this.modelo = "Bic";
//	}
	
	public Caneta(String m, float p) {
		this.tampar();
		this.modelo = m;
		this.ponta = p;
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println(this.getModelo());
		System.out.println(this.getPonta());
		System.out.println(this.tampada);
	}
}
