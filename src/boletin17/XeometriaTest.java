package boletin17;
import static org.junit.Assert.*;

import org.junit.Test;


import boletin17.Xeometria;
//C:\Program Files\Java\jdk1.8.0_45\bin\javadoc.exe onde esta para crear o javadoc- project genetrate javadoc e buscamos en java
public class XeometriaTest {
	Xeometria comprobar=new Xeometria(); // creamos un obxecto da clase xeometria  para invocar os seus metodos
	@Test
	public void testperimetrocuadrado() {
	// Equals indica si el objeto que  comprueba(lado) es igual a este.
		equals(comprobar.perimetroCadrado(-6));
		equals(comprobar.perimetroCadrado(5) );
		equals(comprobar.perimetroCadrado(11));
		equals(comprobar.perimetroCadrado(40));
		equals(comprobar.perimetroCadrado(0));
		equals(comprobar.perimetroCadrado(-1));
		equals(comprobar.perimetroCadrado(20));
		equals(comprobar.perimetroCadrado(-3));
		
	}
	@Test // si no pongo test aqui el junit no me comprueba si hay errores.
	public void testarecuadrado(){
		equals(comprobar.areaCadrado(-6));
		equals(comprobar.areaCadrado(5));
		equals(comprobar.areaCadrado(40));
		equals(comprobar.areaCadrado(11));
		equals(comprobar.areaCadrado(0));
		equals(comprobar.areaCadrado(-1));
	
	}
	@Test
    public void teoremaPitagoras() {
    	equals(comprobar.teoremaPitagoras(1, 5));
    	equals(comprobar.teoremaPitagoras(5, 1));
    	equals(comprobar.teoremaPitagoras(-5, 1));
    	equals(comprobar.teoremaPitagoras(5, -1));
    	equals(comprobar.teoremaPitagoras(5, 0));
    	equals(comprobar.teoremaPitagoras(0, 1));
    	equals(comprobar.teoremaPitagoras(0, 0));
    	equals(comprobar.teoremaPitagoras(8, 8));
    	equals(comprobar.teoremaPitagoras(-5, -5));
    	
    }
    @Test
    public void teoremaPitagorasCateto(){
    	equals(comprobar.teoremaPitagoras1(1,5 ));
    	equals(comprobar.teoremaPitagoras1(5,1 ));
    	equals(comprobar.teoremaPitagoras1(-1,5 ));
    	equals(comprobar.teoremaPitagoras1(1,-5 ));
    	equals(comprobar.teoremaPitagoras1(0,5 ));
    	equals(comprobar.teoremaPitagoras1(5,0 ));
    	equals(comprobar.teoremaPitagoras1(5,5 ));
    	equals(comprobar.teoremaPitagoras1(0, 0));
    	equals(comprobar.teoremaPitagoras1(-5, -5));
    	
    }
	}
