/*
*
* EJERCICIO 10
* Pinta por pantalla diez líneas formadas por carácteres aleatorios, la longitud
* de estas es tambien aleatoria.
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int caracterAleatorio = 0;
    int lineas = 10;
    int longitudLinea = 0;
    String caracter = "";
    
    for (int i = 0; i < lineas; i++) {
      
      caracterAleatorio = (int)(Math.random() * 6) + 1;
      longitudLinea = (int)(Math.random() * 40) + 1;
      
      switch (caracterAleatorio) {
        
        case 1:
        
          caracter = "*";
          break;
          
        case 2:
        
          caracter = "-";
          break;
        
        case 3:
        
          caracter = "=";
          break;
        
        case 4:
        
          caracter = ".";
          break;
        
        case 5:
        
          caracter = "|";
          break;
        
        case 6:
        
          caracter = "@";
          break;
      }
      
      for (int j = 0; j < longitudLinea; j++) {
        
        System.out.print(caracter);
      }
      
      System.out.println();
    }
  }
}
