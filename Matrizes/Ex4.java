package Exercicios;

/*A prefeitura da cidade A realizou um concurso para seleção de técnicos
em informática. O concurso consistiu em uma prova contendo cinco
questões objetivas com cinco alternativas cada (A, B, C, D ou E). Ao
todo, cinco candidatos fizeram as provas.
Faça um programa em Java que leia uma matriz 5x5 contendo as
respostas de todos os candidatos. Cada linha da matriz conterá as
respostas de um candidato à cada uma das questões. O programa
também deve ler um vetor de 10 posições contendo o gabarito da prova.
Ao final, o programa deve mostrar o total de pontos obtidos por cada
candidato.
*/

public class Ex4 {
	
	public static void main (String[] args) {
	
	String[] nome = {"João", "Ana", "Paulo", "Carla", "Viviane"};
	char[][] alunos = {{'a','c','b','d','e'},{'b','c','c','a','c'},{'a','a','c','d','d'},{'c','c','a','a','e'},{'e','e','a','a','b'}};
	char[] gabarito = {'a','c','b','d','e'};
	int[][] pontos = new int[5][5];
	int[] soma = new int[5];
	
	int i=0;
	
	for (i=0; i<5;i++) {
		for(int j=0; j<5; j++) {
			if(alunos[i][j] == gabarito[j]) {
				pontos[i][j]=1;
			} else {
				pontos[i][j]=0;
			}
		}
		
	}
	System.out.println("*****NOTAS FINAIS*****");
	for (i=0; i<5;i++) {
		for(int j=0; j<5; j++) {
			soma[i] = soma[i] + pontos[i][j];
		}
		System.out.print(nome[i] + " " + soma[i] +"\n");
	}

	
}
}
