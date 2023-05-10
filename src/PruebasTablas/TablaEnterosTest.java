package PruebasTablas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	
	Integer [] arrayNumeros = new Integer[5];
	TablaEnteros TablaEnteros;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		arrayNumeros[0] = 10;
		arrayNumeros[1] = 20;
		arrayNumeros[2] = 30;
		arrayNumeros[3] = 40;
		arrayNumeros[4] = 50;
		TablaEnteros = new TablaEnteros(arrayNumeros);
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTablaEnterosNull() {
		Integer []arrayNull = new Integer [0];
		assertThrows(IllegalArgumentException.class,() ->new TablaEnteros(arrayNull));
	}
	@Test
	void testTablaEnteros() {
		assertEquals(arrayNumeros, new TablaEnteros(arrayNumeros));
	}
	
	@Test
	void testSumaTabla() {
		int suma = 150;
		assertEquals(suma, TablaEnteros.sumaTabla());
	}
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
