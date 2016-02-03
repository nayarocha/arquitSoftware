//classe abstrata
package arquitetura.exemplo.builder;

public abstract class CarroBuilder {
	//construindo as partes do carro
	public abstract void buildMotor();
	public abstract void buildTracao();
	public abstract void buildPortas();
	public abstract void buildRodas();
	//preparou as partes e agora constroi o carro
	public abstract Carro build();
	
	public static CarroBuilder getBuilder(String tipo){
		if (tipo.equals("esportivo")){
			return new CarroEsportivoBuilder();
		}else if (tipo.equals("utilitario")){
			return new CarroUtilitarioBuilder();
		}
		return null;
	}
	
	
}
