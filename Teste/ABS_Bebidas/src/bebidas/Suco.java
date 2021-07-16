package bebidas;

public class Suco extends Bebida {
	
	private String tipo = "Suco";
	private String[] sabor = {"Uva", "Laranja"};
	private String tipoCopo = "Plástico";
	private String[] tamanhos = {"300ml", "500ml"};
	private int qtdGelo = 12;
	
	public Suco() {
		setTipo(tipo);
		setSabor(sabor);
		setTipoCopo(tipoCopo);
		setTamanhos(tamanhos);
		setQtdGelo(qtdGelo);
	}
}
