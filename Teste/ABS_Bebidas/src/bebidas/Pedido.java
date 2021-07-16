package bebidas;

public class Pedido {
	
	public String tipo;
	public String tipoCopo;
	public String sabor;
	public int qtdGelo;
	public String tamanho;
	public boolean isDelivery;
	
	
	public Pedido(String tipo, String tipoCopo, String sabor, int qtdGelo,  String tamanho, boolean isDelivery) {
		this.tipo = tipo;
		this.tipoCopo = tipoCopo;
		this.sabor = sabor;
		this.qtdGelo = qtdGelo;
		this.tamanho = tamanho;
		this.isDelivery = isDelivery;
		
	}
	
	public void mostrarPedido() {
		System.out.println("-------- Resumo do Pedido ---------");
		System.out.println("\nBebida: " + tipo);
		System.out.println("\nSabor: " + sabor);
		System.out.println("\nTamanho: " + tamanho);
		String respostaGelo = (qtdGelo > 0) ? (" com " + qtdGelo + " Gelos ") : (" sem Gelo ");
		String respostaTampa = isDelivery ? (" e com Tampa sem Furo.") : ("e com Tampa c/ Furo.");
		System.out.println("\nEm um copo de " + tipoCopo + respostaGelo + respostaTampa);
		String formaConsumo = isDelivery ? ("\nSAINDO PARA ENTREGA!") : ("\nSENDO PREPARADO PARA RETIRADA!");
		System.out.println(formaConsumo);
	}
}
	
