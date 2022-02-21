import java.util.regex.Pattern;

public class senha {

	public static void main(String[] args) {
		
		String senha = "Azc&2B"; // Vari�vel que rece be a senha digitada pelo usu�rio.
		
		boolean retorno = false; // Vari�vel do tipo Boolean que receber� o estado da busca na string regex.
		
		// String regex, abaixo, que cont�m a express�o regular, ir� verificar se a string senha tem os requisitos de preenchimentos v�lidos.
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$";
		
		// Aqui a vari�vel retorno recebe a opera��o feita utilizando Pattern para compilar a express�o regular enviada pela vari�vel regex.
		// E o matcher() compara a express�o, ap�s a sua compila��o, com a string senha. O find() faz a busca na string toda.
		retorno = Pattern.compile(regex).matcher(senha).find();
		
		//Caso a senha tenha no m�nimo 6 caracteres a vari�vel retorno � verificada.
		//Caso n�o tenha o tamanho m�nimo o la�o � interrompido e o fluxo pula para o �ltimo else que exibir� as mensagens de alerta e orienta��o ao usu�rio.
		if (senha.length() >= 6) {  
			
			if (retorno == true) { // Caso a vari�vel retorno tenha o seu valor true, ser� exibida a mensagem abaixo.				
				
				System.out.println("A senha que voc� digitou, est� OK! " + senha);
			// Caso a vari�vel retorno receba o valor false, as mensagens abaixo seram exibidas.	
			}else {
				System.out.println("Voc� digitou a seguinte senha: " + senha);
				System.out.println("A senha deve ter no m�nimo 6 caracteres, incluindo 1 letra mai�sculas, min�sculas, n�meros e caracteres especiais.");
			}			
			
		}else {			
			
			System.out.println("A senha que voc� digitou n�o tem os requisitos minimos necess�rios. Voc� precisa adicionar mais " + (6 - senha.length()) + " caracteres.");
			
			System.out.println("A senha deve ter no m�nimo 6 caracteres, incluindo 1 letra mai�sculas, min�sculas, n�meros e caracteres especiais.");			
			
		}	
		
	}	

}
