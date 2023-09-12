package projeto_5;

import java.util.Scanner;


public class HeartRatesTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		HeartRates pessoa1 = new HeartRates(" ", " ", 0, 0, 0);
		
	System.out.printf("Qual o seu nome: ");	
	String nome = input.nextLine();
	pessoa1.setNome(nome);
	
	System.out.printf("Qual o seu sobrenome: ");	
	String sobrenome = input.nextLine();
	pessoa1.setSobrenome(sobrenome);	
	
	System.out.printf("%n %s %s digite abaixo sua data de nascimento: ", 
			pessoa1.getNome(), pessoa1.getsobrenome());
	
	System.out.printf("%nDia: ");
	int dia = input.nextInt();
	pessoa1.setDia(dia);
	
	System.out.printf("Mês: ");
	int mes = input.nextInt();//ler dia mes e ano da data
	pessoa1.setMes(mes);
	
	System.out.printf("Ano: ");
	int ano = input.nextInt();
	pessoa1.setAno(ano);
	input.close();
	
	System.out.printf(" %s você tem %d anos, ", 
			pessoa1.getNome(), pessoa1.getIdade());
	
	System.out.printf("sua Frequencia Cárdiaca Máxima é %d, e sua Frequencia%n Cárdiaca Alvo deve ter um intervalo entre %d e %d.", 
			pessoa1.getFCMax(), pessoa1.getFCAlvo50(), pessoa1.getFCAlvo85());
	
	
	}
}
