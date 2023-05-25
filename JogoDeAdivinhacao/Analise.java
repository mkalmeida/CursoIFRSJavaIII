package JogoDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Analise {

	static Scanner input = new Scanner(System.in);
	int opcao;
	static int p;
	
	static Random random = new Random();
	
	static int n = random.nextInt(10);
	
	public static void palpiteLoop() {
		System.out.println("\nDigite seu palpite: ");
		p = input.nextInt();
		
		if(p>n) {
			System.out.println("\nMUITO ALTO");
			Menu.tentarNovamente();
		} else {
			if(p<n) {
				System.out.println("\nMUITO BAIXO");
				Menu.tentarNovamente();
			} else {
				if (p==n) {
					System.out.println("\nVOCÊ ACERTOU!");
					jogarNovamente.jogar();
				}
			}
		}
		
}
}