package Exercicios;

/*Faça um programa que leia um vetor com 20 posições contendo
números inteiros. Logo após, divida todos os seus elementos pelo maior
valor do vetor e os armazene em outro vetor. Mostre, ao final, os valores
armazenados em todas as posições do vetor após os cálculos.*/

public class Ex5 {

	public static void main(String[] args) {
		
		Integer[] num = {32,61,42,74,6,95,34,54,34,76,8,7,56,76,2,112,3,24,54,6};
		Double[] div = new Double[20];
		
		Integer maior;
		
		maior = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>maior) {
				maior=num[i];
			}
			
		}
		System.out.println("O maior num é: " + maior);
		System.out.println();
		for(int i=0; i<num.length;i++) {
			div[i] = (double) num[i]/maior;
			System.out.println(div[i]);
		}
		

	}

}
