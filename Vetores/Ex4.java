package Exercicios;

import java.util.Scanner;

/*Faça um programa que leia dois vetores (A e B) com cinco posições.
Cada vetor deverá armazenar números inteiros. O programa deve,
então, subtrair o primeiro elemento de A do último de B, acumulando o
valor; subtrair o segundo elemento de A do penúltimo de B, acumulando
o valor, e assim por diante. Ao final, mostre o resultado de todas as
subtrações realizadas.*/

public class Ex4 {

	public static void main(String[] args) {

		Integer[] a = new Integer[5];
		Integer[] b = new Integer[5];
		Integer[] result = new Integer[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valores para o vetor A: ");	
		for(int i = 0; i<5;i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Digite valores para o vetor B: ");	
		for(int j = 0; j<5;j++) {
			b[j] = sc.nextInt();
		}

		for(int i = 0; i<=4;i++) {
			result[i] = a[i] - b[4-i];
			System.out.println(result[i]);
		}

		sc.close();
	}



}


