/* Ex 9*/

package OperacoesSalario;

import java.util.Scanner;

public class OpcoesFuncionarios {

	public static void main(String[] args) {

		double salario, salarioFinal, mesesTrabalho;
		int opcao = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("DIGITE: ");
		System.out.println("1 - NOVO SALARIO" + "\n" + "2 - FÉRIAS" + "\n" + "3 - DECIMO TERCEIRO" + "\n" + "4 - SAIR");
		opcao = input.nextInt();
		
			
		switch (opcao) {
		case 1: 
			System.out.println("Digite o salário: ");
			salario = input.nextDouble();
			
			if(salario<=1000) {
				salarioFinal = salario + salario*0.15;
				System.out.println("O novo salário com acréscimo de 15% é: R$" + salarioFinal);
			} else if (salario >= 1000.01 && salario <= 3000) {
				salarioFinal = salario + salario*0.10;
				System.out.println("O novo salário com acréscimo de 10% é: R$" + salarioFinal);
			} else if (salario > 3000) {
				salarioFinal = salario + salario*0.05;
				System.out.println("O novo salário com acréscimo de 5% é R$" + salarioFinal);
			}
			break;
		case 2: 
			System.out.println("Digite o salário: ");
			salario = input.nextDouble();
			salarioFinal = salario + (salario/3);
			System.out.println("O novo salário referente as férias é: R$" + salarioFinal);
			break;
		case 3: 
			System.out.println("Digite o salário: ");
			salario = input.nextDouble();
			System.out.println("Digite o tempo de trabalho em meses (max 12): ");
			mesesTrabalho = input.nextInt();
			salarioFinal = salario*(mesesTrabalho/12);
			System.out.println("O décimo terceiro salário é: R$" + salarioFinal);
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		case 4: 
			System.out.println("Você digitou sair");
			System.exit(0);
			
		}
		
		input.close();

	}

}
