/*
*
* EJERCICIO 7
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces
* por teclado dos valores y a continuación cambiará todas las ocurrencias del
* primer valor por el segundo en la lista generada anteriormente. Los números
* que se han cambiado deben aparecer entrecomillados.
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    
    int numeros[] = new int[100];
    
    for (int i = 0; i < 100; i++) {
      
      numeros[i] = (int)(Math.random() * 21);
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println("\n");
    
    System.out.print("Introduce el valor que deseas cambiar: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el nuevo valor: ");
    int valor2 = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 100; i++) {
      
      if (numeros[i] == valor1) {
        
        numeros[i] = valor2;
        System.out.print("\"" + numeros[i] + "\" ");
        
      } else {
        
        System.out.print(numeros[i] + " ");
      }
    }
  }
}
