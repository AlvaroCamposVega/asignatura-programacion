/*
*
* Prueba Funciones
*
*/

public class PruebaFunciones {
  public static void main(String[] args){
    
    System.out.println("Juego de la Oca Versión IES Campanillas");
    System.out.println(tiraDado());
    System.out.println(tiraDado());
    
    System.out.println("Aleatorio entre dos números");
    
    System.out.print("Introduzca el mínimo: ");
    int minimo = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el máximo: ");
    int maximo = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 20; i++) {
      
      System.out.print(aleatorio(minimo, maximo) + " ");
    }
    
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Si le damos la vuelta al úmero tenemos: " + invierte(numero));
  }
  
  // FUNCIONES #################################################################
  
  /**
   * Devuelve  un número entero entre 1 y 6 que se corresponde con la tirada de
   * un dado
   * 
   * @return Un número aleatorio entre 1 y 6
   */
   
  public static int tiraDado() {
    
    return aleatorio(1, 6);
  }
  
  public static int aleatorio(int min, int max) {
    
    return (int)(Math.random() * (max - min + 1)) + min;
  }
  
  /**
   * Invierte un número (le da la vuelta)
   * @param numero Número entero que se quiere invertir
   * @return
   */
  public static int invierte(int numero) {
    
    int volteado = 0;
    
    while (numero > 0) {
      
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    return volteado;
  }
}
