package OperacionesMatematicas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OperacionesMatematicasTestCociente.class, OperacionesMatematicasTestFactorial.class,
		OperacionesMatematicasTestPotencia.class, OperacionesMatematicasTestProducto.class,
		OperacionesMatematicasTestProductoRuso.class, OperacionesMatematicasTestResto.class })
public class AllTests {

}
