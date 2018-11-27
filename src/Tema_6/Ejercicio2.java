package Tema_6;

/*
*
* EJERCICIO 2
* Muestra al azar el numbre de una carta de la baraja francesa
*
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random() * 4) + 1;
    
    switch(numeroPalo) {
      
      case 1:
      
        palo = "picas";
        break;
        
      case 2:
      
        palo = "corazones";
        break;
        
      case 3:
      
        palo = "diamantes";
        break;
        
      case 4:
      
        palo = "tréboles";
        break;
        
      default:
    }

    int numCarta = (int)(Math.random() * 13) + 1;
    
    switch(numCarta) {
      
      case 1:
      
        carta = "As";
        break;
        
      case 11:
      
        carta = "J";
        break;
        
      case 12:
      
        carta = "Q";
        break;
        
      case 13:
      
        carta = "K";
        break;
        
      default:
      
        carta = String.valueOf(numCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
}
