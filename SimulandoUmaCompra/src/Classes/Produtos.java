package Classes;

public class Produtos {
	
	private String nomeProduto;
	private double valorProduto;
	private int	quantidadeProduto;	
	
	

	public Produtos(String nome, double preco, int quantidade) {
		this.nomeProduto=nome;
		this.quantidadeProduto=quantidade;
		this.valorProduto=preco;		
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public double getValorProduto() {
		return valorProduto;
	}


	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}


	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}


	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}


	public String toString() {
		return "Produtos [nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto + ", quantidadeProduto="
				+ quantidadeProduto + "]";
	}
	
	
	public double CalculandoValorTotal() {		
		return valorProduto*quantidadeProduto;
	}
	
	
	
	
	

}
