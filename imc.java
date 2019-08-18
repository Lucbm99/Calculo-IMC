//6. Crie um programa que faça as seguintes perguntas
//“Qual o seu nome?”
//“Qual o seu peso?”
//“Qual a sua altura?”
//O programa deve ler as informações solicitadas e imprimir o índice de massa corpórea(IMC) com base nos dados informados
//IMC ->peso/altura 2

package aula0508;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		String nome;
		double altura, peso, calculoIMC;
		
	     Scanner input = new Scanner(System.in);
	     
	     //entrada de dados e leitura dos mesmos do usuário (nome, peso, altura)
	     System.out.println("Digite seu nome: \n"); 
	     nome = input.nextLine();
	     System.out.println("Digite sua altura: \n");
	     altura = Double.parseDouble(input.next());
	     System.out.println("Digite seu peso: \n");
	     peso = Double.parseDouble(input.next());
	     
	     //variável que calcula o IMC --> peso/altura²
	     calculoIMC = peso / ((altura)*(altura));;
	     
	     //impressão dos dados
	     System.out.println("O IMC de "+ nome +" é igual a: "+ calculoIMC);
	     
	}
}