package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import logica.Combo;
import junit.textui.TestRunner;


class ComboTestTest {
	

	
	@Test
	void test () {
		Combo combo  = new Combo("combo corral", 5); 
		int precio= combo.getPrecio();
		int esperado = 22050;
		assertEquals(precio,esperado);
	}

	@Test 
	void printcombos(){
		Combo combo  = new Combo("combo corral", 5); 

		combo.printcombos();

	}
	


}
