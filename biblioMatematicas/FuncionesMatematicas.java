/*
*
* Ejercicios 1 - 14
*
*/

public class FuncionesMatematicas {
  public static void main(String[] args){
    
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("menor primo de " + numero + " es " + siguientePrimo(numero));
  }
  
  // FUNCIONES #################################################################
  
  /**
   * Invierte un número (le da la vuelta)
   * @param Número entero que se quiere invertir
   * @return Un número entero invertido
   */
  public static int invierte(int numero) {
    
    int volteado = 0;
    
    while (numero > 0) {
      
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    return volteado;
  }
  
  /**
   * Devuelve verdadero si un número es capicúa y falso si no
   * @param Número entero que queremos saber si es capicúa
   * @return true si es capicúa y false si no
   */
  public static boolean esCapicua(int numero) {
    
    return numero == invierte(numero);
  }
  
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
  
  /**
   * Devuelve el siguiente número primo mayor que el número introducido
   * 
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
  
  /**
   * Dada una base y un exponente devuelve la potencia
   * 
   * @param Número entero que es la base
   * @param Número entero que es el exponente
   * @return Un número entero que es la potencia
   */
  public static boolean potencia(int base, int exponente) {
    
    int potencia = 1;
    
    for (int i = 0; i < exponente; i++) {
      
      potencia *= base;
    }
    
    return primo;
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
