import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um n�mero:");
		int diadasemana = input.nextInt();
		
		switch (diadasemana) {
		case 1: System.out.println("Domingo");
			break;
		case 2: System.out.println("Segunda");
			break;
		case 3: System.out.println("Ter�a");
			break;
		case 4: System.out.println("Quarta");
			break;
		case 5: System.out.println("Quinta");
			break;
		case 6: System.out.println("Sexta");
			break;
		case 7: System.out.println("S�bado");
			break;
		default: System.out.println("O valor inserido � inv�lido.");
			break; }
		input.close();
	}

}
