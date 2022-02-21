import java.util.ArrayList;


public class anagrama {

	public static void main(String[] args) {		
			
		String palavra = "roma";		
		
		ArrayList<Character>  lista = new ArrayList<Character>();		
		
		for (int i = 0; i < palavra.length(); i ++) {
			
				char letras = palavra.charAt(i);
				lista.add(letras);
				
			
		}
		System.out.println(lista);

	}

}
