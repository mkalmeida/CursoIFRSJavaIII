package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class LojaDeArtesanatos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] preco = new double[10];
		double[] qtd = new double[10];
		double[] precoTotal = new double[10];
		
		double precoTotalFinal = 0, salario =0, maisVendido = 0, precoMaisVendido = 0;
		
		for (int i = 0; i< preco.length;i++) {
			System.out.println("Digite o preço do produto: ");
			preco[i] = input.nextDouble();
			System.out.println("Digite a quantidade do produto: ");
			qtd[i] = input.nextDouble  ();
			
			precoTotal[i] = qtd[i]*preco[i];
			precoTotalFinal = precoTotalFinal + precoTotal[i];

			}
		
		System.out.println("-------------------------------");
		System.out.println("-----------RELATÓRIO-----------");
		System.out.println("-------------------------------");
		System.out.println("|  PREÇO  |   QTD   |  TOTAL  |");
		System.out.println("_______________________________");
		for (int j=0; j<preco.length;j++) {
		System.out.println("|   "+preco[j]+"   |   "+qtd[j]+"   |   "+precoTotal[j]+"  |");
		System.out.println("_______________________________");
		}
		
		Arrays.sort(qtd);
		maisVendido = qtd[qtd.length-1];
		precoMaisVendido = preco[preco.length-1];
		System.out.printf("\nO produto mais vendido foi referente a %.0f unidades a R$ %.2f cada", maisVendido, precoMaisVendido);
		
		salario = 1110 + precoTotalFinal*0.05;
		System.out.printf("\nO valor total geral de vendas foi de R$: %.2f%n", precoTotalFinal);
		System.out.printf("O salário do vendedor será: R$ %.2f%n", salario);
	
		input.close();
		}
	}

