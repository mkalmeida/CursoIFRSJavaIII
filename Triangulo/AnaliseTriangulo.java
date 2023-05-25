package Triangulo;

import java.util.Scanner;


public class AnaliseTriangulo {

	public static void main(String[] args) {
	
	System.out.println("=======================================");
	System.out.println("Boas vindas ao contrutor de triangulos");
	System.out.println("=======================================");
	System.out.println("Aqui você descobrirá se as medias que você digitou formam um triangulo e, em caso positivo,"
			+ " saberá se é do tipo EQUILÁTERO, ESCALENO OU ISÓSCELES");
	menu();
	
	}
	
	static int a, b, c, soma;
	
	static Scanner input = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("\nDIGITE A OPÇÃO DESEJADA:");
		System.out.println("1 - DIGITAR VALORES" + "\n" + "2 - SAIR");
		int opcao = input.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o valor de A: ");
			a = input.nextInt();
			System.out.println("Digite o valor de B: ");
			b = input.nextInt();
			System.out.println("Digite o valor de C: ");
			c = input.nextInt();
			
			if (a+b>c && b+c>a && a+c >b) {
				if (a==b || a==c || c==b ) {
					System.out.println("O tringulo é ISÓSCELES");
					menu();
				} else {
					if (a==b && a==c) {
						System.out.println("O tringulo é EQUILATERO");
						menu();
					} else {
						if(a!=b && a!=c && b!=c) {
							System.out.println("O tringulo é ESCALENO");
							menu();
						}
					}
				}
				
			} else {
				System.out.println("As medidas informadas não formam um triângulo");
				menu();
			}
			break;
		case 2:
			System.out.println("\nVOCÊ DIGITOU SAIR");
			System.out.println("Volte Sempre!");
			System.exit(0);
		}
	}

}
