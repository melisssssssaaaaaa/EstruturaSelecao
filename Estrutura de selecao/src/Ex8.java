import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Insira o valor da primeira nota.");
		Float nota1 = input.nextFloat();
		System.out.println("Insira o valor da segunda nota.");
		Float nota2 = input.nextFloat();
		
		float mediaf = ((nota1 + nota2 )/2);
		if ((mediaf >= 7 ))
		System.out.println("Aluno aprovado!");
		else if ((mediaf < 7 ))
		System.out.println("Aluno reprovado!");
		input.close();
	}

}
