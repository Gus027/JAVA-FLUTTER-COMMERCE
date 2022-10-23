package Usuabilidade;

import java.util.ArrayList;

public class Pedido {

	private int id;
	private String pedido;
	private double valor;
	Conta conta;
	ArrayList<String> pedidos = new ArrayList<>();

	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void visualizarProdutos() {
		pedidos.add(0,"PLACA DE VIDEO - RTX8070");
		pedidos.add(1,"CADEIRA GAMER");
		pedidos.add(2,"TV SMART LED");
	    
		for(String pedi : pedidos) {
			InOut.MsgSemIcone("Produtos.", "Produtos em Estoque 1:"+pedidos.get(0)+"\nProdutos em Estoque 2:" +pedidos.get(1)+"\nProdutos em Estoque 3: "+pedidos.get(2));
			//System.out.println("Produtos em Estoque 1: "+pedidos.get(0));	
			//System.out.println("Produtos em Estoque 2: "+pedidos.get(1));	
			//System.out.println("Produtos em Estoque 3: "+pedidos.get(2));	
			return;
		}				
	}
		
	
	public void comprarProduto() {
		 ArrayList<Double> preco = new ArrayList<>();
	     double placa = 3.600;
	     double cadeira = 1.200;
	     double tv = 4.500; 
	     
	     setValor(placa);
	     setValor(cadeira);
	     setValor(tv);

	     
	     preco.add(0, placa);
	     preco.add(1, cadeira);
	     preco.add(2, tv);
	     
	     
         
	}
	
	
	
	
	
	
}
