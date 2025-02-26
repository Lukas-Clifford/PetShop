package utils;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Utils {
		/**
		 * Devuelve un numero (int) aleatorio dentro de un rango.
		 * @param min (int)	Mínimo del rango.
		 * @param max (int)	Máximo del rango.
		 * @return numeroAleatorio (int) Numero aleatorio.
		 */
		public static int pedirNumeroAleatorio(int min, int max) {
			int numeroAleatorio = (int) (Math.random()*(max-min+1))+min;
			return numeroAleatorio;
		}
		
		/**
		 * Devuelve un numero (int) entero introducido por el usuario.
		 * Gestiona si la entrada es un entero, en caso contrario sigue pidiendo que se introduzca un numero.
		 * @param msg (String) Mensaje opcional para la pedida del número.
		 * Si la cadena está vacia imprime "Introduce un numero: ".
		 * @return numero (int) Número introducido.
		 */
		public static int pedirNumeroEntero(String msg) {
			Scanner sc = new Scanner(System.in);
			int numero = 0;
			boolean numeroEsEntero = false;
			while(!numeroEsEntero){
				try {
					if (msg == "") {
						System.out.print("Introduce un numero: ");
					}else {
						System.out.print(msg);
					}
					numero = Integer.parseInt(sc.next());
					numeroEsEntero = true;
					
				}catch(Exception e){
					System.out.println("No es un numero entero, pruebe otra vez");
				}
			}
			return numero;
		}
		
		/**
		 * Devuelve un numero (float) flotante introducido por el usuario.
		 * Gestiona si la entrada es un entero, en caso contrario sigue pidiendo que se introduzca un numero.
		 * @param msg (String) Mensaje opcional para la pedida del número.
		 * Si la cadena está vacia imprime "Introduce un numero: ".
		 * @return numero (float) Número introducido convertido a flotante.
		 */
		public static float pedirNumeroFlotante(String msg) {
			Scanner sc = new Scanner(System.in);
			int numero = 0;
			boolean numeroEsEntero = false;
			while(!numeroEsEntero){
				try {
					if (msg == "") {
						System.out.print("Introduce un numero: ");
					}else {
						System.out.print(msg);
					}
					numero = Integer.parseInt(sc.next());
					numeroEsEntero = true;
					
				}catch(Exception e){
					System.out.println("No es un numero, pruebe otra vez");
				}
			}
			return (float) numero;
		}
		
		/**
		 * Devuelve una cadena (String) introducida por el usuario.
		 * @param msg (String) Mensaje opcional para la pedida de la cadena de texto.
		 * Si la cadena está vacia, imprime :"Introduce una cadena de texto: ".
		 * @return cadena (String) Cadena introducida.
		 */
		public static String pedirCadena(String msg) {
			Scanner sc = new Scanner(System.in);
			if (msg == "") {
				System.out.print("Introduce una caneda de texto: ");
			}else {
				System.out.print(msg);
			}
			String cadena = sc.next();
			return cadena.strip();
		}
		
		/**
		 * Devuelve la multiplicación (double[][]) de dos matrices de cualquier orden.
		 * @param a (double[][]) Matriz factor uno.
		 * @param b (double[][]) Matriz factor dos.
		 * @return c (double[][]) Devuelve el producto.
		 */
		public static double[][] multMatriz(double[][] a, double[][] b){
			double[][] c = new double[a.length][b[0].length];
			double acc = 0;
			
			for(int row = 0;row<c.length;row++) {
				for(int col = 0; col<c[0].length;col++) {
					acc = 0;
					for(int i = 0; i < a[0].length;i++) {
						acc += a[row][i]*b[i][col];
					}
					c[row][col] = acc;
				}
			}
			return c;
		}
		
		/**
		 * Imprime una matriz (double).
		 * @param matriz (double) Matriz para imprimir.
		 */
		public static void imprimirMatrizDoble(double[][] matriz) {
			for(int i = 0;i < matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		/**
		 * Imprime una matriz (int).
		 * @param matriz (int) Matriz para imprimir.
		 */
		public static void imprimirMatrizEntero(int[][] matriz) {
			for(int i = 0;i < matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		/**
		 * Imprime un array (int).
		 * @param array (int) Array a imprimir.
		 */
		public static void imprimirArrayNumeros(int array[]) {
			for(int numero: array) {
				System.out.print(numero+" ");
			}
		}
		
		/**
		 * Devuelve un array (int[]) invertida.
		 * @param arrayNormal (int[]) Array a invertir.
		 * @return arrayInvertida (int[]) Array invertida.
		 */
		public static int[] invertirArrayEnteros(int[] arrayNormal) {
			int[] arrayInvertida = new int[arrayNormal.length];
			for(int i = 0; i < arrayNormal.length; i++) {
				arrayInvertida[i] = arrayNormal[arrayNormal.length-1-i];
			}
			return arrayInvertida;
		}
		
		/**
		 * Devuelve un array (int[]) con los digitos de un numero.
		 * @param numero (int) Numero para dividir.
		 * @return digitos (int[])Array con los dígitos. 
		 */
		public static int[] pedirArrayDigitos(int numero) {
			int contadorDigitos = 0;
			
			if (numero < 0) numero *= -1;
			for(int i = numero; i>0;i/=10) {
				contadorDigitos++;
			}
			
			int[] digitos = new int[contadorDigitos];
			
			for(int i = 0; i < digitos.length; i++) {
				digitos[i] = numero%10;
				numero /= 10;
			}
			return invertirArrayEnteros(digitos);
		}
		
		/**
		 * Devuelve verdadero (boolean) si el número es capicua.
		 * @param numero (int) Numero a comprobar.
		 * @return esCapicua (boolean) Verdadero en caso de capicua.
		 */
		public static boolean comprobarCapicua(int numero) {
			boolean esCapicua = true;
			int[] numeroArray = pedirArrayDigitos(numero);
			int[] numeroInvertidoArray = invertirArrayEnteros(numeroArray);
			for(int i = 0;i<numeroArray.length;i++) {
				if(numeroArray[i] != numeroInvertidoArray[i]) esCapicua = false;
			}
			return esCapicua;
		}
		
		/**
		 * Devuelve verdadero (boolean) si el numero es primo.
		 * @param numero (int) Numero a comprobar.
		 * @return esPrimo (boolean) Verdadero si es primo.
		 */
		public static boolean comprobarPrimo(int numero) {
			boolean esPrimo = true;
			if(numero <= 1) {
				esPrimo = false;
			}else {
				for (int i = numero-1;i>1;i--) {
					if(numero%i==0) esPrimo = false;
				}
			}
			return esPrimo;
		}
		
		/**
		 * Devuelve el numero de dígitos (int) de un numero.
		 * @param numero (int) Numero del que se cuentan los digitos.
		 * @return numeroDigitos (int) Numero de digitos del numero introducido.
		 */
		public static int contarDigitos(int numero) {
			int numeroDigitos = pedirArrayDigitos(numero).length;
			return numeroDigitos;
		}
		
		/**
		 * Devuelve el numero (int) introducido en string convertido en entero.
		 * @param cadena (String) Cadena con un numero para convertir en entero.
		 * @return numero (int) Numero en formato entero.
		 */
		public static int transformarCadenaANumero(String cadena) {
			int numero = 0;
			try {
				numero = Integer.parseInt(cadena);
			}catch(Exception e){
				System.out.println("No se pudo convertir el numero.");
			}
			return numero;
		}
		
		/**
		 * Devuelve el número invertido (int).
		 * @param numero (int) Número a invertir.
		 * @return numeroInvertido (int) Número invertido.
		 */
		public static int invertirNumero(int numero) {
			int numeroInvertido = 0;
			int[] numeroInvertidoArray = invertirArrayEnteros(pedirArrayDigitos(numero));
			
			for(int i = 0;i<numeroInvertidoArray.length;i++) {
				numeroInvertido += numeroInvertidoArray[i];
				numeroInvertido*=10; 
			}
			
			return numeroInvertido/10;
		}
		
		
		/** 
		 * Devuelve el digito (int) del número indicado por el índice.
		 * @param numero (int) Número del que se obtiene el digito.
		 * @param indice (int) Indice de la posición a obtener.
		 * @return digito (int) Digito del numero en posicion del indice.
		 */
		public static int pedirDigitoPorIndice(int numero,int indice) {
			int digito = pedirArrayDigitos(numero)[indice];
			return digito;
		}
		
		
		/**
		 * Devuelve el índice (int) del digito buscado en el número.
		 * @param numero (int) Numero en el que se busca el digito.
		 * @param digito (int) Digito a buscar.
		 * @return indice (int) Primera posicion encontrada del digito.
		 */
		public static int pedirIndiceDelDigito(int numero,int digito) {
			int indice = 0;
			int[] digitos = pedirArrayDigitos(numero);
			boolean encontrado = false;
			for(int i = 0;i<digitos.length;i++) {
				if(digito == digitos[i]) {
					indice = i;
					encontrado = true;
					break;
				}
			}
			if (!encontrado) indice=-1;
			
			return indice;
		}
		
		/**
		 * Devuelve el numero recortado (int) por detras la cantidad indicada.
		 * @param numero (int) Número a recortar.
		 * @param cantidad (int) Cantidad a recortar desde atrás.
		 * @return numeroRecortado (int) Numero recortado.
		 */
		public static int quitarNumerosDesdeAtras(int numero, int cantidad) {
			int numeroRecortado = (int) (numero / Math.pow(10, cantidad));
			return numeroRecortado;
		}
		
		
		/**
		 * Devuelve el numero extendido (int) con el/los digitos introducidos.
		 * @param numero (int) Numero a extender.
		 * @param digito (int) Numero para extender.
		 * @return numeroExtendido (int) Numero extendido.
		 */
		public static int añadirNumeroPorDetras(int numero, int digito) {
			int numeroExtendido = (numero * 10) +digito;
			return numeroExtendido;
		}
		
		
		/**
		 * Devuelve el trozo (int) pedido de un numero indicando el indice inicial y el final empezando por el 0.
		 * @param numero (int) Numero introducido.
		 * @param indiceInicial (int) Índice de la parte delantera del trozo, empezando por 0.
		 * @param indiceFinal (int) Índice de la parte trasera del trozo.
		 * @return trozo (int) Trozo pedido por el usuario.
		 */
		public static int pedirTrozoDeNumero(int numero, int indiceInicial, int indiceFinal) {
			int trozo = 0;
			int[] numeroArray = pedirArrayDigitos(numero);
			for(int i = indiceInicial;i<=indiceFinal;i++) {
				trozo = añadirNumeroPorDetras(trozo, numeroArray[i]);
			}
			return trozo;
		}
		
		
		/**
		 * Devuelve el numero unido (int) que son la union de dos numeros.
		 * @param primerNumero (int) Primer numero a unir.
		 * @param segundoNumero (int) Segundo numero a unir.
		 * @return numeroUnido (int) Numero union del primero y segundo.
		 */
		public static int unirDosNumeros(int primerNumero, int segundoNumero) {
			int cantidadDigitosParaAñadir = contarDigitos(segundoNumero);
			int numeroUnido = (int) (primerNumero * Math.pow(10, cantidadDigitosParaAñadir))+segundoNumero;
			return numeroUnido;
		}
		
		/**
		 * Devuelve una array (int[]) con numeros aleatorios, con el tamaño indicado.
		 * @param tamaño (int) Tamaño de la array.
		 * @param minimo (int) Minimo del numero aleatorio.
		 * @param maximo (int) Maximo del numero aleatorio.
		 * @return arrayAleatoria (int[]) Array con numeros aleatorios.
		 */
		public static int[] pedirArrayAleatoria(int tamaño, int minimo, int maximo) {
			int[] arrayAleatoria = new int[tamaño];
			for(int i = 0; i<arrayAleatoria.length;i++) {
				arrayAleatoria[i] = pedirNumeroAleatorio(minimo, maximo);
			}
			return arrayAleatoria;
		}
		
		public static int[] unirDosArray(int[] principioArray, int[] finalArray) {
			int[] arrayUnida = new int[principioArray.length+finalArray.length];
			for(int i = 0; i<principioArray.length; i++) {
				arrayUnida[i] = principioArray[i];
			}
			for(int i = 0; i<finalArray.length; i++) {
				arrayUnida[principioArray.length + i] = finalArray[i];
			}
			return arrayUnida;
		}
		
		public static int pedirNumeroMayor(int[] array) {
			int numMayor = array[0];
			for (int num:array) {
				if(num>numMayor) {
					numMayor = num;
				}
			}
			return numMayor;
		}
		
		public static int pedirNumeroMenor(int[] array) {
			int numMayor = array[0];
			for (int num:array) {
				if(num<numMayor) {
					numMayor = num;
				}
			}
			return numMayor;
		}
		
		
}




