import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestPartitionInit {
	int ejemplo;
	
	@Before //Escogemos un valor para  las pruebas
	public void inicializar() {
		ejemplo = Main.pedirCifra();
	}
	
	@Test //Nos aseguramos de que no sea nulo
	public void testPedirCifra1() {
		assertNotNull(ejemplo);
	}
	
	@Test //Comprobamos que no sea negativo
	public void testPedirCifra2() {
		assertFalse(ejemplo < 0);
	}
	
	@Test //Comprobamos que el valor se haya transmitido correctamente
	public void testPedirCifra3() {
		assertSame(ejemplo, 500); //el valor esperado es 500
	}
	
	@After //reiniciar el ejemplo
	public void reiniciar() {
		ejemplo = 0;
	}
}
