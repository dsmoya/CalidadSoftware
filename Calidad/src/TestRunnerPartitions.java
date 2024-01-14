import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerPartitions {
	public static void main(String[] args) {
		int i = 0;
		Result resultadoInit = JUnitCore.runClasses(TestPartitionInit.class);
		Result resultadoCalc = JUnitCore.runClasses(TestPartitionCalc.class);
		
		System.out.println("Se ha(n) producido "+resultadoInit.getFailureCount()+" fallo(s) en los métodos de tipo INICIALIZACIÓN:");
		for (Failure fallo : resultadoInit.getFailures()) {
			System.out.println("FALLO "+i+": "+fallo.toString());
			i++;
		}
		i = 0;
		System.out.println("");
		System.out.println("Se ha(n) producido "+resultadoCalc.getFailureCount()+" fallo(s) en los métodos de tipo CÁLCULO:");
		for (Failure fallo : resultadoCalc.getFailures()) {
			System.out.println("FALLO "+i+": "+fallo.toString());
			i++;
		}
	}
}
