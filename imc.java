//6. Crie um programa que fa�a as seguintes perguntas
//�Qual o seu nome?�
//�Qual o seu peso?�
//�Qual a sua altura?�
//O programa deve ler as informa��es solicitadas e imprimir o �ndice de massa corp�rea(IMC) com base nos dados informados
//IMC ->peso/altura 2

package aula0508;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		String nome;
		double altura, peso, calculoIMC;
		
	     Scanner input = new Scanner(System.in);
	     
	     //entrada de dados e leitura dos mesmos do usu�rio (nome, peso, altura)
	     System.out.println("Digite seu nome: \n"); 
	     nome = input.nextLine();
	     System.out.println("Digite sua altura: \n");
	     altura = Double.parseDouble(input.next());
	     System.out.println("Digite seu peso: \n");
	     peso = Double.parseDouble(input.next());
	     
	     //vari�vel que calcula o IMC --> peso/altura�
	     calculoIMC = peso / ((altura)*(altura));;
	     
	     //impress�o dos dados
	     System.out.println("O IMC de "+ nome +" � igual a: "+ calculoIMC);
	     
	}
}