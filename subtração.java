import java.util.Scanner;

public class subtração {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] a=new int[10],b=new int[10],c=new int[10];
		
		for(int i=0;i<a.length;i++) {
			
		System.out.print("Insira um número inteiro: ");
		a[i]=sc.nextInt();
		
		System.out.print("Insira um número inteiro: ");
		b[i]=sc.nextInt();
		
		c[i]=a[i]-b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			
			System.out.println(c[i]+" é a subtração de "+a[i]+" menos "+b[i]);
		}
	}
}
