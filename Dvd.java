package lista3;
import java.util.Scanner;

public class Dvd extends Midia{
	
	private int nFaixas;

	public Dvd()
	{ this(0,0.0,"Nenhum",0); }

	public Dvd(int codigo, double preco, String name, int nFaixas)
	{ super(codigo, preco, name);  setFaixas(nFaixas); }
	
	public String getTipo()
	{ return "DVD: "; }

	public String getDetalhes()
	{ return super.getDetalhes() + "\n" +
			"Numero de faixas: " + nFaixas + "\n"; }

	public void setFaixas(int nfaix)
	{ nFaixas = (nfaix > 0) ? nfaix:0; }


	public void inserirDados()
	{

		super.inserirDados();

		Scanner in = new Scanner(System.in);


		System.out.printf("\n Entre com o numero de faixas: ");
		int nfaix = in.nextInt();

		setFaixas(nfaix);
	}

} 
