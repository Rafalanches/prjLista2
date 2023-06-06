package prjExercicio4;

import java.util.Scanner;

	public class exercicio4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner JoguinhoLegal = new Scanner(System.in);
			
			double sal1,bonus1,bonus2,bonus3,bonus4;
			
			System.out.println("Qual é o seu salário?: ");
			sal1 = JoguinhoLegal.nextDouble();
			
			bonus1 = (sal1/100)*25;
			bonus2 = (sal1/100)*15;
			bonus3 = (sal1/100)*10;
			bonus4 = (sal1/100)*5;

			if(sal1<=1000) {
				System.out.println("O seu salário antigo era:"+sal1);
				System.out.println("O percentual de bonus no seu salário vai ser de 25%");
				System.out.println("O bonus no seu salário vai ser de:"+ bonus1);
				System.out.println("O seu salário atual vai ser de:"+(sal1+bonus1));
			}else if((sal1>=1500) && (sal1<=1800)){
				System.out.println("O seu salário antigo era:"+sal1);
				System.out.println("O percentual de bonus no seu salário vai ser de 15%");
				System.out.println("O bonus no seu salário vai ser de:"+ bonus2);
				System.out.println("O seu salário atual vai ser de:"+ (sal1+bonus2));
			}else if((sal1>=2000) && (sal1<=2500)){
				System.out.println("O seu salário antigo era:"+sal1);
				System.out.println("O percentual de bonus no seu salário vai ser de 10%");
				System.out.println("O bonus no seu salário vai ser de:"+ bonus3);
				System.out.println("O seu salário atual vai ser de:"+ (sal1+bonus3) );
			}else if(sal1>2500){
				System.out.println("O seu salário antigo era:"+sal1);
				System.out.println("O percentual de bonus no seu salário vai ser de 5%");
				System.out.println("O bonus no seu salário vai ser de:"+ bonus4);
				System.out.println("O seu salário atual vai ser de:"+(sal1+bonus4));
			}
			
		        	  
		}
}
	// ATIVIDADE N°05 DENTRE AS SOLICITADAS.