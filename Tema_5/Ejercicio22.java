/*
*
* EJERCICIO 22
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
*
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    
    int numero = 2;
    int i = 2;
    boolean primo;
    
    while (numero <= 100) {
      
      primo = true;
      
      while (i < numero) {
      
        if ((numero % i) == 0) {
        
          primo = false;
        }
        
        i++;
      }
      
      if (primo) {
        
        System.out.println(numero);
      }
      
      numero++;
      i = 2;
    }
  }
}
