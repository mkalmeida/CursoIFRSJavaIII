package JogoDeAdivinhacao;

import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);
	static int opcao;
	int p;
	
	public static void tentarNovamente() {
		System.out.println("\nDIGITE: "
				+ "\n1- TENTAR NOVAMENTE"
				+ "\n2- SAIR");
		opcao = input.nextInt();
		switch (opcao) {
		case 1:
			Analise.palpiteLoop();
			break;
		case 2:
			System.out.println("\nVOCÊ DIGITOU SAIR");
			System.out.println("Volte Sempre!");
			System.exit(0);
		}
}
}