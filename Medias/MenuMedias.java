/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média Aritmética
2. Média ponderada
3. Sair
Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles.
Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a
média ponderada.
Na opção 3, sair do programa.
Verifique a possibilidade de opção inválida, Neste caso, o programa deverá
mostrar uma mensagem.*/

package Medias;

import java.util.Scanner;

public class MenuMedias {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opcao;
		double n1, n2, n3, p1, p2, p3, media;
		
		
		System.out.println("\nDIGITE: "
					+ "\n1- MEDIA ARITMÉTICA"
					+ "\n2- MEDIA PONDERADA"
					+ "\n3- SAIR");
		opcao = input.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("NOTA 1: ");
			n1 = input.nextDouble();
			
			System.out.println("NOTA 2: ");
			n2 = input.nextDouble();
			
			media = (n1+n2)/2;
			
			System.out.printf("A média aritmética é: %.1f" + media);
			break;
		case 2:
			System.out.println("NOTA 1: ");
			n1 = input.nextDouble();
			
			System.out.println("PESO NOTA 1: ");
			p1 = input.nextDouble();
			
			System.out.println("NOTA 2: ");
			n2 = input.nextDouble();
			
			System.out.println("PESO NOTA 2: ");
			p2 = input.nextDouble();
			
			System.out.println("NOTA 3: ");
			n3 = input.nextDouble();
		
			System.out.println("PESO NOTA 3: ");
			p3 = input.nextDouble();
			
			media = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
			
			System.out.printf("A média ponderada é: %.1f", media);
			break;
		case 3:
			System.out.println("\nVOCÊ DIGITOU SAIR");
			System.exit(0);
		default:
			System.out.println("OPÇÃO INVÁLIDA");
		}

	}

}
