package Executavel;



import javax.swing.JOptionPane;

import Classes.CarrinhoDeCompras;

public class RealizandoACompra {
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		boolean sair = false;
		while(!sair) {
		String [] opcoes = {"Adicionar Produto", "Remover Produto","Editar Produto","Visualizar Carrinho","Fechar Pedido","Sair"};	
		
		int escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		switch(escolha) {
		
		case 0:
			carrinho.AdicionarProduto();
			break;			
		case 1:	
			carrinho.RemoverProduto();
			break;	
		case 2:
			carrinho.EditarProduto();
			break;
		case 3:
			carrinho.VerCarrinho();
			break;
		case 4:
			carrinho.FecharPedido();
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Fechando o Programa");
			sair=true;
	}
	}
	}
}
