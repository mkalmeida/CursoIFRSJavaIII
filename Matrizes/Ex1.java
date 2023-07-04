package Exercicios;

/*Elabore um programa que preencha uma matriz 6 x 4, calcule e
armazene o maior elemento de cada linha e multiplique cada linha por
seu respectivo maior elemento. Mostre a matriz resultante.*/

public class Ex1 {
	
	public static void main (String[] args) {
		
		int[][] num = {{2,5,4,3},{1,23,4,35},{11,44,23,33},{87,55,43,1},{11,45,86,99},{12,65,43,76}};
		int[][] result = new int[6][4];
		int i=0,j=0, maior=0;
		
		for (i = 0; i<6; i++) {
			for(j = 0; j<4; j++) {
				if(j==0) {
					maior = num[i][j];
				} else if(num[i][j] > maior) {
					maior = num[i][j];
				}
				
			}
			for(j=0;j<4;j++){
				result[i][j] = num[i][j]*maior;
			}
			
		}
		
		
		for (i = 0; i<6; i++) {
			for(j = 0; j<4; j++) {
				System.out.print(result[i][j] + " ");
			}	
			System.out.println();
		}
		
	}

}
