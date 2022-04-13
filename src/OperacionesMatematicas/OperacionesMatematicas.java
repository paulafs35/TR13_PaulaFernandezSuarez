package OperacionesMatematicas;

public class OperacionesMatematicas
{
	public int ProductoEntero(int n1, int n2)
	{
		int producto;
		if((n1 < 0) || (n2 <= 0))
			producto = -1;
		else
		{
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
		return producto;
	}
	
	public int CocienteEntero(int dividendo, int divisor)
	{
		int cociente;
		if((dividendo < 0) || (divisor <= 0))
			cociente = -1;
		else
		{
			cociente = 0;
			while(dividendo >= divisor)
			{
				cociente++;
				dividendo = dividendo - divisor;
			}
		}
		return cociente;
	}
	
	public int RestoEntero(int dividendo, int divisor)
	{
		if((dividendo < 0) || (divisor <= 0))
			dividendo = -1;
		else
		{
			while(dividendo >= divisor)
			{
				dividendo = dividendo - divisor;
			}
		}
		return dividendo;
	}
	
	public int PotenciaEntera(int base, int exponente)
	{
		int potencia;
		if((base < 0) || (exponente < 0))
			potencia = -1;
		else
		{
			potencia = 1;
			while(exponente > 0)
			{
				potencia = potencia * base;
				exponente = exponente -1;
			}
		}
		return potencia;
	}
	
	public int Factorial(int numero)
	{
		int factorial;
		if(numero < 0)
			factorial = -1;
		else
		{
			factorial = 1;
			while(numero > 1)
			{
				factorial = factorial * numero;
				numero--;
			}
		}
		return factorial;
	}
	
	public int ProductoRuso(int factor1, int factor2)
	{
		int solucion;
		if((factor1 < 0) || (factor2 < 2))
			solucion = -1;
		else
		{
			productoRuso = 0;
			if(factor1 > 0)
			{
				while(factor2 > 0)
				{
					if(factor2 % 2 =! 0)
						solucion = solucion + factor1;
					factor1 = factor1 * 2;
					factor2 = factor2 / 2;
				}
			}
		}
		return solucion;
	}
}
