package projeto_2;

public class Invoice {

private String numero;
private String descricao;
private int quantidade;
private double preco;
	
	public Invoice(String numero, String descricao, int quantidade, double preco)
	{
		this.numero = numero;
		
		this.descricao = descricao;
		
		if (this.quantidade >= 0)
			this.quantidade = quantidade; //codiçao para QUANTIDADE ficar 0 se for negativo
		if (this.quantidade < 0)
			quantidade = 0;
		
		if (this.preco >= 0.00)
			this.preco = preco; //codiçao para PREÇO ficar 0 se for negativo
		if (this.preco < 0.00)
			preco = 0.00;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}	
	
	public String getNumero()
	{
		return numero;
	}	
	
	public void setDescrição(String descricao)
	{
		this.descricao = descricao;
	}	
	
	public String getDescrição()
	{
		return descricao;
	}
	
	public void setQuantidade(int quantidade)
	{
		if (this.quantidade >= 0)
			this.quantidade = quantidade;
		if (this.quantidade < 0)
			quantidade = 0;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	public void setpreco(double preco)
	{
		if (this.preco >= 0.00)
			this.preco = preco;
		if (this.preco < 0.00)
			preco = 0.00;
	}
	
	public double getPreço()
	{
		return preco;
	}
	
	public double getInvoiceAmount()
	{
		double invoice;
		invoice = preco * quantidade;
		
		return invoice;
	}
}
