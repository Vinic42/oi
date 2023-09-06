package projeto_1;

public class objeto {

private String nome;
private double saldo;
	
	public objeto(String nome, double saldo) 
	{
		this.nome = nome;
		
		if (saldo >=  0.00)
			this.saldo = saldo;
		if (saldo < 0.00)
			saldo = 0.00;
	}
	
	public void deposito(double quantDeposito) 
	{
		if (quantDeposito > 0.00)
			saldo = saldo + quantDeposito;
	}
	
	public String getName() 
	{
		return nome;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
}
