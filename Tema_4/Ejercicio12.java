/*
*
* EJERCICIO 12
* minicuestionario tipo test
*
*/

public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.println("A continuación se le van a realizar 10 preguntas sobre ");
    System.out.println("las asignaturas del curso, cada pregunta suma un punto");
    System.out.println();
    
    int puntos = 0;

    System.out.println("Pregunta 1:");
    System.out.println("¿Qué instrucción debemos escribir en java si deseamos");
    System.out.println("mostrar algo por pantalla sin salto de línea?");
    System.out.println("1. System.out.println()");
    System.out.println("2. System.out.print()");
    System.out.println("3. System.out.printf()");
    System.out.println("4. System.out.printear()");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta1 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta1 == 2) {
      
      puntos++;
      System.out.print("prueba");
    }
    
    System.out.println("Pregunta 2:");
    System.out.println("¿Cuál es la función de una Base de Datos?");
    System.out.println("1. Almacenar datos");
    System.out.println("2. Buscar datos");
    System.out.println("3. Administrar datos");
    System.out.println("4. Hacer galletas de chocolate");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta2 == 1) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 3:");
    System.out.println("¿Qué lenguaje de marcas usamos para formatear una página web?");
    System.out.println("1. CSS");
    System.out.println("2. Javascript");
    System.out.println("3. Java");
    System.out.println("4. HTML");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta3 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta3 == 4) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 4:");
    System.out.println("¿Cuál de los siguientes lenguajes es un lenguaje de bajo nivel?");
    System.out.println("1. Java");
    System.out.println("2. C++");
    System.out.println("3. Ensamblador");
    System.out.println("4. C#");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta4 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta4 == 3) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 5:");
    System.out.println("¿Qué conjunto de unidades componen un microprocesador?");
    System.out.println("1. Memoria, Dispositivos E/S, Registros, ALU");
    System.out.println("2. ALU, Registros, UC, Memoria");
    System.out.println("3. Memoria, Bus, Dispositivos E/S, Registros, ALU, UC");
    System.out.println("4. Una gráfica y un par de memorias RAM");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta5 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta5 == 3) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 6:");
    System.out.println("¿Qué lenguaje de programación dispone de un intérprete y");
    System.out.println("un compilador juntos?");
    System.out.println("1. C++");
    System.out.println("2. Java");
    System.out.println("3. Pascal");
    System.out.println("4. Cobol");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta6 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta6 == 2) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 7:");
    System.out.println("Cuando una computadora no puede comunicarse con el usuario");
    System.out.println("por pantalla, ¿De qué dispone esta para comunicarse?");
    System.out.println("1. De una luz LED");
    System.out.println("2. De una resistencia que calienta el plástico");
    System.out.println("3. De nada");
    System.out.println("4. De un speaker o zumbador");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta7 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta7 == 4) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 8:");
    System.out.print("¿Quién desarrolló la primera máquina capaz de ejecutar");
    System.out.println(" cualquier algoritmo?");
    System.out.println("1. Leonardo Da Vinci");
    System.out.println("2. Steve Jobs");
    System.out.println("3. Alan Touring");
    System.out.println("4. Bill Gates");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta8 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta8 == 3) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 9:");
    System.out.println("¿Cuál de estos programas es un SGBD?");
    System.out.println("1. MySQL");
    System.out.println("2. Eclipse");
    System.out.println("3. NetBeans");
    System.out.println("4. Sublime Text");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta9 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta9 == 1) {
      
      puntos++;
    }
    
    System.out.println("Pregunta 10:");
    System.out.println("¿Qué tres lenguajes son esenciales para hacer una página web?");
    System.out.println("1. HTML, Java, SQL");
    System.out.println("2. HTML, CSS, Javascript");
    System.out.println("3. SQL, HTLM, Javascript");
    System.out.println("4. CSS, SQL, HTML");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta10 = Integer.parseInt(System.console().readLine());
    System.out.println("#####################################################");
    System.out.println();
    
    if (respuesta10 == 2) {
      
      puntos++;
    }
    
    System.out.print("Has sacado " + puntos + " sobre 10");
  }
}
