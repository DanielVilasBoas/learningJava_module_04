import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, code2, quant1, quant2;
		double value1, value2, pagar;

		code1 = sc.nextInt();
		quant1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		code2 = sc.nextInt();
		quant2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		pagar = quant1 * value1 + quant2 * value2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
		
		sc.close();
	}

}
