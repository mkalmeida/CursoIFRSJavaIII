package Vetores;

import java.util.Scanner;

public class PesquisaAudiencia {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	int[] respostas = new int[5];
	int i;
	
	for (i=0; i < respostas.length; i++) {
		System.out.println("Digite o canal escolhido (números de 1 a 10): ");
		respostas[i] = sc.nextInt();
		
		if (respostas[i] == i) {
			respostas[i] = respostas[i] + 1;
		}
	}
	for (int j=0; j < respostas.length; j++) {
	System.out.println(respostas[j] + " pessoas assistem o canal " + j);
	}
	
	sc.close();
	}
	
	}


