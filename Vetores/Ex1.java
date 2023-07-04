package Exercicios;

/* Faça um programa que preencha três vetores com dez posições cada
um: o primeiro vetor, com os nomes de dez produtos; o segundo vetor,
com os códigos dos dez produtos; e o terceiro vetor, com os preços dos
produtos. Mostre um relatório apenas com o nome, o código, o preço e o
novo preço dos produtos que sofrerão aumento. Sabe-se que os
produtos que sofrerão aumento são aqueles que possuem código par ou
preço superior a R$ 1.000,00. Sabe-se ainda que, para os produtos que
satisfizerem às duas condições anteriores, código e preço, o aumento
será de 20%; para aqueles que satisfizerem apenas à condição do
código, o aumento será de 15%; e para aqueles que satisfizerem apenas
à condição de preço, o aumento será de 10%.*/

public class Ex1 {

	public static void main(String[] args) {
		
		String[] nomes = {"Agua", "Pão", "Arroz", "Fermento", "Ovo", "Açucar", "Veneno", "Leite", "Ração", "Vassoura"};
		Integer[] cod = {2, 4, 7, 1, 13, 15, 6, 22, 9, 41};
		Double[] preco = {1500.0, 5.3, 2.8, 1200.0, 453.2, 504.3, 290.2, 5463.3, 291.4, 1873.1};
		
		System.out.println("RELATÓRIO");
		System.out.println("NOME | COD | PRECO");
		for(int i=0; i<10; i++) {
			if(cod[i]%2 == 0 && preco[i] > 1000) {
				preco[i] = preco[i] + preco[i]*0.2;
				System.out.printf(nomes[i] + " | "+ cod[i] + " | " + preco[i] + "\n");
			} else if(cod[i]%2 == 0) {
				preco[i] = preco[i] + preco[i]*0.15;
				System.out.printf(nomes[i] + " | "+ cod[i] + " | " + preco[i] + "\n");
			} else if(preco[i] > 1000) {
				preco[i] = preco[i] + preco[i]*0.10;
				System.out.printf(nomes[i] + " | "+ cod[i] + " | " + preco[i] + "\n");
		}
		
		}

}
}
