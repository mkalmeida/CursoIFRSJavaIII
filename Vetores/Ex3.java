package Exercicios;

/*Faça um programa que receba o nome de oito clientes de uma
videolocadora e armazene-os em um vetor. Em um segundo vetor,
armazene a quantidade de DVDs locados em 2017 por cada um dos oito
clientes. Sabe-se que, para cada dez locações, o cliente tem direito a
uma locação grátis. Faça um programa que mostre o nome de todos os
clientes, com a quantidade de locações grátis a que ele tem direito.*/

public class Ex3 {

	public static void main(String[] args) {
		
		String[] nomes = {"Paula", "Anderson", "Vinicius", "Alex", "João", "Viviane", "Talita", "Paula"};
		Integer[] dvd = {30, 4, 7, 45, 13, 15, 6, 22};
		Integer[] gratis = new Integer[8];
		
		for(int i=0; i<8;i++) {
			if(dvd[i]>=10) {
				gratis[i] = dvd[i]/10;	
			} else {
				gratis[i] = 0;
			}
		}
		System.out.println("NOME | LOC. GRATIS");
		for(int i=0; i<8; i++) {
			System.out.println(nomes[i]+" | " + gratis[i]);
		}

	}

}
