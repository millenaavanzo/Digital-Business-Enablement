package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.BO.EstoqueBO;

public class Teste {

	public static void main(String[] args) {
		
		EstoqueBO bo = new EstoqueBO();
		
		Scanner entrada = new Scanner(System.in);
		int cod=0;
		System.out.println("Digite o código do produto: ");
		cod=entrada.nextInt();
	
		//System.out.println(cod);
		
		
	}

}
