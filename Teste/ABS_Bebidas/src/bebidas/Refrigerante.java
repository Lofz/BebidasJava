package bebidas;

public class Refrigerante extends Bebida {

	private String tipo = "Refrigerante";
	private String[] sabor = {"Coca", "Guarana"};
	private String tipoCopo = "Papel";
	private String[] tamanhos = {"300ml", "500ml", "700ml"};
	private int qtdGelo = 6;
	
	public Refrigerante() {
		setTipo(tipo);
		setSabor(sabor);
		setTipoCopo(tipoCopo);
		setTamanhos(tamanhos);
		setQtdGelo(qtdGelo);
	}
}
