import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro número");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		System.out.println("O resultado da soma desses números = " + soma);
			
		sc.close();

	}

}
