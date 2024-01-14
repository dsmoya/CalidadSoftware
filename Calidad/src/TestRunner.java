import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		int i = 0;
		Result resultado = JUnitCore.runClasses(TestJUnit.class);
		System.out.println("Se han producido "+resultado.getFailureCount()+" fallos en la ejecución de las pruebas:");
		for (Failure fallo : resultado.getFailures()) {
			System.out.println("FALLO "+i+": "+fallo.toString());
			i++;
		}
	}
}
