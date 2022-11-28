package br.com.erickfreire.localizamaior;

import java.util.Scanner;

public class LocalizaMaior {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
		int valor = 0;
		int maiorValor = 0;
		
		System.out.println("Programa que localiza o maior valor entre 10 números: ");
		System.out.print("Digite um valor: ");
		valor = entrada.nextInt();
		
		while(contador < 10) {
			
			if(valor > maiorValor)
				maiorValor = valor;
			
			contador++;
			
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();
		}
		
		System.out.printf("%nO maior valor é o : %d%n", maiorValor);
		

	}

}
