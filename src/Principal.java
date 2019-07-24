
//Paquete

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        //instancia método con el nombre keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Write the first number:");
        //Variable entero firstNumber = objeto keyboard que sea entero
        int firstNumber = keyboard.nextInt();

        System.out.println("Write the second number:");
        //Variable entero secondNumber = objeto keyboard que sea entero
        int secondNumber = keyboard.nextInt();

        System.out.println("Total is:" + (firstNumber+secondNumber));

    }
}
