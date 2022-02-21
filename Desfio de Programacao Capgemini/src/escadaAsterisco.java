
public class escadaAsterisco {

	public static void main(String[] args) {		
		
		int n = 6;
		
		for (int i = 1; i <= n; i ++) {	// Controla cada linha.		
			for (int j = n-i; j >= 1; j --) {				
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // Imprime os asteriscos.			
				System.out.print("*");
			}			
			System.out.println("");
		}	
		
	}

}
