package arquitetura.exemplo.builder;

public class CarroEsportivoBuilder extends CarroBuilder {
	//variaveis responsaveis por armazenar as partes criadas
	private String motor;
	private String tracao;
	private int portas;
	private String rodas;
	
	//construtor concreto, sabe como fazer
	@Override
	public void buildMotor() {
		motor = "2.0,V8,Biturbo";
	}

	@Override
	public void buildTracao() {
		tracao = "4x2 dianteira";
	}

	@Override
	public void buildPortas() {
		portas = 2;
	}

	@Override
	public void buildRodas() {
		rodas = "liga leve";
	}
	
	
	
	@Override
	public Carro build() {
		this.buildMotor();
		this.buildPortas();
		this.buildRodas();
		this.buildTracao();
		return new Esportivo(motor,tracao,portas,rodas);
	}

	

}
