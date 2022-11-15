package ejemploentornos;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);  
			int numero;
			
			System.out.println("Introduzca un numero");
			numero= teclado.nextInt();
			
			while (numero<100) {
				numero= numero+1;
				System.out.println(numero);
			}
			
			
}
}