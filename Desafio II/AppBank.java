package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Corrente;
import entities.Empresa;
import entities.Especial;
import entities.Estudantil;
import entities.Poupanca;


public class AppConta {
	

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		double valor = 0.00;
		char op;
		int selecao;
		int niver;
		
		Poupanca p1 = new Poupanca (1,"111.111.111-11",10);
		Corrente c1 = new Corrente (1,"111.111.111-11");
		Empresa e1= new Empresa (1,"111.111.111-11", 0, 0);
		Especial s1 = new Especial (0, null);
		Estudantil l1 = new Estudantil (0, null, 0);
		
		System.out.println("Osasbank\nBanco de uma conta so");
		
		System.out.println("Selecione uma conta\n\n1 - Poupanca");
		selecao = leia.nextInt();
		
		if(selecao==1) {
		
		p1.ativar();
		System.out.println("Saldo inicial conta R$"+p1.getSaldo());
		
		for(int x=1; x<=10;x++) {
			
			System.out.println("Movimento:"+x);
			System.out.print("\nDigite o valor R$");
			valor = leia.nextDouble();
			if(valor < 0) {
			System.out.println("digite um valor valido");
			System.out.println("Movimento:"+x);
			System.out.print("\nDigite o valor R$");
			valor = leia.nextDouble();
			}else {
		
			System.out.print("\nD-debito ou C-credito:");
			op = leia.next().toUpperCase().charAt(0);
			if(op=='D') {
				if(p1.getSaldo() < valor) {
					System.out.println("\nNao e possivel debitar um valor maior que o saldo");
				}else {
					p1.debito(valor);
				}
			
			
		}
		else if (op=='C') {
			p1.credito(valor);
		}
			System.out.println("\nSalario atual R$"+p1.getSaldo());
		
			}
		}
		System.out.println("Qual o dia de hoje?");
		niver = leia.nextInt();
		p1.correcao(niver);
		System.out.println(p1.getSaldo());
	}
}
}