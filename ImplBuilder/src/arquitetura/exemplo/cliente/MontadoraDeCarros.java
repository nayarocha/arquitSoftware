package arquitetura.exemplo.cliente;

import java.util.Scanner;

import arquitetura.exemplo.builder.Carro;
import arquitetura.exemplo.builder.CarroBuilder;

public class MontadoraDeCarros {
	//composta de carro builder
	//depende do builder de forma generica
	private static CarroBuilder builder;
	
	public static void main(String args[]){
		System.out.println("Qual o tipo de carro deseja criar");
		System.out.println("(1) esportivo, (2) passeio , (3) utilitario");
		Scanner ler = new Scanner(System.in);
		int opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			builder = CarroBuilder.getBuilder("esportivo");
			Carro carro = builder.build();
			System.out.println(carro);
			break;
		case 3:
			builder = CarroBuilder.getBuilder("utilitario");
			Carro carro2 = builder.build();
			System.out.println(carro2);

		default:
			break;
		}
	}
}
