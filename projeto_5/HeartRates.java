package projeto_5;


public class HeartRates {

private String	nome;
private String	sobrenome;
private int dia;
private int mes;
private int ano;
private int idade;	
private int fcm;


	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if (this.dia <= 31)
			this.dia = dia; //para anular valores maiores que 31 e menores que 1
		if (this.dia >= 1)
			this.dia = dia;
		
		if (this.mes <= 12)
			this.mes = mes;//para anular valores maiores que 31 e menores que 1
		if (this.mes >= 1)
			this.mes = mes;
		
		if (this.ano >= 0)//anular valores negativos
			this.ano = ano;
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
	public String getsobrenome()
	{
		return sobrenome;
	}
	
	public void setDia(int dia)
	{
		if (this.dia <= 31)
			this.dia = dia; //para anular valores maiores que 31 e menores que 1
		if (this.dia >= 1)
			this.dia = dia;
	}
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes)
	{
		if (this.mes <= 12)
			this.mes = mes;//para anular valores maiores que 31 e menores que 1
		if (this.mes >= 1)
			this.mes = mes;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	
	public void setAno(int ano)
	{
		if (this.ano >= 0)//anular valores negativos
			this.ano = ano;
	}
	
	public int getAno()
	{
		return ano;
	}
	
	public int getIdade()
	{
		int anoAtual = 2023;
		int mesAtual = 9;
		int diaAtual = 11;
		
		if ((diaAtual - dia) < 0) {
			mesAtual--;
			diaAtual =  (30 + (diaAtual - dia));}
		
		if ((mesAtual - mes) < 0 ) {
			anoAtual--;
			mesAtual = mesAtual + 12;}
		
		int idade = (anoAtual - ano);
		this.idade = idade;
		return idade;
	}
	
	public int getFCMax()
	{
		int fcm = 220 - idade;
		this.fcm = fcm;
		return fcm;
	}
	
	public int getFCAlvo50()
	{
		int fca50 = ((fcm * 50 ) / 100);
		return fca50;
	}
	
	public int getFCAlvo85()
	{
	
		int fcm85 = ((fcm * 85 ) / 100);
		return fcm85;
	}
}
