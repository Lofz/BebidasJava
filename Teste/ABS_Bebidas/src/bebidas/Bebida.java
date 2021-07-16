package bebidas;

public class Bebida {

	protected String tipo;
	protected String[] sabor;
	protected String tipoCopo;
	protected String[] tamanhos;
	protected int qtdGelo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtdGelo() {
		return qtdGelo;
	}

	public void setQtdGelo(int qtdGelo) {
		this.qtdGelo = qtdGelo;
	}

	public String[] getSabor() {
		return sabor;
	}
	
	public void setSabor(String[] sabor) {
		this.sabor = sabor;
	}
	
	public String getTipoCopo() {
		return tipoCopo;
	}
	
	public void setTipoCopo(String tipoCopo) {
		this.tipoCopo = tipoCopo;
	}
	
	public String[] getTamanhos() {
		return tamanhos;
	}
	
	public void setTamanhos(String[] tamanhos) {
		this.tamanhos = tamanhos;
	}
	
}
