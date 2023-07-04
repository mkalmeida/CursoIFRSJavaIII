package Exercicios;

import java.util.Scanner;

/*Faça um programa que receba cinco números e mostre a saída a seguir:
Digite o 1º número: 5
Digite o 2º número: 3
Digite o 3º número: 2
Digite o 4º número: 0
Digite o 5º número: 2
Os números digitados foram:
5 + 3 + 2 + 0 + 2 = 12
*/

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer[] num = new Integer[5];
		
		int soma=0;
		
		for (int i =0; i<=4; i++) {
			System.out.println("Digite o " + (i+1) +"° numero: ");
			num[i] = sc.nextInt();
			soma += num[i];
		}
	
		System.out.println("Os números digitados foram: ");
		System.out.println(num[0] + " + " + num[1] + " + " + num[2] + " + " + num[3] + " + " + num[4] + " = " + soma);
		
		sc.close();


	}

}
