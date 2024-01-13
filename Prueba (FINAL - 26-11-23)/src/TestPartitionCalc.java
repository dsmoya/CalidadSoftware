import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestPartitionCalc {
	int ejemplo = 555;
	
	@Before //Reiniciamos el valor
	public void inicializar() {
		ejemplo = 555;
	}
	
	//Comprobamos que el resultado de cada prueba sea el esperado.
	
	@Test //500
	public void test500() {
		assertTrue(Main.check500(ejemplo) == 55);
	}
	
	@Test //200
	public void test200() {
		assertTrue(Main.check200(ejemplo) == 155);
	}
	
	@Test //100
	public void test100() {
		assertTrue(Main.check100(ejemplo) == 55);
	}
	
	@Test //50
	public void test50() {
		assertTrue(Main.check50(ejemplo) == 5);
	}
	
	@Test //20
	public void test20() {
		assertTrue(Main.check20(ejemplo) == 15);
	}
	
	@Test //10
	public void test10() {
		assertTrue(Main.check10(ejemplo) == 5);
	}
	
	@Test //5
	public void test5() {
		assertTrue(Main.check5(ejemplo) == 0);
	}
	
	@Test //2
	public void test2() {
		assertTrue(Main.check2(ejemplo) == 1);
	}
	
	@Test //1
	public void test1() {
		assertTrue(Main.check1(ejemplo) == 555);
	}
}
