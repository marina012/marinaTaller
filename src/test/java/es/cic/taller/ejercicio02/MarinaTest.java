package es.cic.taller.ejercicio02;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarinaTest {

	@Test
	public void testNombre() {
		Marina sut =new Marina();
		assertEquals("Marina", sut.nombre());
	}

}
