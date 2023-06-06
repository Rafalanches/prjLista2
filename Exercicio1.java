package prjExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caqui = new Scanner(System.in);
		int num1, num2;
		byte opcao = 1;
		while ((opcao !=0) && (opcao<=4)) {
			System.out.println("Digite um numero: ");
			num1 = caqui.nextInt();
			System.out.println("Digite outro numero: ");
			num2 = caqui.nextInt();
			System.out.println("Escolha uma opcao meu nobre: ");
			System.out.println("(0) sair ");
			System.out.println("(1) somar ");
			System.out.println("(2) subtrair ");
			System.out.println("(3) multiplicar ");
			System.out.println("(4) dividir ");
			System.out.println("Qual é a tua opcao?: ");
			opcao = caqui.nextByte();
			
			switch(opcao) {
			 case 1:
	        	  System.out.println("A soma dos teus números é essa meu rei: "+(num1+num2));
	        	  break;
	    	 case 2:
	        	  System.out.println("A subtração dos teus números é essa meu consagrado: "+(num1-num2));
	        	  break;
	    	 case 3:
	        	  System.out.println("A multiplição dos seus números é essa meu nobre: "+(num1*num2));
	        	  break;
	    	 case 4:
	        	  System.out.println("A divisão dos seus números é essa meu bom:"+(num1/num2));
	        	  break;
			}


		}
	}
}