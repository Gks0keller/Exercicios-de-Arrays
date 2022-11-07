import java.util.Scanner;

public class cadastroTelefone {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int quantidade, escolha=0,erro=0;
		int[] telefone;
		String[] nome;
		String procura;

		System.out.println("Quantos cadastros deseja fazer: ");
		quantidade = sc.nextInt();
		telefone = new int[quantidade];
		nome = new String[quantidade];
		
		for(;escolha!=3;escolha=escolha) {
			
		System.out.print(
				"------------\n"+"1 - Fazer cadastro\n" + "2 - Procurar Telefone\n" + "3 - Finalizar Programa\n" + "Escolha uma opção: ");
		escolha = sc.nextInt();
		System.out.println("------------");
		
		if (escolha == 1) {

			for (int i = 0; i < quantidade; i++) {
				System.out.println("Qual é seu nome: ");
				nome[i] = sc.next();

				System.out.println("Qual é seu Telefone 9xxxxxxxx: ");
				telefone[i] = sc.nextInt();

			}
		} else if(escolha==2) {
			System.out.print("Insira um nome: ");
			procura=sc.next();
			for(int i=0;i<quantidade;i++) {
				if(nome[i].equals(procura)) {
					System.out.println(nome[i]+" tem o telefone, "+telefone[i]);
				} else {
					erro++;
				}
				
			}
			if(erro==quantidade) {
				System.out.println("Nome não existente.");
			}
		} 

		}
	}
}
