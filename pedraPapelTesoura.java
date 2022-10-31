import java.util.Random;
import java.util.Scanner;

public class pedraPapelTesoura {

	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha, escolhaM;

		for (String continuar = "s"; continuar != "n"; continuar = continuar) {

			System.out.println("\n  0 representa pedra\n  1 representa papel\n  2 representa tesoura");

			System.out.println("Qual é sua escolha: ");
			escolha = sc.nextInt();

			System.out.print("Qual é a escolha da Maquina: \n");
			escolhaM = r.nextInt(2);
			System.out.print(escolhaM);

			if (escolha == 0 && escolhaM == 1) {

				System.out.println("\nO vencedor é a Maquina!");

			} else if (escolha == 1 && escolhaM == 0) {

				System.out.println("\nO vencedor é Você!");

			} else if (escolha == 1 && escolhaM == 2) {

				System.out.println("\nO vencedor é a Maquina!");

			} else if (escolha == 2 && escolhaM == 1) {

				System.out.println("\nO vencedor é Você!");

			} else if (escolha == 2 && escolhaM == 0) {

				System.out.println("\nO vencedor é a Maquina!");

			} else if (escolha == 0 && escolhaM == 2) {

				System.out.println("\nO vencedor é Você!");

			} else {
				System.out.println("\nEmpate");
			}

			System.out.print("deseja continuar?");
			continuar = sc.next();

		}

	}

}
