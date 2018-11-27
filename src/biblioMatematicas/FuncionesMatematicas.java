package biblioMatematicas;
import java.util.Scanner;

/*
*
* Ejercicios 1 - 14
*
*/

public class FuncionesMatematicas {
  public static void main(String[] args){
	  
	Scanner s = new Scanner(System.in);
    
    int numero = Integer.parseInt(s.nextLine());
    int digito = Integer.parseInt(s.nextLine());
    System.out.print(pegaPorDelante(numero, digito));
  }
  
  // FUNCIONES #################################################################
  
  //EJERCICIO 1 #################################################################
  /**
   * Devuelve verdadero si un número es capicúa y falso si no
   * @param Número entero que queremos saber si es capicúa
   * @return true si es capicúa y false si no
   */
  public static boolean esCapicua(int numero) {
    
    return numero == voltea(numero);
  }
  
  //EJERCICIO 2 #################################################################
  /**
   * Devuelve true si el número es primo
   * 
   * @param Número entero
   * @return True si el número es primo, false si no
   */
  public static boolean esPrimo(int numero) {
    
    boolean primo = true;
    
    for (int i = 2; i < numero; i++) {
      
      if ((numero % i) == 0) {
        
        primo = false;
      }
    }
    
    if (numero < 2) {
      
      primo = false;
    }
    
    return primo;
  }
  
  //EJERCICIO 3 #################################################################
  /**
   * Devuelve el siguiente número primo mayor que el número introducido
   * @param Número entero
   * @return Número entero primo
   */
  public static int siguientePrimo(int numero) {
    
    boolean primo = false;
    int numeroPrimo = numero;
    
    while (!primo) {
      
      numeroPrimo++;
      primo = esPrimo(numeroPrimo);
    }
    
    return numeroPrimo;
  }
  
  //EJERCICIO 4 #################################################################
  /**
   * Dada una base y un exponente devuelve la potencia
   * @param Número entero que es la base
   * @param Número entero que es el exponente
   * @return Un número entero que es la potencia
   */
  public static int potencia(int base, int exponente) {
    
    int potencia = 1;
    
    for (int i = 0; i < exponente; i++) {
      
      potencia *= base;
    }
    
    return potencia;
  }
  
  //EJERCICIO 5 #################################################################
  /**
   * Cuenta el número de dígitos de un número entero
   * @param Número entero que se quiere contar los dígitos
   * @return Un número entero que indica el número de dígitos
   */
  public static int digitos(int numero) {
	  
	  int digitos = 1;
	  int cifra = 10;
    
    while(numero >= cifra) {
    	
    	digitos++;
    	cifra*=10;
    }
    
    return digitos;
  }
  
  //EJERCICIO 6 #################################################################
  /**
   * Invierte un número (le da la vuelta)
   * @param Número entero que se quiere invertir
   * @return Un número entero invertido
   */
  public static int voltea(int numero) {
    
    int volteado = 0;
    
    while (numero > 0) {
      
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    return volteado;
  }
  
  //EJERCICIO 7 #################################################################
  /**
   * Devuelve el dígito que está en la posición N
   * de un número entero
   * @param Número entero
   * @param Número entero que indica la posición
   * @return El dígito que está en la posición N
   */
  public static int digitoN(int numero, int indice) {
    
    int maxIndice = digitos(numero) - 1;
    int numeroInv = voltea(numero);
    
    int cifra = 10;
    
    if ((indice > maxIndice) | (indice < 0)) {
    	
    	return -1;
    }
    
    for (int i = 0; i < indice; i++) {
		
    	cifra*=10;
	}
    
    int resultado = (numeroInv % cifra) / (cifra/10);
    
    return resultado;
  }
  
  //EJERCICIO 8 #################################################################
  /**
   * Devuelve la posición de la primera ocurrencia de un dígito
   * de un número entero
   * @param Número entero que represena el dígito
   * @return Un número entero que indica la posición del dígito
   */
  public static int posicionDeDigito(int numero, int digito) {
	  
	int digitosNumero = digitos(numero);
	int digitoComp;
	
	for (int i = 0; i < digitosNumero; i++) {
		
		digitoComp = digitoN(numero, i);
		
		if (digitoComp == digito) {
			
			return i;
		}
	}
	
	return -1;
  }
  
  //EJERCICIO 9 #################################################################
  /**
   * Le quita a un número N dígitos por detrás (por la derecha)
   * @param Número entero
   * @param Número entero que indica el número de dígitos
   * @return El número sin los dígitos
   */
  public static int quitaPorDetras(int numero, int digitos) {
    
	int cifra = 1;
	
	for (int i = 0; i < digitos; i++) {
		
		cifra *= 10;
	}
	
	return (numero / cifra);
  }
  
  //EJERCICIO 10 #################################################################
  /**
   * Le quita a un número N dígitos por delante (por la izquierda)
   * @param Número entero
   * @param Número entero que indica el número de dígitos
   * @return El número sin los dígitos
   */
  public static int quitaPorDelante(int numero, int digitos) {
    
	int numeroVolteado = voltea(numero);
	int cifra = 1;
		
	for (int i = 0; i < digitos; i++) {
			
		cifra *= 10;
	}
		
	return (voltea(numeroVolteado / cifra));
  }

  //EJERCICIO 11 #################################################################
  /**
   * Añade un dígito a un número por detrás
   * @param Número entero
   * @param Dígito que se quiere añadir
   * @return El número con el dígito nuevo
   */
  public static int pegaPorDetras(int numero, int digito) {
    
	String numeroNuevo = String.valueOf(numero) + String.valueOf(digito);
	
	return Integer.parseInt(numeroNuevo);
  }
  
  //EJERCICIO 12 #################################################################
  /**
   * Añade un dígito a un número por delante
   * @param Número entero
   * @param Dígito que se quiere añadir
   * @return El número con el dígito nuevo
   */
  public static int pegaPorDelante(int numero, int digito) {
    
	String numeroNuevo = String.valueOf(digito) + String.valueOf(numero);
	
	return Integer.parseInt(numeroNuevo);
  }
  
  /**
   * Devuelve un número entre 1 y 6
   * 
   * @return Un número entero aleatorio entre 1 y 6
   */
  public static int tiraDado() {
    
    return aleatorio(1, 6);
  }
  
  /**
   * Devuelve un número entero aleatorio entre min y max
   * 
   * @param El mínimo en el intervalo
   * @param El máximo en el intervalo
   * @return Un número entero aleatorio entre min y max
   */
  public static int aleatorio(int min, int max) {
    
    return (int)(Math.random() * (max - min + 1)) + min;
  }
}
