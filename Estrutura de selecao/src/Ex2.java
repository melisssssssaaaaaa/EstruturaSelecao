import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Insira um valor: ");    
				int valor = input.nextInt();
				
				if(valor > 0) 
					System.out.println("Valor � positivo!");
				else if(valor < 0)
					System.out.println("Valor � negativo!");
				else
					System.out.println("O valor informado � zero!");	
				input.close();
			}
		}
