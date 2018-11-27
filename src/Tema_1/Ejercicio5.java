package Tema_1;

/*

EJERCICIO 5
muestra el horario de la clase por pantalla coloreado

*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
    System.out.println(" ////////////////////////////////////////////////");
    System.out.println("| Lunes | Martes | Miércoles | Jueves | Viernes |");
    System.out.println("|  \033[31mEED\033[37m  |  \033[33mSINF\033[37m  |    \033[34mPRO\033[37m    |   \033[34mPRO\033[37m  |   \033[33mSINF\033[37m  |");
    System.out.println("|  LM\033[37m   |  \033[33mSINF\033[37m  |    \033[34mPRO\033[37m    |   \033[34mPRO\033[37m  |   \033[33mSINF\033[37m  |");
    System.out.println("|  \033[32mBBDD\033[37m |  \033[33mSINF\033[37m  |    \033[34mPRO\033[37m    |   \033[31mEED\033[37m  |   \033[33mSINF\033[37m  |");
    System.out.println("|  \033[32mBBDD\033[37m |  \033[34mPRO\033[37m   |    \033[32mBBDD\033[37m   |   \033[31mEED\033[37m  |   \033[35mFOL\033[37m   |");
    System.out.println("|  \033[32mBBDD\033[37m |  \033[34mPRO\033[37m   |    \033[32mBBDD\033[37m   |   LM\033[37m   |   \033[35mFOL\033[37m   |");
    System.out.println("|  \033[32mBBDD\033[37m |  \033[34mPRO\033[37m   |    \033[32mBBDD\033[37m   |   LM\033[37m   |   \033[35mFOL\033[37m   |");
  }
}
