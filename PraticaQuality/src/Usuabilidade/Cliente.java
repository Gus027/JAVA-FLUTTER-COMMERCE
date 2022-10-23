package Usuabilidade;

import java.util.Scanner;


public class Cliente {
      
	private String nome;
  
	
	
	
	
	
	 public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void visualizerLoja(){
		InOut.MsgSemIcone("System", "Bem-Vindo ao FlutterCommerc!");
		int tcl = InOut.leInt("Para entrar no Sistema.\nInsira 1 para [Sim] e Qualquer outra tecla para [Não]");
		//System.out.println("Insira 1 para [Sim] e Qualquer outra tecla para [Não]:" + tcl.nextInt());
		if(tcl == 1) {
			InOut.MsgDeInformacao("System", "Boas-Compras!");
		} else {
			InOut.MsgDeAviso("System", "Exit.");
			return;	
		}
		
	}
	
	public void menu(int menu) {
		Pedido p = new Pedido();
		menu = InOut.leInt("Insira 1 para Visualziar Produtos em Estoque.\nInsira 2 para Comprar algum produto.\nInsira 3 para Depositar dinheiro em sua conta.");
		if(menu == 1) {
			p.visualizarProdutos();
		}else if(menu == 2) {
          	
		}else if(menu == 3) {
			
		}
		return;
	}
	
	
	public static void main (String[] args ) {
	   	   Scanner tcl = new Scanner(System.in);
		   Conta ct = new Conta();
		   Pedido pd = new Pedido();
		   Cliente l = new Cliente();
		   l.visualizerLoja();
		  // System.out.println("Insira o seu saldo Inicial:");
		   ct.setSaldo(InOut.leDouble("Insira o seu saldo Inicial: "));  
		   l.menu(0);
		   
		
		
		
		
	   } 	
	
	 
	 
	 
	 
}
