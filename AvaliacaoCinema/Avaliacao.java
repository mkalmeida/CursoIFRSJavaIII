package AvaliacaoCinema;

import java.util.Scanner;


public class Avaliacao {

	static Scanner input = new Scanner(System.in);
	static char opcao;
	static int a, b, c, d, e, idadeD, idadeE, idadeA, idadeB, idadeC, sIdadeD, sIdadeE;
	
	public static void avaliacao() {
		
		System.out.println("DIGITE A OPÇÃO DESEJADA:");
		System.out.println("A-ÓTIMO" + "\n" + "B-BOM" + "\n" + "C-REGUGAR" + "\n" + "D-RUIM" + "\n" + "E-PÉSSIMO");
		opcao = input.next().charAt(0);
		switch (opcao) {
		case 'A':
			a = a + 1;	
			System.out.println("Digite a sua idade: ");
			idadeA = input.nextInt();
			break;
		case 'B':
			b = b + 1;
			System.out.println("Digite a sua idade: ");
			idadeB = input.nextInt();
			break;
		case 'C':
			c = c + 1;
			System.out.println("Digite a sua idade: ");
			idadeC = input.nextInt();
			break;
		case 'D':
			d = d + 1;
			System.out.println("Digite a sua idade: ");
			idadeD = input.nextInt();
			sIdadeD = sIdadeD + idadeD;
			break;
		case 'E':
			e = e + 1;
			System.out.println("Digite a sua idade: ");
			idadeE = input.nextInt();
			sIdadeE = sIdadeE + idadeE;
			break;
			
		}
		
		
	}
	
}
