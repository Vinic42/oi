package projeto_4;

public class Date {

private int	dia;
private int	mes;
private int	ano;
	
	
	public Date(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	
	
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	
	public int getAno()
	{
		return ano;
	}
}
