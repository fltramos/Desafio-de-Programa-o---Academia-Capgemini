import java.util.regex.Pattern;

public class senha {

	public static void main(String[] args) {
		
		String senha = "Azc&2B"; // Variável que rece be a senha digitada pelo usuário.
		
		boolean retorno = false; // Variável do tipo Boolean que receberá o estado da busca na string regex.
		
		// String regex, abaixo, que contém a expressão regular, irá verificar se a string senha tem os requisitos de preenchimentos válidos.
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$";
		
		// Aqui a variável retorno recebe a operação feita utilizando Pattern para compilar a expressão regular enviada pela variável regex.
		// E o matcher() compara a expressão, após a sua compilação, com a string senha. O find() faz a busca na string toda.
		retorno = Pattern.compile(regex).matcher(senha).find();
		
		//Caso a senha tenha no mínimo 6 caracteres a variável retorno é verificada.
		//Caso não tenha o tamanho mínimo o laço é interrompido e o fluxo pula para o último else que exibirá as mensagens de alerta e orientação ao usuário.
		if (senha.length() >= 6) {  
			
			if (retorno == true) { // Caso a variável retorno tenha o seu valor true, será exibida a mensagem abaixo.				
				
				System.out.println("A senha que você digitou, está OK! " + senha);
			// Caso a variável retorno receba o valor false, as mensagens abaixo seram exibidas.	
			}else {
				System.out.println("Você digitou a seguinte senha: " + senha);
				System.out.println("A senha deve ter no mínimo 6 caracteres, incluindo 1 letra maiúsculas, minúsculas, números e caracteres especiais.");
			}			
			
		}else {			
			
			System.out.println("A senha que você digitou não tem os requisitos minimos necessários. Você precisa adicionar mais " + (6 - senha.length()) + " caracteres.");
			
			System.out.println("A senha deve ter no mínimo 6 caracteres, incluindo 1 letra maiúsculas, minúsculas, números e caracteres especiais.");			
			
		}	
		
	}	

}
