import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor a ser verificado");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Nao Negativo");
		}	
		else {
		System.out.println("Negativo");
		}
		sc.close ();
		}
	
	}


