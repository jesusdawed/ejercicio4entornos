package ejercicio4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	Libro l;
	@Before
	public void setUp() throws Exception {
		l=new Libro("Peter Pan",22,"Infantil",5.99,false);
	}

	@Test
	public void testLibro() {
		Libro l2=new Libro();
		assertNull(l2.getTitulo());
		assertNull(l2.getGenero());
		assertEquals(0,l2.getNumPaginas());
		assertEquals(0,l2.getPrecio(),0.01);
		assertEquals(false,l2.getPrestamo());
	}

	@Test
	public void testLibroStringIntStringDoubleBoolean() {
		Libro l3=new Libro("Pinocho",32,"Infantil",3.99,true);
		assertEquals("Pinocho",l3.getTitulo());
		assertEquals(32,l3.getNumPaginas());
		assertEquals("Infantil",l3.getGenero());
		assertEquals(3.99,l3.getPrecio(),0.01);
		assertEquals(true,l3.getPrestamo());
	}

	@Test
	public void testGetTitulo() {
		assertEquals("Peter Pan",l.getTitulo());
	}

	@Test
	public void testSetTitulo() {
		l.setTitulo("Spiderman");
		assertEquals("Spiderman",l.getTitulo());
	}

	@Test
	public void testGetNumPaginas() {
		assertEquals(22,l.getNumPaginas());
	}

	@Test
	public void testSetNumPaginas() {
		l.setNumPaginas(40);
		assertEquals(40,l.getNumPaginas());
	}

	@Test
	public void testGetGenero() {
		assertEquals("Infantil",l.getGenero());
	}

	@Test
	public void testSetGenero() {
		l.setGenero("Acción");
		assertEquals("Acción",l.getGenero());
	}

	@Test
	public void testGetPrecio() {
		assertEquals(5.99,l.getPrecio(),0.01);
	}

	@Test
	public void testSetPrecio() {
		l.setPrecio(7.99);
		assertEquals(7.99,l.getPrecio(),0.01);
	}

	@Test
	public void testGetPrestamo() {
		assertEquals(false,l.getPrestamo());
	}

	@Test
	public void testSetPrestamo() {
		l.setPrestamo(true);
		assertEquals(true,l.getPrestamo());
	}

	@Test
	public void testToString() {
		assertEquals("Libro [titulo=Peter Pan, numPaginas=22, genero=Infantil, precio=5.99, prestamo=false]","Libro [titulo=" + l.getTitulo() + ", numPaginas=" + l.getNumPaginas() + ", genero=" + l.getGenero() + ", precio=" + l.getPrecio()
				+ ", prestamo=" + l.getPrestamo() + "]");
	}

	@Test
	public void testPrestamo() {
		l.prestamo();
		assertEquals(true,l.getPrestamo());
	}

	@Test
	public void testDevolucion() {
		l.devolucion();
		assertEquals(false,l.getPrestamo());
	}

}
