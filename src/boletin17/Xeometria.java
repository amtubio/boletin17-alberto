package boletin17;

public class Xeometria {
/**
 * Recibe el lado de un cuadrado y calcula el perimetro
 * @param lado 
 * @return perimetro 
 */
 public	int perimetroCadrado(int lado) {
		int perimetro = 0;

		// si el lado es menor que 0 retorna -1
		if (lado < 0) {
			return -1;
		}
		// si el lado es igual a 0 retorna 0
		if (lado == 0) {
			return 0;
		}

		perimetro = (lado * 4);
		return perimetro;
	}
	/**
	 * RECIBE EL lado de un cuadrado y  calcula el area
	 * @param lado
	 * @return
	 */
public	int areaCadrado(int lado) {
		if (lado < 0) {
			return -1;
		}
		if (lado == 0) {
			return 0;
		}
		int area = 0;

		area = (lado * lado);

		return area;
	}
	/**
	 * Recibe los 2 catetos y calcula la hipotenusa 
	 * @param catetoA
	 * @param catetoB
	 * @return
	 */

public	double teoremaPitagoras(int catetoA, int catetoB) {
		// Comprobo que si os catetos son 0 si uno es 0 retorna 0
		if (catetoA ==0 || catetoB == 0) {
			return 0;
		}
		// comprobo que os catetos son menores que 0 
		if (catetoB<0 || catetoA < 0) {
			return -1;
		}
		
		double hipotenusa;

		hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

		return hipotenusa;
	}
/**
 * recibe un cateto y la hipotenusa y calcula el otro cateto
 * @param catetoA
 * @param hipotenusa
 * @return
 */
public	double teoremaPitagoras1(int cateto, int hipotenusa) {
		if (hipotenusa<0){
			return -4;
			}
		
		if (cateto<0) {
			return -1;
		}
		
		if (cateto>hipotenusa) {
			return -3;
		}
		if (cateto ==0 || hipotenusa ==0) {
			return 0;

		}
		if (cateto ==0 || hipotenusa ==0) {
			return 0;
		}
		if(hipotenusa==cateto){
			return -4;
		}
		double catetoB;

		// clase math y sqrt es raiz cuadrada
		catetoB = Math.sqrt((hipotenusa * hipotenusa) - (cateto * cateto));

		return catetoB;
		
	}
}
	

	