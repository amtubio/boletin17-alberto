
package boletin17;

import org.junit.Test;

import boletin17.DNI; // para importar clases necesitamos definir os paquetes con un nombre

import boletin17.DNI;

public class DNITest {

	DNI dni = new DNI();

	@Test // si no pongo test aqui el junit no me comprueba si hay errores
			
	public void testevalido() {
		equals(dni.eValido("00000001")); // entre comillas por que es un string
		equals(dni.eValido("000a0000"));
		equals(dni.eValido("123123123123"));
		equals(dni.eValido("53795281Y"));// comprobar minusculas
		equals(dni.eValido("a379851Y"));
	}

	@Test
	public void testcalculaletra() {
      equals(dni.calculaLetra("12356678"));
      equals(dni.calculaLetra("123456789"));
      equals(dni.calculaLetra("1231313892"));
      equals(dni.calculaLetra("00000000"));
      equals(dni.calculaLetra("12345677"));//coller a posicion da letra respecto o resultado do modulo23%
      equals(dni.calculaLetra("00000001"));//si e 0 non e ningunha letra
      
	}

	@Test
	public void testvalidoArraylist() {
		equals(dni.calculaLetra("00000000"));
	}
	@Test
	public void testcalculaleraArraylist() {
		equals(dni.eValido("00000000"));
	}
}
