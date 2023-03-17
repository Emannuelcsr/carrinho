package Classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CarrinhoDeCompras {
	
	
	List<Produtos> listaProdutos = new ArrayList<Produtos>();

	public void AdicionarProduto(){
		String nome = JOptionPane.showInputDialog("NOME DO PRODUTO: ");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("PREÇO DO PRODUTO( Em reais): "));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("QUANTIDADE DO PRODUTO: "));
		
		Produtos produtos = new Produtos(nome,preco,quantidade);
		listaProdutos.add(produtos);
		JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");		
	}
	public void RemoverProduto() {
		
		if(listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Carrinho Vazio");
			return;
		}
		
		String [] nomesProdutos = new String[listaProdutos.size()];
		
		for(int i = 0; i<listaProdutos.size();i++) {
			nomesProdutos[i]=listaProdutos.get(i).getNomeProduto();			
		}
		
		String nomesProduto = (String) JOptionPane.showInputDialog(null, "Escolha o produto a ser removido", "REMOVER PRODUTO", JOptionPane.PLAIN_MESSAGE, null, nomesProdutos, nomesProdutos[0]);
		
		for(int i=0;i<listaProdutos.size();i++) {
			if(listaProdutos.get(i).getNomeProduto().equalsIgnoreCase(nomesProduto)) {
				listaProdutos.remove(i);
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                return;
			}			
		}		
	}
	
	public void EditarProduto() {
		
		if(listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"A lista de produtos esta vazia");
			return;			
		}
		
		String[]nomesProdutos=new String[listaProdutos.size()];
		
		for(int i=0;i<listaProdutos.size();i++) {
			nomesProdutos[i]=listaProdutos.get(i).getNomeProduto();			
		}
		
		String nomeProduto = (String) JOptionPane.showInputDialog(null, "Escolha o produto", "Escolher Produto",
                JOptionPane.PLAIN_MESSAGE, null, nomesProdutos, nomesProdutos[0]);
		
		for(int i =0;i<listaProdutos.size();i++) {
			
			if(listaProdutos.get(i).getNomeProduto().equalsIgnoreCase(nomeProduto)) {
				String novoNome = JOptionPane.showInputDialog("Novo nome do produto");
				double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Novo Preço", listaProdutos.get(i).getValorProduto()));
				int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Nova Quantidade", listaProdutos.get(i).getQuantidadeProduto()));
				
				listaProdutos.get(i).setNomeProduto(novoNome);
				listaProdutos.get(i).setQuantidadeProduto(novaQuantidade);
				listaProdutos.get(i).setValorProduto(novoPreco);
				
				JOptionPane.showMessageDialog(null, "Produto Atualizado com Sucesso!");
				return;			
			}
		}			
		}
	public void VerCarrinho() {
		
		if(listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Carrinho vazio!");
			return;
		}else {			
			StringBuilder mensagem = new StringBuilder();
			for(int i=0; i<listaProdutos.size();i++) {
				mensagem.append("Produto: ").append(listaProdutos.get(i).getNomeProduto()).append(" R$ ").append(listaProdutos.get(i).getValorProduto()).append(" Quantidade: ").append(listaProdutos.get(i).getQuantidadeProduto()).append("\n");	
				}
			JOptionPane.showMessageDialog(null, mensagem.toString());			
		    }
		}
	public void FecharPedido() {
		if(listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Carrinho Vazio!");
			return;
		}
		double valorTotal = 0.0;
		double valorFinal = 0.0;
		for (Produtos prod: listaProdutos) {
			
			 valorTotal = prod.CalculandoValorTotal();
			 
			 valorFinal+=valorTotal;
			}
		JOptionPane.showMessageDialog(null, "Valor do carrinho R$"+valorFinal);	
		}		
	
		
		
	}		
		

	




