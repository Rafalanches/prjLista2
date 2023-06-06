package prjExercicio3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner SorveteNaChuva = new Scanner(System.in);
		
		int opcao;

	       double qtde;

	       
	       System.out.println("Menu da churrascaria fervente ");

	       System.out.println("100 - Cachorro Quente caprichado na salsicha - R$1,20");

	       System.out.println("101 - Bauru Simplório   - R$1,30");

	       System.out.println("102 - Bauru com um ovo, ou dois - R$1,50");

	       System.out.println("103 - Hambúrguer de quatro andares - R$1,20");

	       System.out.println("104 - Cheeseburguer de queijo bomba - R$1,30");
	       
	       System.out.println("105 - Pepsi geladinha - R$1,00");

	       System.out.println("Selecione o código");

	       opcao = SorveteNaChuva.nextInt();

	       System.out.println("Digite a Quantidade de Lanches");

	       qtde = SorveteNaChuva.nextDouble();


	       switch(opcao) {

	           case 100:

	               System.out.println("Total a Pagar = R$"+(1.20*qtde)+"0");

	               break;

	           case 101:

	               System.out.println("Total a Pagar = R$"+(1.30*qtde)+"0");

	               break;

	           case 102:

	               System.out.println("Total a Pagar = R$"+(1.50*qtde)+"0");

	               break;

	           case 103:

	               System.out.println("Total a Pagar = R$"+(1.20*qtde)+"0");

	               break;

	           case 104:

	               System.out.println("Total a Pagar = R$"+(1.30*qtde)+"0");

	               break;
	               
	           case 105:

	               System.out.println("Total a Pagar = R$"+(1.00*qtde)+"0");

	               break;
	               
	           default:

	               System.out.println("Não fazemos esse tipo de coisa aqui não mano:");

	               break;

	       


	       }
	}
}