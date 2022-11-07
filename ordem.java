import java.util.Scanner;

public class ordem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int quantidade;
		int[] array;

		System.out.println("Qual é o tamanho do vetor: ");
		quantidade = sc.nextInt();
		array = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Insira um número: ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " é  " + array[i]);
		}

	}
}
