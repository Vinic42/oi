package projeto_6;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HealthProfile pessoa1 = new HealthProfile(" ", " ", 0, 0, 0, " ", 0, 0);
		
		System.out.printf("Digite o seu nome: ");	//recebe nome
		String nome = input.nextLine();
		pessoa1.setNome(nome);
		
		System.out.printf("Digite o seu sobrenome: ");//recebe sobrenome
		String sobrenome = input.nextLine();
		pessoa1.setSobrenome(sobrenome);	
		
		System.out.printf("Digite o seu sexo (m/f): ");//recebe sexo
		String sexo = input.nextLine();
		pessoa1.setSexo(sexo);
		
		System.out.printf("Digite o seu peso: ");//recebe peso
		double peso = input.nextDouble();
		pessoa1.setPeso(peso);
		
		System.out.printf("Digite o sua altura: ");//recebe altura
		double altura = input.nextDouble();
		pessoa1.setAltura(altura);
		
		System.out.printf("%n %s %s digite abaixo sua data de nascimento: ", 
				pessoa1.getNome(), pessoa1.getSobrenome());
		
		System.out.printf("%nDia: ");//ler dia
		int dia = input.nextInt();
		pessoa1.setDia(dia);
		
		System.out.printf("Mês: ");//mes 
		int mes = input.nextInt(); 
		pessoa1.setMes(mes);
		
		System.out.printf("Ano: "); //e ano da data
		int ano = input.nextInt();
		pessoa1.setAno(ano);
		
		System.out.println();
		System.out.printf("Informações de %s %s:%n Idade: %d%n Sexo: %s%n ",
				pessoa1.getNome(), pessoa1.getSobrenome(), pessoa1.getIdade(), pessoa1.getSexo() );
		//mostra todas as informações obtidas.
		
		System.out.printf("Altura: %.2f%n Peso: %.1f%n Frequencia Cardiaca Maxima: %d%n Frequencia cardiaca alvo: entre %d a %d%n ", 
				pessoa1.getAltura(), pessoa1.getPeso(), pessoa1.getFCMax(), pessoa1.getFCAlvo50(), pessoa1.getFCAlvo85());
		
		System.out.printf("IMC: %.2f%n", 
				pessoa1.getIMC());
		
		if (pessoa1.getIMC() <= 16.9)
			System.out.println(" Está MUITO abaixo do peso!");
		
		if (pessoa1.getIMC() > 16.9 && pessoa1.getIMC() <= 18.4)
			System.out.println(" Está abaixo do peso");
		
		if (pessoa1.getIMC() > 18.4 && pessoa1.getIMC() <= 24.9)
			System.out.println(" Está com peso normal Parabéns");
		
		if (pessoa1.getIMC() > 24.9 && pessoa1.getIMC() <= 29.9)
			System.out.println(" Está acima do peso");
		
		if (pessoa1.getIMC() > 29.9 && pessoa1.getIMC() <= 34.9)
			System.out.println(" OBESIDADE grau I");
		
		if (pessoa1.getIMC() > 34.9 && pessoa1.getIMC() <= 40)
			System.out.println(" OBESIDADE grau II");
		
		if (pessoa1.getIMC() > 40)
			System.out.println(" OBESIDADE grau III");
		
		input.close();
	}
}
