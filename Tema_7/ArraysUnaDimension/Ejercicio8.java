/*
*
* EJERCICIO 8
* Muestra un diagrama de barras que contenga los datos de la temperatura media
* de cada mes de un año
*
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    
    String[] mes = {
      
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
      "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    int[] temperaturas = new int[12];
    
    for (int i = 0; i < 12; i++) {
      
      System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
      int temperatura = Integer.parseInt(System.console().readLine());
      
      temperaturas[i] = temperatura;
    }
    
    System.out.println();
    
    for (int i = 0; i < 12; i++) {
      
      String barra = "";
      
      System.out.printf("%-11s", mes[i]);
      
      for (int j = 0; j < temperaturas[i]; j++) {
        
        barra += "*";
      }
      
      System.out.printf("%-3s", barra);
      
      System.out.println();
    }
  }
}
