package OperacionesMatematicas;

/**
 * Realiza diferentes operaciones y, si no se pueden realizar, se obtiene -1.
 * @author Paula Fernández Suárez
 * @version 1.2
 * @since 13/04/2022
 */

public class OperacionesMatematicas
{
	/**
	 * Método que calcula el producto obtenido tras multiplicar dos números enteros.
	 * @param n1
	 * @param n2
	 * @return producto
	 */
	public int ProductoEntero(int n1, int n2)
	{//	Declaramos las variables que vamos a utilizar
		int producto;
		
		//	Comprobamos que los números sean válidos
		if((n1 < 0) || (n2 <= 0))
			producto = -1;
		else
		{

			//	Calculamos el producto
			producto = 0;
			if(n2 > 0)
			{
				while(n1 > 0)
				{
					producto = producto + n2;
					n1--;
				}
			}
		}
		
		// Devolvemos el resultado obtenido
		return producto;
	}
	
	/**
	 * Método que calcula el cociente obtenido tras dividir dos números enteros.
	 * @param dividendo
	 * @param divisor
	 * @return cociente
	 */
	public int CocienteEntero(int dividendo, int divisor)
	{
		//	Declaramos la variables que vams a utilizar
		int cociente;
		
		//	Comprobamos si los valores son válidos
		if((dividendo < 0) || (divisor <= 0))
			cociente = -1;
		else
		{
			//	Calculamos el cociente
			cociente = 0;
			while(dividendo >= divisor)
			{
				cociente++;
				dividendo = dividendo - divisor;
			}
		}
		
		//	Devolvemos el resulatdo obtenido
		return cociente;
	}
	
	/**
	 * Método que calcula el resto obtenido tras dividir dos números enteros.
	 * @param dividendo
	 * @param divisor
	 * @return dividendo
	 */
	public int RestoEntero(int dividendo, int divisor)
	{
		//	Comprobamos que los valores sean válidos
		if((dividendo < 0) || (divisor <= 0))
			dividendo = -1;
		else
		{
			//	Calculaos el resto
			while(dividendo >= divisor)
			{
				dividendo = dividendo - divisor;
			}
		}
		
		//	Devolvemos el resultado obtenido.
		return dividendo;
	}
	
	/**
	 * Método que calcula la potencia de dos números enteros.
	 * @param base
	 * @param exponente
	 * @return potencia
	 */
	public int PotenciaEntera(int base, int exponente)
	{
		//	Declaramos las variables que vamos a utilizar
		int potencia;
		
		//	Comprobamos si los valores son válidos
		if((base < 0) || (exponente < 0))
			potencia = -1;
		else
		{
			//	Calculamos la potencia
			potencia = 1;
			while(exponente > 0)
			{
				potencia = potencia * base;
				exponente = exponente -1;
			}
		}
		
		//	Devolvemos el resultado obtenido
		return potencia;
	}
	
	/**
	 * Método que calcula el factorial de un número.
	 * @param numero
	 * @return factorial
	 */
	public int Factorial(int numero)
	{
		//	Declaramos las variables que vamos a utlizar
		int factorial;
		
		//	Comprobamos si los valores son válidos
		if(numero < 0)
			factorial = -1;
		else
		{
			//	Calculamos el factorial
			factorial = 1;
			while(numero > 1)
			{
				factorial = factorial * numero;
				numero--;
			}
		}
		
		//	Devolvemos el resultado obtenido
		return factorial;
	}
	
	/**
	 * Método que calcula el producto obtenido tras multiplicar dos números enteros utilizando el método ruso.
	 * @param factor1
	 * @param factor2
	 * @return solucion
	 */
	public int ProductoRuso(int factor1, int factor2)
	{
		//	Declaramos las variables que vamos a utilizar
		int solucion;
		
		//	Comprobamos si los valores son válidos
		if((factor1 < 0) || (factor2 < 2))
			solucion = -1;
		else
		{
			//	Calculamos el producto ruso
			solucion = 0;
			if(factor1 > 0)
			{
				while(factor2 > 0)
				{
					if(factor2 % 2 != 0)
						solucion = solucion + factor1;
					factor1 = factor1 * 2;
					factor2 = factor2 / 2;
				}
			}
		}
		
		//	Devolvemos el resultado obtenido
		return solucion;
	}
}
