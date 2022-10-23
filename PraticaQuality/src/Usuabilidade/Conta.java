package Usuabilidade;

import java.util.Scanner;
import java.util.List;

public class Conta {
 
	private String name; 
	private double saldo;
	private int numero;
	Pedido pedido;
	List Cliente;
	
	
	public void setSaldo(double saldo) {this.saldo = saldo;}

	public boolean retira(Pedido pd) {
		if(this.saldo >= pd.getValor() ) {
			this.saldo-=pd.getValor();
			System.out.println("Compra efetuada com sucesso.");
			return true;
		}
		System.out.println("Saldo indisponivel para concluir a transição do pagamento.");
		return false;
	}
	
	
	public void deposita(double valor){
		this.saldo+=valor;	
	}
	
	
	
	
	
	
	
	
	
	 /*
    public void transicaoPedido() {
   	
      Scanner tcl = new Scanner(System.in);
      int op = tcl.nextInt();
      pedido.precoPedido(System.out.println("Insira o produto que gostaria de comprar: " +op);
      if(op == 1) {
    	  this.saldo - valor
    	  System.out.println("Voce comprou uma Placa.");
      }else if(op == 2) {
    	  this.saldo - valor
    	  System.out.println("Voce comprou uma Cadeira.");
      }else if(op == 3) {
    	  this.saldo - valor
    	  System.out.println("Voce comprou uma Tv.");
      }
     //Setar os valores dos pedidos	
	 //-
      
		
	}
	*/
	
	
}
