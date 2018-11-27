package Tema_4;

/*
*
* EJERCICIO 13
* ordena tres números introducidos por teclado
*
*/

public class Ejercicio13 {
  public static void main(String[] args) {
  
    System.out.print("Introduce un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce otro número entero: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el tercer y último número entero: ");
    int num3 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int numMenor = 0;
    int num = 0;
    int numMayor = 0;
    
    if ((num1 < num2) && (num1 < num3)) { // Si num1 es el menor

        numMenor = num1;
      
        // Miramos cual de los otros dos es el mayor
        if ((num2 > num1) && (num2 > num3)) {

          numMayor = num2;
          num = num3;
        
        } else if ((num3 > num1) && (num3 > num2)) {

          numMayor = num3;
          num = num2;

        } else { // Si los mayores son iguales

            num = num2;
            numMayor = num3;
        }

    } else if ((num2 < num1) && (num2 < num3)) { // Si num2 es el menor

        numMenor = num2;
      
        // Miramos cual de los otros dos es el mayor
        if ((num1 > num2) && (num1 > num3)) {

          numMayor = num1;
          num = num3;
        
        } else if ((num3 > num1) && (num3 > num2)) {

          numMayor = num3;
          num = num1;

        } else { // Si los mayores son iguales

            num = num1;
            numMayor = num3;
        }

    } else if ((num3 < num1) && (num3 < num2)) { // Si num3 es el menor

        numMenor = num3;
      
        // Miramos cual de los otros dos es el mayor
        if ((num2 > num1) && (num2 > num3)) {

          numMayor = num2;
          num = num1;
        
        } else if ((num1 > num2) && (num1 > num3)) {

          numMayor = num1;
          num = num2;

        } else { // Si los mayores son iguales

          num = num2;
          numMayor = num1;
        }
      
    } else { // Si los menores son iguales

        if (num1 == num2) {

          numMenor = num1;
          num = num2;
          numMayor = num3;

        } else if (num1 == num3) {

          numMenor = num1;
          num = num3;
          numMayor = num2;

        } else if (num2 == num3) {

          numMenor = num2;
          num = num3;
          numMayor = num1;
        }
    }
    
    System.out.print("Como los has introducido: " + num1 + ", " + num2 + ", ");
    System.out.println(num3);
    System.out.print("Ahora están ordenados de menor a mayor: " + numMenor);
    System.out.print(", " + num + ", " + numMayor);
  }
}
