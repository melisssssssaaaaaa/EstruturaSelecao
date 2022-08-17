import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		String situacao = null;
		String Conceito;
		
		System.out.println("Insira a primeira nota:");  
		float nota1 = input.nextFloat(); 
		System.out.println("Insira a segunda nota:");
		float nota2 = input.nextFloat();
		
		float media = (float) ((nota1 + nota2) / 2);
		
	
		if((media >= 9) && (media <= 10)) {
			Conceito = "Conceito A";
			situacao = "APROVADO";
		}else if((media >= 7.5) && (media < 9)) {
			Conceito = "Conceito B";
		situacao = "APROVADO";
		}else if((media >= 6) && (media < 7.5)) {
			Conceito = "Conceito C";
			situacao = "APROVADO";
		}else if((media >= 4) && (media < 6)) {
			Conceito = "Conceito D";
			situacao = "REPROVADO";
		}else if((media >= 0) && (media < 4)) {
			Conceito = "Conceito E";
			situacao = "REPROVADO";
		}
		System.out.println("As notas inseridas foram: " + nota1 + " , " + nota2);
		System.out.println("A média foi: " + media); 
		System.out.println("Situação: "+ situacao); 
	
		input.close();
	}

}
