import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número:");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par.");
		}else if (num % 2 != 0) {
			System.out.println("O número é impar.");
	}
		input.close();
	}

}
