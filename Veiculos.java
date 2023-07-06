package lista3;

public class Veiculos {

	private String modelo;
	private double preco;

	public void setPreco(double preco){ 
		this.preco = preco; 
	}

	public void setModelo(String modelo){ 
		this.modelo = modelo; 
	}

	public double getPreco(){ 
		return preco; 
	}

	public String getModelo(){ 
		return modelo; 
	}

	public Veiculos(double preco, String modelo){
		this.preco = preco;
		this.modelo = modelo;
	}

	public void printDados(){
		String s = getPreco() + "\n" + getModelo();
		System.out.println(s);
	}







}
