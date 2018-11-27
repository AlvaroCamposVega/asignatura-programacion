package Tema_6;

/*
*
* EJERCICIO 16
* Simulador máquina tragaperras simplificado.
*
*/

public class Ejercicio16 {
  public static void main(String[] args) {

    String figura1 = "";
    String figura2 = "";
    String figura3 = "";
    int figuraTirada = 0;
    String figura = "";
    
    for (int i = 0; i < 3; i++) {
      
      figuraTirada = (int)(Math.random() * 5) + 1;
    
      switch (figuraTirada) {
        
        case 1:
        
          figura = "corazón";
          break;
        
        case 2:
        
          figura = "diamante";
          break;
        
        case 3:
        
          figura = "herradura";
          break;
        
        case 4:
        
          figura = "campana";
          break;
        
        case 5:
        
          figura = "limón";
          break;
      }
      
      switch (i) {
        
        case 0:
        
          figura1 = figura;
          break;
          
        case 1:
        
          figura2 = figura;
          break;
          
        case 2:
        
          figura3 = figura;
          break;
      }
    }
      
    System.out.println(figura1 + " " + figura2 + " " + figura3);
    
    if (figura1.equals(figura2) && figura2.equals(figura3) && figura3.equals(figura1)) {
      
      System.out.print("Enhorabuena! Has ganado 10€");
      
    } else if (!figura1.equals(figura2) && !figura2.equals(figura3) && !figura3.equals(figura1)) {
      
      System.out.print("Lo siento, has perdido");
      
    } else {
      
      System.out.print("Bien! Has recuperado tu euro");
    }
  }
}
