package bebidas;

import java.util.Scanner;

public class RealizarPedido {
	
	public static void main(String[] args) {
		
		Bebida opcaoBebida = escolherTipoBebida();
		
		Pedido pedido = new Pedido(opcaoBebida.getTipo(), 
				opcaoBebida.getTipoCopo(), 
				escolherSabor(opcaoBebida), 
				escolherComGelo(opcaoBebida), 
				escolherTamanho(opcaoBebida), 
				escolherLocalConsumo());
		
		pedido.mostrarPedido();
		
	}
	
	public static Bebida escolherTipoBebida() {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual bebida gostaria de pedir?\n 1 - Suco\n 2 - Refrigerante\n");
		int option= scan.nextInt();
		
		if (option == 1) {
			Bebida bebida = new Suco();
			return bebida;
		} else if (option == 2) {
			Bebida bebida = new Refrigerante();
			return bebida;
		}else{
			throw new java.lang.Error("Opção Inválida!");
		}
	}

	
	public static String escolherSabor(Bebida bebida) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual sabor?\n");
		
		int listIndex = 1;
		for(String opcaoSabor : bebida.getSabor()) {
			System.out.println(listIndex + " - " + opcaoSabor);
			listIndex++;
		}
		int option= scan.nextInt();
		
		for(int i=0; i<bebida.getSabor().length; i++) {
			if(option == i+1) {
				return bebida.getSabor()[i];
			}
		}
		
		throw new java.lang.Error("Opção Inválida!");
	}
	
	
	public static int escolherComGelo(Bebida bebida) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gostaria de Gelo na Bebida?\n 1 - Sim\n 2 - Não\n");
		int option= scan.nextInt();
		
		if (option == 1) {
			return bebida.getQtdGelo();
		} else if (option == 2) {
			return 0;
		}else{
			throw new java.lang.Error("Opção Inválida!");
		}
	}
	
	public static String escolherTamanho(Bebida bebida) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual sabor?\n");
		
		int listIndex = 1;
		for(String opcaoTamanho : bebida.getTamanhos()) {
			System.out.println(listIndex + " - " + opcaoTamanho);
			listIndex++;
		}
		int option= scan.nextInt();
		
		for(int i=0; i<bebida.getTamanhos().length; i++) {
			if(option == i+1) {
				return bebida.getTamanhos()[i];
			}
		}
		
		throw new java.lang.Error("Opção Inválida!");
	}
	
	public static boolean escolherLocalConsumo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrega ou Retirada?\n 1 - Entrega\n 2 - Retirada\n");
		int option= scan.nextInt();

		if (option == 1) {
			return true;
		} else if (option == 2) {
			return false;
		}else{
			throw new java.lang.Error("Opção Inválida!");
		}
				
	}
}
