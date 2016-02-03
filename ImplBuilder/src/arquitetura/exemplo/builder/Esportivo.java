package arquitetura.exemplo.builder;


public class Esportivo implements Carro {
	private String motor;
	private String tracao;
	private int portas;
	private String rodas;
	
	
	public Esportivo(String motor, String tracao, int portas, String rodas) {
		super();
		this.motor = motor;
		this.tracao = tracao;
		this.portas = portas;
		this.rodas = rodas;
	}
	
	public String toString(){
		return motor + ", " + tracao + ", " + portas + ", " + "portas e rodas";
	}
	
	
}
