
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.obcamargo
 */
public class Ex06 {
    public static void main(String[] arg){

        int numero01, numero02;       

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero01 =  leitor.nextInt();
        
        System.out.print("Digite um numero: ");
        numero02 =  leitor.nextInt();
        
        System.out.println("O produto dos dois numeros: " +numero01*numero02 );
               
      }
}
