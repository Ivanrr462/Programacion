import java.util.Random;
import java.util.Scanner;
public class Examen {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();



        //RANDOM
        //8 es el numero mas alto, y 3 es el numero mas bajo que puede dar
        int longitud = aleatorio.nextInt(8-3+1)+3;
        int altura = aleatorio.nextInt(8-3+1)+3;

        System.out.println(longitud);
        System.out.println(altura);

        //SWITCH
        //Dependiendo del caso el programa da un resultado u otro
        System.out.print("Introduce el día de la semana: ") ;
        int dia = Integer.parseInt(System.console().readLine()) ;
    
        switch(dia) {
          case 1, 2, 3, 4, 5:
            System.out.println("Es un día entre semana.") ; 
            break ;
          case 6, 7:
            System.out.println("Es fin de semana.") ;
            break ;
        }

        //WHILE
        //Repite una accion mientras una variable estupulada sea true
        //en este caso se pone 9 porque si pones se le suma despues de que haga el chequeo

        int valor = 0;
        while (valor<=9) {
            valor++;
            System.out.println(valor+"es distinto que 10");
  
        }
        System.out.println("valor = 10");
    

        //FOR
        //Este programa hace un recuento de todos los numeros hasta el marcado
        int edad ;
        int contador ;
        Scanner entrada = new Scanner(System.in) ;
    
        System.out.print("Introduce tu edad: ") ;
        edad = entrada.nextInt() ;
    
        for (contador=1; contador <= edad; contador++) { 
            System.out.print(contador+"   "); }

    }
}