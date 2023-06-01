/*Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas
informações para cada habitante, calcule e mostre:
 a média dos salários do grupo;
 a maior e a menor idade do grupo;
 a quantidade de mulheres com salário até R$ 1500,00;
 a idade e o sexo da pessoa que possui o menor salário.
Finalize a entrada de dados ao ser digitada uma idade negativa.*/

package PesquisaDemografica;

import java.util.Scanner;

public class PesquisaHabitantes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, maiorIdade=0, menorIdade=0, qtd=0, qtdPessoas=0, i=0, idadePessoa=0;
		double salario, salarioTotal = 0, mediaSalarios=0, menorSalario=0;
		char sexo, sexoPessoa = 0;
		
		System.out.println("IDADE: ");
		idade = input.nextInt();
		
		System.out.println("SEXO (somente M ou F): ");
		sexo = input.next().charAt(0);
		
		if (sexo=='f'||sexo=='F' || sexo=='m'||sexo=='M') {
		} else {
			 throw new IllegalArgumentException("Somente M ou F");
		}
		
		System.out.println("SALÁRIO: ");
		salario = input.nextDouble();
		
		salarioTotal = salario;
		
		maiorIdade = idade;
		
		menorIdade = idade;
		
		menorSalario = salario;
		
		if((sexo=='f'||sexo=='F') && salario<=1500){
			qtd = qtd + 1;
		}
		
		for (i = 1; i>0;i++){
			
			System.out.println("IDADE: ");
			idade = input.nextInt();
			
			if (idade<0) {
				
				mediaSalarios = salarioTotal/i;
				
				System.out.println("*******RESULTADOS DA PESQUISA*******\n");
				
				System.out.println("A média de salários do grupo é: R$ "+ mediaSalarios);
				System.out.println("A quantidade de mulheres com salário até R$ 1500,00 é: "+ qtd);
				break;
			}
			
			System.out.println("SEXO (somente M ou F): ");
			sexo = input.next().charAt(0);
			
			if (sexo=='f'||sexo=='F' || sexo=='m'||sexo=='M') {
			} else {
				 throw new IllegalArgumentException("Somente M ou F");
			}
			
			System.out.println("SALÁRIO: ");
			salario = input.nextDouble();
			
			salarioTotal = salario + salarioTotal;
			
			if((sexo=='f'||sexo=='F') && salario<=1500){
				qtd = qtd + 1;
			}
			
			if (idade>maiorIdade) {
				maiorIdade = idade;
			} else if (idade<menorIdade){
				menorIdade = idade;
			}
			
			if (salario<menorSalario) {
				menorSalario = salario;
			}
			
			if (salario == menorSalario) {
				idadePessoa = idade;
				sexoPessoa = sexo;
			}
	
		}
		
		System.out.println("A maior idade do grupo é: "+ maiorIdade);
		System.out.println("A menor idade do grupo é: "+ menorIdade);
		System.out.println("O menor salario é: R$ "+menorSalario+ " e é referente a uma pessoa de sexo "+sexoPessoa+" e idade "+ idadePessoa);
		}
	}

