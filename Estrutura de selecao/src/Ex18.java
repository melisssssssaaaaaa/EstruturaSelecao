import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a medida de um lado do tri�ngulo: "); 
		float l1 = input.nextFloat();
		System.out.println("Insira a medida do segundo lado do tri�ngulo: ");
		float l2 = input.nextFloat();
		System.out.println("Insira a medida do terceiro lado do tri�ngulo: "); 
		float l3 = input.nextFloat();
		
		if((l1 + l2 ) > l3)
			System.out.println("Pode sim ser um tri�ngulo.");
		else if((l1 + l3 ) > l2)
			System.out.println("Pode sim ser um tri�ngulo.");
		else if((l2 + l3 ) > l1)
			System.out.println("Pode sim ser um tri�ngulo.");
		else 
			System.out.println("N�o pode ser um tri�ngulo.");
		
		if((l1 == l2) && (l1 == l3))
			System.out.println("Trata-se de um tri�ngulo equil�tero.");
		else if((l1 == l2) || (l1 == l3) || (l3 == l2))
			System.out.println("Trata-se de um tri�ngulo is�sceles.");
		else 
			System.out.println("Trata-se de um tri�ngulo escaleno.");
		
		input.close();

	}

}
