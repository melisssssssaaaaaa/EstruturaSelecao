import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		double fileduplo = 4.90, fileduplo2 = 5.80;
		double alcatra = 5.90, alcatra2 = 6.80;
		double picanha = 6.90, picanha2 = 7.80;
		double valor=0,desconto = 0, valordesconto;
		
		
		System.out.println("Qual a carne desejada? FD - Fil� Duplo; A - Alcatra; P - Picanha-");
		String tipo = input.nextLine();
		System.out.println("Quantidade de carne desejada:" );
		float kg = input.nextFloat();
		System.out.println("Tipo de pagamento: Cart�o Tabajara?(true). Se n�o, false.");
		boolean cartao = input.nextBoolean();
		
		if(("FD".equalsIgnoreCase(tipo)) && (kg <= 5))  
	        valor = kg * fileduplo;
		 else if(("FD".equalsIgnoreCase(tipo)) && (kg > 5))  
		      valor = kg * fileduplo;
		
		if(("A".equalsIgnoreCase(tipo)) && (kg <= 5))
             valor = kg * alcatra;
		else if(("A".equalsIgnoreCase(tipo)) && (kg > 5)) 
     	        valor = kg * alcatra2;
		          
		if(("P".equalsIgnoreCase(tipo)) && (kg <= 5))
			valor = kg * picanha;
		else if(("P".equalsIgnoreCase(tipo)) && (kg > 5)) 
			valor = kg * picanha2;	
		
		if(cartao == true) 
			desconto = ((valor/100)*5);
			valordesconto = (valor-desconto);
		
		System.out.println("Tipo de carne escolhido: " + tipo);
		System.out.println("Quantidade de carne desejada: " + kg);
		System.out.println("Pre�o total ser�: R$ " + valor);
		System.out.println("Cart�o Tabajara? " + cartao);
		System.out.println("O valor do desconto ser�: R$ " + desconto);
		System.out.println("O valor a pagar ser�: R$" + valordesconto);
		
		input.close();
	}

}
