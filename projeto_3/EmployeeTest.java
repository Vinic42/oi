package projeto_3;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		
		Employee employee1  = new Employee("João", "Silva", 1000);//CONSTRUTOR
		Employee employee2  = new Employee("Maria", "Caetano", 2500);
		
		System.out.printf("Lista de funcionarios:");
		
		System.out.printf("%n%s %s salario Mensal: %.2f",//MOSTRA SALARIO MENSAL
				employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioMensal());
		System.out.printf("%n%s %s salario Mensal: %.2f%n",
				employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioMensal());
		
		System.out.printf("%nSalario Anual:");
		
		System.out.printf("%n%s %s salario Anual: %.2f",//MOSTRA SALARIO ANUAL
				employee1.getNome(), employee1.getSobrenome(), (employee1.getSalarioMensal() *12));
		System.out.printf("%n%s %s salario Anual: %.2f%n",
				employee2.getNome(), employee2.getSobrenome(), (employee2.getSalarioMensal() *12));
		
		
		System.out.printf(" %n");
		System.out.printf("Novo Salario Mensal:");//NOVO SALARIO MENSAL
		System.out.printf("%nNovo salario Mensal de %s %s: ",
				employee1.getNome(), employee1.getSobrenome());
		double novoSalario = input.nextDouble(); //ler novo salario employee1
		
		employee1.setSalarioMensal(novoSalario);
		
		System.out.printf("Novo salario Mensal de %s %s: ",
				employee2.getNome(), employee2.getSobrenome());		
		novoSalario = input.nextDouble(); //ler novo salario employee2
		input.close();//fecha scanner
		employee2.setSalarioMensal(novoSalario);
		
		System.out.printf("%n%s %s salario Anual: %.2f",//MOSTRA SALARIO ANUAL
				employee1.getNome(), employee1.getSobrenome(), (employee1.getSalarioMensal() *12));
		System.out.printf("%n%s %s salario Anual: %.2f%n",
				employee2.getNome(), employee2.getSobrenome(), (employee2.getSalarioMensal() *12));
			
	}
}
