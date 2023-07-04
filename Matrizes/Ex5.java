package Exercicios;
/*Faça um programa que receba:
 as notas de 10 alunos em cinco provas diferentes e armazene-as
em uma matriz 10 x 5;
 os nomes dos 10 alunos e armazene-os em um vetor de 10
posições.
O programa deverá calcular e mostrar, para cada aluno, o nome, a
média aritmética das cinco provas e a situação (aprovado, reprovado ou
exame). Um estudante estará aprovado se atingiu média maior ou igual
a sete, estará reprovado se atingiu média inferior a dois e em exame se
atingiu média entre 2 e 7.*/

public class Ex5 {

	public static void main(String[] args) {
		String[] nome = {"João", "Ana", "Paulo", "Carla", "Viviane", "Claudio", "Vinicius", "José", "Andrea", "Clara"};
		double[][] notas = {{10,5,9,8,7},{5,3,6,9,7},{10,2,10,9,9},{7,9,6,2,4},{10,8,9,1,2},{5,1,3,6,10},{10,10,10,1,0},{3,1,7,10,9},{2,3,5,10,8},{9,7,3,5,2}};
		double[] soma = new double[10];
		double[] media = new double[10];
		
		for (int i=0;i<10;i++) {
			for (int j=0; j<5;j++) {
				soma[i] = soma[i] + notas[i][j];
				media[i] = soma[i]/5;
			}
			
		}
		
		for (int i=0;i<10;i++) {
				System.out.println(nome[i]+" "+media[i]);
				if(media[i]>=7) {
					System.out.println("APROVADO");
					System.out.println();
				}else if(media[i]>2 && media[i]<7) {
					System.out.println("EXAME");
					System.out.println();
				}else {
					System.out.println("REPROVADO");
					System.out.println();
				}
		}
		

	}

}
