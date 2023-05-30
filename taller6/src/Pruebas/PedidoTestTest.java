package Pruebas;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import logica.Ingrediente;
import logica.Pedido;
import logica.Producto;
import logica.ProductoMenu;
import logica.ProductoRepetidoException;
import logica.Restaurante;
import logica.agregarProductoException;

class PedidoTestTest {
	ArrayList<Producto> productos;
	Producto producto ;
	Restaurante restaurante;
	Ingrediente ingrediete;

	@BeforeEach
	public void setUp() {
        // Inicializar el arreglo antes de cada prueba
        productos = new ArrayList<Producto>();
		producto= new ProductoMenu("palomitas", 23000, 56); 
		restaurante= new Restaurante();
		ingrediete = new Ingrediente("tomate", 5220);
		restaurante.addingredientes(ingrediete);
    }
	@Test
	void test() {
		int suma = calculadora.suma(6, 0);
		int esperado = 6;
		assertEquals(suma, esperado);
	}

	@Test
	void agregarProducto(){
		Pedido pedido = new Pedido("juan", "Hacienda Fontanar"); 
		try{
		pedido.agregarProducto(producto);
		}
		catch (agregarProductoException e) {
            // Excepción capturada, puedes realizar las aserciones necesarias
            assertEquals("se paso del limite de valor de los productos", e.getMessage());
        }
		catch(ProductoRepetidoException el){
			assertEquals("esta repetido el producto", el.getMessage());
		}
	}
	@Test
	void precioingredientes(){
	Pedido pedido = new Pedido("juan", "Hacienda Fontanar"); 
	pedido.precioingredientes(); 

	}
	@Test
	void preciomenu(){
	Pedido pedido = new Pedido("juan", "Hacienda Fontanar"); 
	pedido.preciomenu();
}
	@Test
	void caloriasMenu(){
	Pedido pedido = new Pedido("juan", "Hacienda Fontanar"); 
	pedido.caloriasmenu();
}
@Test
	void facturaCrear(){
	Pedido pedido = new Pedido("juan", "Hacienda Fontanar"); 
	pedido.guardarFactura("data\\Factura.txt");
}
}