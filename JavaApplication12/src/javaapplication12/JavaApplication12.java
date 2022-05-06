/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author LABMOVIL
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese de dia que desea");
        Scanner scan = new Scanner(System.in);
          String opcion = scan.nextLine();
        
        switch (opcion){

            case "lunes":{

                System.out.println(" el dia de la semana es laboral.");

                break;

            }

            case "martes":{

                System.out.println("el dia de la semana es laboral.");

                break;

            }

            case "miercoles":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            
            case "jueves":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            
            case "viernes":{

                System.out.println("el dia de la semana es laboral.");

                break;
                

            }
            case "sabado":{

                System.out.println("el dia de la semana no es laboral.");

                break;
                

            }
            case "domingo":{

                System.out.println("el dia de la semana no es laboral.");

                break;
                

            }

            default: {

                System.out.println("Opcion incorrecta");
            }
        }
    
    }
    
}
