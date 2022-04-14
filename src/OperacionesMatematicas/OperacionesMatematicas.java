package OperacionesMatematicas;

/**
 * Realiza diferentes operaciones y, si no se pueden realizar, se obtiene -1.
 * @author Paula Fernández Suárez
 * @version 1.2
 * @since 13/04/2022
 */

public class OperacionesMatematicas
{
	int n1, n2;
	
	/**
	 * Constructor con dos parámetros enteros
	 * @param n1
	 * @param n2
	 */
	public OperacionesMatematicas(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * Constructor con un parámetro entero
	 * @param n1
	 */
	public OperacionesMatematicas(int n1)
	{
		this.n1 = n1;
	}
	
	/**
	 * Método que calcula el producto obtenido tras multiplicar dos números enteros.
	 * <br> n1 = multiplicando
	 * <br> n2 = multiplicador
	 * @return producto
	 */
	public int ProductoEntero()
	{
		//	Declaramos las variables que vamos a utilizar
		int producto;
		
		//	Comprobamos que los números sean válidos
		if((n1 < 0) || (n2 < 0))
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
	 * <br> n1 = dividendo
	 * <br> n2 = divisor
	 * @return cociente
	 */
	public int CocienteEntero()
	{
		//	Declaramos las variables que vamos a utilizar
		int cociente;
		
		//	Comprobamos si los valores son válidos
		if((n1 < 0) || (n2 <= 0))
			cociente = -1;
		else
		{
			//	Calculamos el cociente
			cociente = 0;
			while(n1 >= n2)
			{
				cociente++;
				n1 = n1 - n2;
			}
		}
		
		//	Devolvemos el resultado obtenido
		return cociente;
	}
	
	/**
	 * Método que calcula el resto obtenido tras dividir dos números enteros.
	 * @return resto
	 */
	public int RestoEntero()
	{
		//	Declaramos las variables que vamos a utilizar
		int resto;
		
		//	Comprobamos que los valores sean válidos
		if((n1 < 0) || (n2 <= 0))
			resto = -1;
		else
		{
			resto = n1;
			//	Calculamos el resto
			while(resto >= n2)
			{
				resto = resto - n2;
			}
		}
		
		//	Devolvemos el resultado obtenido.
		return resto;
	}
	
	/**
	 * Método que calcula la potencia de dos números enteros.
	 * <br> n1 = base
	 * <br> n2 = exponente
	 * @return potencia
	 */
	public int PotenciaEntera()
	{
		//	Declaramos las variables que vamos a utilizar
		int potencia;
		
		//	Comprobamos si los valores son válidos
		if((n1 < 0) || (n2 < 0))
			potencia = -1;
		else
		{
			//	Calculamos la potencia
			potencia = 1;
			while(n2 > 0)
			{
				potencia = potencia * n1;
				n2 = n2 -1;
			}
		}
		
		//	Devolvemos el resultado obtenido
		return potencia;
	}
	
	/**
	 * Método que calcula el factorial de un número.
	 * <br> n1 = numero
	 * @return factorial
	 */
	public int Factorial()
	{
		//	Declaramos las variables que vamos a utilizar
		int factorial;
		
		//	Comprobamos si los valores son válidos
		if(n1 < 0)
			factorial = -1;
		else
		{
			//	Calculamos el factorial
			factorial = 1;
			while(n1 > 1)
			{
				factorial = factorial * n1;
				n1--;
			}
		}
		
		//	Devolvemos el resultado obtenido
		return factorial;
	}
	
	/**
	 * Método que calcula el producto obtenido tras multiplicar dos números enteros utilizando el método ruso.
	 * <br> n1 = multiplicando
	 * <br> n2 = multiplicador
	 * @return solucion
	 */
	public int ProductoRuso()
	{
		//	Declaramos las variables que vamos a utilizar
		int solucion;
		
		//	Comprobamos si los valores son válidos
		if((n1 < 0) || (n2 < 2))
			solucion = -1;
		else
		{
			//	Calculamos el producto ruso
			solucion = 0;
			if(n1 > 0)
			{
				while(n2 > 0)
				{
					if(n2 % 2 != 0)
						solucion = solucion + n1;
					n1 = n1 * 2;
					n2 = n2 / 2;
				}
			}
		}
		
		//	Devolvemos el resultado obtenido
		return solucion;
	}
}
