package Exercicios;
/*Crie um programa que preencha uma matriz 5 x 5 de números reais,
calcule e mostre a soma dos elementos da diagonal secundária.*/
public class Ex3 {

	public static void main(String[] args) {
		int[][] num = {{2,5,4,3,6},{1,23,4,3,5},{11,44,23,3,3},{87,5,5,43,1},{11,45,8,6,99}};
		int soma=0;
		int i, j;
		
			
			for (i = 0; i<5; i++) {
				for(j = 0; j<5; j++) {
					if(i+j==4) {
					System.out.print(num[i][j] + " ");
					soma = soma + num[i][j];
					}
				}
				System.out.println();
			}
	
			System.out.println("A soma dos elementos da diagonal principal é: " + soma);
	}

}
