import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {

Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um n�mero:");
		float num = input.nextFloat();
		
		if (num % 1 != 0)
			System.out.println("O n�mero � decimal.");
		else
			System.out.println("O n�mero � inteiro.");
		
		input.close();
	}

}
