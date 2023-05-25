package JogoDeAdivinhacao;

import java.util.Scanner;

public class jogarNovamente {
	
	static Scanner input = new Scanner(System.in);
	static int opcao;
	
	public static void jogar() {
		System.out.println("PARABÉNS!");
		System.out.println("\nDIGITE: "
				+ "\n1- SORTEAR MAIS UM NÚMERO"
				+ "\n2- SAIR");
		opcao = input.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("_______________");
			System.out.println("\nNÚMERO SORTEADO");
			System.out.println("_______________");
			Analise.palpiteLoop();
			break;
		case 2:
			System.out.println("\nVOCÊ DIGITOU SAIR");
			System.out.println("Volte Sempre!");
			System.exit(0);
		}
		
	}
}
