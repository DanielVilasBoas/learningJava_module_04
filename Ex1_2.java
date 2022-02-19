import java.util.Scanner;

public class Ex1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.printf("Soma = %d", soma);
		
		sc.close();
	}

}
