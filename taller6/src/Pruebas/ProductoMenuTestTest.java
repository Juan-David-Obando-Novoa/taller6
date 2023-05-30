package Pruebas;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import logica.ProductoMenu;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoMenuTestTest {
	ProductoMenu productoM;
	@BeforeEach
	public void setUp() {
        // Inicializar el arreglo antes de cada prueba
    productoM = new ProductoMenu("Hamburguesa", 5500, 2563);
    }

	@Test
	void getname() {
		String nombre = productoM.getNombre();
		String esperado = "Hamburguesa";
		assertEquals(nombre,esperado);
	}

}
