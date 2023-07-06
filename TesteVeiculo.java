package lista3;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Moto moto = new Moto("Fiat", 10000.00, 2010);
		Carro carro = new Carro("Chevrolet", 50000.00, 101000);
		
		double precoTotal = moto.getPreco() + carro.getPreco();
		System.out.println("Total dos preços: " + precoTotal);
		
	}

}
