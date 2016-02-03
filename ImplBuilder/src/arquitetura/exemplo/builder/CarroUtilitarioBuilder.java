package arquitetura.exemplo.builder;

public class CarroUtilitarioBuilder extends CarroBuilder {
	//variaveis responsaveis por armazenar as partes criadas
		private String motor;
		private String tracao;
		private int portas;
		private String rodas;
	
	@Override
	public void buildMotor() {
		motor = "2.0 diesel";
	}

	@Override
	public void buildTracao() {
		tracao = "4x4";
	}

	@Override
	public void buildPortas() {
		portas = 5;
	}

	@Override
	public void buildRodas() {
		rodas = "aro 19";

	}

	@Override
	public Carro build() {
		this.buildMotor();
		this.buildPortas();
		this.buildRodas();
		this.buildTracao();
		return new Utilitario(motor,tracao,portas,rodas);
	}

}
