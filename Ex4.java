import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hoursWork ;
		double salary, hoursValue;
		
		number = sc.nextInt();
		hoursWork = sc.nextInt();
		hoursValue = sc.nextDouble();
		
		salary = hoursWork * hoursValue;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
