import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class TestAnnotations {
	int ejemplo;
	int[] arrayEsperado1 = {99,9,999};
	int[] arrayEsperado2 = {3,3,1};
	int[] arrayObtenido = {0,0,0};
	
	@BeforeClass //simular conexión a BD
	public static void conectarBase() { 
		System.out.println("Conectando a la base de datos...");
	}
	
	@Before //introducir una cifra distinta
	public void iniciarPrueba() {
		System.out.println("-----------------------");
		System.out.println("Iniciando prueba");
		System.out.println("-----------------------");
		ejemplo = Main.pedirCifra();
	}
	
	@Test //realizar una prueba (999)
	public void arrayTest() {
		arrayObtenido[0] = Main.check100(ejemplo);
		arrayObtenido[1] = Main.check10(ejemplo);
		arrayObtenido[2] = Main.check1(ejemplo);
		assertArrayEquals(arrayObtenido, arrayEsperado1);
	}
	
	@Test //realizar una prueba (1803)
	public void arrayTest2() {
		arrayObtenido[0] = Main.check200(ejemplo);
		arrayObtenido[1] = Main.check20(ejemplo);
		arrayObtenido[2] = Main.check2(ejemplo);
		assertArrayEquals(arrayObtenido, arrayEsperado2);
	}
	
	@Ignore
	@Test //ignoramos una prueba que está sin terminar
	public void arrayTest3() {
		assertArrayEquals(arrayObtenido, arrayEsperado1);
	}
	
	@After
	public void reiniciarEjemplo() {
		ejemplo = 0;
		System.out.println("-----------------------");
		System.out.println("Prueba finalizada");
		System.out.println("-----------------------");
	}
	
	@AfterClass //simular cortar la conexión con la DB
	public static void desconectarBase() {
		System.out.println("Cerrando conexión...");
	}
	
}
