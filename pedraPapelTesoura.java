import java.util.Random;
import java.util.Scanner;

public class pedraPapelTesoura {

	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha, escolhaM,m=0,e=0;

		for (;(m<3 && e<3);) {

			System.out.println("\n  0 representa pedra\n  1 representa papel\n  2 representa tesoura");

			System.out.println(" Qual é sua escolha: ");
			escolha = sc.nextInt();

			System.out.print(" Qual é a escolha da Maquina: \n");
			escolhaM = r.nextInt(2);
			System.out.println(escolhaM);

			if (escolha == 0 && escolhaM == 1) {

				System.out.println(" Ele ganhou.");
				m++;
				
			} else if (escolha == 1 && escolhaM == 0) {

				System.out.println(" Eu ganhei.");
				e++;
				
			} else if (escolha == 1 && escolhaM == 2) {
				
				System.out.println(" Ele ganhou.");
				m++;
				
			} else if (escolha == 2 && escolhaM == 1) {
				
				System.out.println(" Eu ganhei.");
				e++;

			} else if (escolha == 2 && escolhaM == 0) {

				System.out.println(" Ele ganhou.");
				m++;
				
			} else if (escolha == 0 && escolhaM == 2) {
				
				System.out.println(" Eu ganhei.");
				e++;
				
			} else {
				System.out.println("\nEmpate");
			}
			

		}
		
		if(m>e) {
			System.out.println(" Maquina Ganhou!!");
		} else {
			System.out.println(" Você Ganhou!!");
		}

	}

}
