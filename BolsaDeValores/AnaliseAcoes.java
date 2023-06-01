/*Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
comercializada na bolsa de valores, o preço de compra e o preço de venda de
cada ação e que calcule e mostre:
 a quantidade de ações com lucro superior a R$ 1.000,00;
 a quantidade de ações com lucro inferior a R$ 200,00.
Finalize com o tipo de ação ‘F’.*/

package BolsaDeValores;

import java.util.Scanner;

public class AnaliseAcoes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lucroSup=0, lucroInf=0;
		char acao;
		double precoCompra = 0, precoVenda = 0, lucro;
		
		do {
			
			System.out.println("Digite a ação: ");
			acao = input.next().charAt(0);
			
			System.out.println("Digite o preço de compra: R$ ");
			precoCompra = input.nextDouble();
			
			System.out.println("Digite o preço de venda: R$ ");
			precoVenda = input.nextDouble();
			
			lucro = precoVenda - precoCompra;
			
			if (lucro> 1000) {
				lucroSup = lucroSup + 1;
			} else  if (lucro < 200){
				lucroInf = lucroInf + 1;
			}
		} while (acao != 'F' && acao != 'f');
		
		System.out.println("A quantidade de ações com lucro superior a R$ 1.000,00 é: " + lucroSup);
		System.out.println("A quantidade de ações com lucro inferior a R$ 200,00 é: " + lucroInf);

	}

}
