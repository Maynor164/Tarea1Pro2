public class Ejercicios
{
	//TRABAJO EN GRUPO CON KEVIN LANZA
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
	// utilizamos el if para hacer comparaciones y comparamos los valores propuestos
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
	// Primero evaluamos el numero si es igual a cero sera igual a 1 luego si no lo es aplicamos la formula
	//para obtener el valor de real de la operacion ya multiplicado por el factorial
	static int factorial(int num)
	{
		if(num == 0) 
			return 1; 
			else 
			return num * factorial(num-1); 
		}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	//solo tenemos que definirle al arreglo la variable posicion para poder ubicarla a nuestro gusto o del usuario
	static int getElemento(int arr[],int pos)
	{
		
		return arr[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	//a nuestro arreglo le colocamos posiciones que serian las variables fila y columna
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	//solo tenemos que llamar el valor x de el otro programa a este programa
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	//Llamamos la funcion que realizamos en el programa MI CLASE y la mostramos
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	//De igual manera llamamos la funcion de nuestro programa mi clase y le asignamos el valor "y"
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	// Evaluamos primero la variable num si el numero es igual a 1 muestra el valor 1, de igual manera si el
	//numero es igual a 0 regresamos 0, en caso contrario regresa la formula fibonacci que el num-1 se le
	//suma el num -2
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
	//Evaluamos que si el num es igual a 0, regresa el valor 0; si el num es igual a 1 regresa 2
	//si no se cumple esto entra a la formula que el num-1 lo multiplica por 2+1 
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
