package OperacionesMatematicas;


import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Clase que comprueba si el método Factorial funciona correctamente
 * @author Paula
 * @since 16/04/2022
 */
@RunWith (value = Parameterized.class)
public class OperacionesMatematicasTestFactorial
{
	private int n1;
	private int resultado;
	
	public OperacionesMatematicasTestFactorial(int n1, int resultado)
	{
		this.n1 = n1;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Iterable<Object[]> numeros()
	{
		return Arrays.asList(new Object[][] {{-1, -1}, {1, 1}, {5, 120}, {"Hola", 0}});
	}
	
	@Test
	public void testFactorial() 
	{
		OperacionesMatematicas operacion = new OperacionesMatematicas (n1);
		int resultado = operacion.Factorial();
		assertEquals(resultado, this.resultado);
	}

}