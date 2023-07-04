package Exercicios;

/*Faça um programa que preencha e mostre a média dos elementos da
diagonal principal de uma matriz 5 x 5.*/

public class Ex2 {

	public static void main(String[] args) {
		
		int[][] num = {{2,5,4,3,6},{1,23,4,3,5},{11,44,23,3,3},{87,5,5,43,1},{11,45,8,6,99}};
		int cont=0;
		double soma=0, media=0;
		int i, j;
		
			
			for (i = 0; i<5; i++) {
				for(j = 0; j<5; j++) {
					if(i==j) {
					System.out.print(num[i][j] + " ");
					soma = soma + num[i][j];
					cont++;
					}
				}
				System.out.println();
			}
			
			media = soma/cont;
			
			System.out.println("Média dos elementos da diagonal principal é: " + media);
			
		}
}
		



