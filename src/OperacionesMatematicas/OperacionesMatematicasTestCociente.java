package OperacionesMatematicas;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Clase que comprueba si el m�todo CocienteEntero funciona correctamente
 * @author Paula
 * @since 14/04/2022
 */
@RunWith (value = Parameterized.class)
public class OperacionesMatematicasTestCociente
{
	private int n1;
	private int n2;
	private int resultado;
	
	public OperacionesMatematicasTestCociente(int n1, int n2, int resultado)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Iterable<Object[]> numeros()
	{
		return Arrays.asList(new Object[][] {{-1, 8, -1}, {3, -1, -1}, {0, 3, 0},
			{9, 3, 3}, {-3, -4, -1}, {"Hola", 3, 0}, {3, "Hola", 0}});
	}
	
	@Test
	public void testCocienteEntero() 
	{
		OperacionesMatematicas operacion = new OperacionesMatematicas (n1, n2);
		int resultado = operacion.CocienteEntero();
		assertEquals(resultado, this.resultado);
	}

}
