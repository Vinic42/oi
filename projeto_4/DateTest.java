package projeto_4;

import java.util.Scanner;

public class DateTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date date1 = new Date(12, 06, 22);
		
		System.out.printf("Escreva a data abaixo:%n");
		
		System.out.print("Dia: ");
		int dia = input.nextInt();
		date1.setDia(dia);
		
		System.out.print("Mês: ");
		int mes = input.nextInt();
		date1.setMes(mes);
		
		System.out.print("Ano: ");
		int ano = input.nextInt();
		date1.setAno(ano);
		
		System.out.printf(" %n");
		System.out.printf("%n Você escreveu a data: %d / %d / %d", 
				date1.getDia(), date1.getMes(), date1.getAno());
		
		input.close();
	}
}
