import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnit {
	int ejemplo = 333;
	int[] arrayEsperado = {6,2,2};
	int[] arrayObtenido = {Main.check5(18),Main.check2(3), Main.check1(0)};
	
	@Test //assertNotNull - la cifra pedida no puede ser nula
	public void testPedirCifra1() {
		System.out.println("---IGNORAR PRINTS---");
		assertNotNull(Main.pedirCifra());
	}
	
	@Test //assertEquals - la cifra pedida (333) se transmite correctamente
	public void testPedirCifra2() {
		assertEquals(Main.pedirCifra(), ejemplo);
	}
	
	@Test //assertTrue - el resultado de un check es el esperado
	public void test500() {
		assertTrue(Main.check500(501) == 1);
	}
	
	@Test //assertFalse - no puede sobrar más de lo que entra
	public void test200() {
		assertFalse(Main.check200(ejemplo) < ejemplo);
	}
	
	@Test //assertNull - el resultado de un check no puede ser nulo (este test fallará)
	public void test100() {
		assertNull(Main.check200(0));
	}
	
	@Test //assertSame - dos checks darán 0 billetes con una misma cifra menor que ambos
	public void test50() {
		assertSame(Main.check50(19),Main.check20(19));
	}
	
	@Test //assertNotSame - dos checks no pueden dar el mismo resultado sobre la misma cifra
	public void test20() {
		assertNotSame(Main.check20(ejemplo),Main.check10(Main.check10(ejemplo)));
	}
	
	@Test //asertArrayEquals - checks sucesivos devuelven los resultados esperados
	public void testResto() {
		assertArrayEquals(arrayEsperado, arrayObtenido);
	}
}
