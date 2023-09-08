package projeto_2;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	Invoice item1 = new Invoice("1", "banana", 7, 2.50); //construtor 1,2,3
	Invoice item2 = new Invoice("2", "maça", 4, 3.0);
	Invoice item3 = new Invoice("3", "uva", 10, 1.25);//item 4 nao tera construtor 
	Invoice item4 = new Invoice("a", "a", 0, 0.00);
	
	System.out.printf("%s preço da %s: %.2f%n", //mostra numero, nome e preço itens 1,2,3
			item1.getNumero(),item1.getDescrição(),item1.getPreço()); 
	System.out.printf("%s preço da %s: %.2f%n",
			item2.getNumero(),item2.getDescrição(),item2.getPreço());
	System.out.printf("%s preço da %s: %.2f%n",
			item3.getNumero(),item3.getDescrição(),item3.getPreço());
	
	
	System.out.printf("%ndescreva o item4:%n"); //define item4
	System.out.print("Numero: ");
	String numero = input.next();  //ler numero
	item4.setNumero(numero);
	
	System.out.print("Nome: ");
	String nome = input.next(); //ler nome
	item4.setDescrição(nome);		
			
	System.out.print("Quantidade: ");
	int quantidade = input.nextInt();	//ler quantidade
	item4.setQuantidade(quantidade);
	
	System.out.print("Preço: ");
	double preco = input.nextDouble();	//ler preço

	item4.setpreco(preco);
	
	System.out.printf("%n ");
	System.out.printf("%n Faturas:%n"); //mostra a fatura de todos os itens
	
	System.out.printf("Item %s: %.2f%n", 
			item1.getNumero(), item1.getInvoiceAmount());//item1
	System.out.printf("Item %s: %.2f%n", 
			item2.getNumero(), item2.getInvoiceAmount());//item2
	System.out.printf("Item %s: %.2f%n", 
			item3.getNumero(), item3.getInvoiceAmount());//item3
	System.out.printf("Item %s: %.2f%n", 
			item4.getNumero(), item4.getInvoiceAmount());//item4
	
	input.close();
	}
}
