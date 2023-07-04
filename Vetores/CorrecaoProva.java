package Vetores;

import java.util.Scanner;

public class CorrecaoProva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long[] matricula = new long [2];
		char[] questoes = new char[5];
		char[] gabarito = new char[5];

		int acertos =0;
		
		System.out.println("-----------GABARITO-----------");
		for(int k=0; k < questoes.length;k++) {
			System.out.println("Digite o gabarito da questão" + (k+1));
			gabarito[k] = sc.next().charAt(0);
		}
		
		
		for(int i=0; i < matricula.length;i++) {
		System.out.println("ALUNO " +(i+1));
		System.out.println("Digite a matrícula do " + (i+1) +"° aluno: ");
		matricula[i] = sc.nextLong();
			for (int j=0; j <questoes.length; j++) {
			System.out.println("Digite a resposta da questão " +(j+1));
			questoes[j] = sc.next().charAt(0);
				
				if (questoes[j] == gabarito[j] && matricula[j] == matricula[i]) {
					acertos = acertos + 1;
					}
				}
				System.out.println("O número de acertos do aluno de matricula " +matricula[i]+ " é: " +acertos);
			}
		
		}
	}


