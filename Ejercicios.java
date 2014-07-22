public class Ejercicios
{
	//devuelve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		if (numero%2==0)
			return true;
		else
			return false;
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	static String churches(int lempiras)
	{
		if (lempiras<50)
			return "paquetillo";
		if (lempiras<100)
			return "paquetin";
		if (lempiras<200)
			return "paquetote";
	 else 
		return "paqueton";
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		if(num == 0) 
			return 1; 
			else 
			return num * factorial(num-1); 
		}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		
		return arr[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		 if(num==1)
	            return 1;
		 else if (num==0)
			 return 0;
	         else
	            return fibonacci(num-1) + fibonacci(num-2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0)
			return 0;
		if(num==1)
			return 2;
		else
	return funcionRecursiva(num-1)*2+1;
	}
	
	public static void main(String[] args)
	{

	}

}
