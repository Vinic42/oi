package projeto_6;

public class HealthProfile {

private String	nome;
private String	sobrenome;
private int dia;
private int mes;
private int ano;
private int idade;	
private int fcm;    //frequencia cardiaca maxima
private String sexo;
private double peso;
private double altura;
private double imc;
	
	public HealthProfile(String nome, String sobrenome, int dia, 
			int mes, int ano, String sexo, double peso, double altura)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if (dia >= 1 && dia <= 31)//para anular valores maiores que 31 e menores que 1
				this.dia = dia;
		
		if (mes >= 1 && mes <= 12)//para anular valores maiores que 31 e menores que 1
				this.mes = mes;
		
		if (ano >= 0)//anular valores negativos
			this.ano = ano;
		
			this.sexo = sexo;
		
		if (altura >= 0)//anular valores negativos
			this.altura = altura;
		
		if (peso >= 0)//anular valores negativos
			this.peso = peso;
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
	
	public void setDia(int dia)
	{
		if (dia >= 1 && dia <= 31)//para anular valores maiores que 31 e menores que 1
			this.dia = dia;
	}
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes)
	{
		if (mes >= 1 && mes <= 12)//para anular valores maiores que 31 e menores que 1
				this.mes = mes;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	
	public void setAno(int ano)
	{
		if (ano >= 0)//anular valores negativos
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
	
	
	public void setSexo(String sexo)
	{
			this.sexo = sexo;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public void setPeso(double peso)
	{
		if (peso >= 0)//anular valores negativos
			this.peso = peso;
	}
	
	public double getPeso()
	{
		return peso;
	}
	
	public void setAltura(double altura)
	{
		if (altura >= 0)//anular valores negativos
			this.altura = altura;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public double getIMC()
	{
		double imc = peso / Math.pow(altura, 2);
		this.imc = imc;
		return this.imc;
	}
}

		