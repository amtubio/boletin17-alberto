package boletin17;

import java.util.ArrayList;

//public para que me salga no javadoc e sean visible para todos o facer commit xa me sube o javadoc
public class DNI {
	/**
	 * Recibe un DNI e comproba si e valido
	 * 
	 * @param numeroLetra
	 * @return
	 */
	public boolean eValido(String numeroLetra) {
		// CADA letra tienen una posicion de 0 a 22 y tiene un orden especifico
		// t=posicion 0 y asi sucesivamente hasta E que es la 22

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (numeroLetra.length() != 9) {
			return false;
		}

		// comprueba la longitud de numeroltra si es distinta de 9
		if (numeroLetra.length() == 9) {

			// hago un bucle donde me saca el valor que tiene la cadena string
			
			for (int i = 0; i < 7; i++) {
				char numero = numeroLetra.charAt(i);// en cada posicion hasta 8
				if (numero >= 0 || numero == 9) {

					int Cnumero = Integer.parseInt(numeroLetra);
					int LeObtida = Cnumero % 23;
					return true;
				}

			}
			
		}
		return false;	
	}
	
	/**
	 * Recibe o numero do DNI e calcula a letra
	 * 
	 * @param numero
	 * @return
	 */
	public int calculaLetra(String numero) {

		if (numero.length() != 8) {
			return -1;
		}
		// convertimos string numero en una variable int numeroint para facer
		// %23
		int numeroint = Integer.parseInt(numero);

		int Lobtida = numeroint % 23;
		// creamos un arrays de string
		String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";

		// creo a variable letra e que me devolva a posicion da letra no array
		// codigo

		char letra = codigo.charAt(Lobtida);

		return letra;

	}

	/**
	 * Recibe un DNI e comproba si e valido
	 * 
	 * @param numeros
	 * @return
	 */

	public boolean eValido(ArrayList<Integer> numeros) {
		// size comprueba el tamaño de un array list y tengo que sacar
		// un valor boolean(true o false)

		// size di o numero de arrays no arrayslist numeros
		if (numeros.size() == 8) {
			for (int i = 0; i < numeros.size(); i++) {
				int numero = numeros.get(i); // collo as posicions que recorre i
				if (numero >= 0 || numero <= 9) { // valido que os valoress de i
					return true;
				}

			}
			int e;
			e = this.calculaLetra("calcula letra dni");

			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			char letraA;

			int calculaletra = Integer.parseInt(letras);

			letraA = (char) (calculaletra % 23);

			return true;// sale do metodo eValidoreturn true;//

		}

		return false;// non entraria no e xa devolveria false
	}

	/**
	 * Recibe o numero do DNI e calcula a letra
	 * 
	 * @param numero
	 * @return
	 */
	public int calculaLetra(ArrayList<Integer> numero) {
		// comproba que o array non sea distinto a 8
		if (numero.size() != 8)
			return -1;

		// para percorrer o array list e retorna o valor no array
		for (int i = 0; i < numero.size(); i++) {

			int numerodni = numero.get(i); // collo o valor de i no arraylist
			if (numerodni >= 0 && numerodni <= 9) {

			} else {
				return 2;
			}

		}
		int a = 0;
		a = this.calculaLetra("calcula letra dni");// para coller un metodo na
													// misma clase
		// tamen serviria a=nombremetodo(""); con this e mais especifico
		return 1;
	}

}
