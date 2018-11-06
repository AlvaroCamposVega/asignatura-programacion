/*
*
* EJERCICIO 11
* Muestra 20 notas al azar y dice el número total.
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    
    int notaAleatoria = 0;
    int totSus = 0;
    int totSuf = 0;
    int totBie = 0;
    int totNot = 0;
    int totSob = 0;
    int numNotas = 20;
    String nota = "";
    
    for (int i = 0; i < numNotas; i++) {
      
      notaAleatoria = (int)(Math.random() * 5) + 1;
      
      switch (notaAleatoria) {
        
        case 1:
        
          nota = "suspenso";
          totSus++;
          break;
          
        case 2:
        
          nota = "suficiente";
          totSuf++;
          break;
        
        case 3:
        
          nota = "bien";
          totBie++;
          break;
        
        case 4:
        
          nota = "notable";
          totNot++;
          break;
        
        case 5:
        
          nota = "sobresaliente";
          totSob++;
          break;
      }
      
      System.out.print(nota + " ");
    }
    
    System.out.println();
    System.out.println("\nTotal de suspensos: " + totSus);
    System.out.println("Total de suficientes: " + totSuf);
    System.out.println("Total de bienes: " + totBie);
    System.out.println("Total de notables: " + totNot);
    System.out.println("Total de sobresalientes: " + totSob);
  }
}
