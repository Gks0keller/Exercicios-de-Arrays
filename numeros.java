import java.util.Scanner;

public class numeros {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] vetor=new int[10];
		int referencia,vezes=0;
		
		for(int i=0;i<10;i++) {
			
		System.out.print("Insira um número: ");
		vetor[i]=sc.nextInt();
		System.out.println();
		}
		
		System.out.println("qual é o número referência: ");
		referencia=sc.nextInt();
		
		System.out.println("os números a cima do valor referência são: ");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]>referencia) {
				System.out.println(vetor[i]+" que está na posição: "+i);
			}
		}
		System.out.println("os números abaixo do valor referência são: ");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]<referencia) {
				System.out.println(vetor[i]+" que está na posição: "+i);
			}
		}
		System.out.println("Quantas vezes o valor referência aparece: ");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]==referencia) {
				vezes++;
			}
		}
		System.out.println(vezes);
	}
}
