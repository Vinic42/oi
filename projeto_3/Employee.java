package projeto_3;

public class Employee {

private String nome;
private String sobrenome;	
private double salarioMensal;
	
	public Employee(String nome, String sobrenome, double salarioMensal)//Construtor
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if (salarioMensal >= 0)//codiçao para anular valor negativos
			this.salarioMensal = salarioMensal;
		
		if (salarioMensal < 0)
			this.salarioMensal = 0.00;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome()
	{
		return sobrenome;
	}
	
	
	public void setSalarioMensal(double salarioMensal)
	{
		if (salarioMensal >= 0)	
			this.salarioMensal = salarioMensal;
		
		if (salarioMensal < 0)
			this.salarioMensal = 0.00;
	}
	
	public double getSalarioMensal()
	{
		return salarioMensal;
	}
	
	
}
