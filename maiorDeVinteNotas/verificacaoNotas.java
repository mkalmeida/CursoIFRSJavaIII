package maiorDeVinteNotas;

import java.util.Scanner;

public class verificacaoNotas {

	public static void main(String[] args) {

		int nota, menor, maior = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		nota = input.nextInt();
		
		maior = nota;
		menor = nota;
		
		for (int i = 1; i<=19; i++) {
			System.out.println("Digite a nota: ");
			nota = input.nextInt();
			
			if (nota>maior) {
				maior = nota;
			} else {
				if (nota<menor) {
					menor = nota;
				}
			}
			
		}
		
		System.out.println("A maior nota é: " + maior);
		System.out.println("A menor nota é: " + menor);
	}


}
