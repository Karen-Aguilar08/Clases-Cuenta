/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        
        Usuario usuario = new Usuario (nombre, saldoInicial);
        CajeroAutomatico cajero = new CajeroAutomatico();
        
        boolean salir = false;
        while(!salir){
            System.out.println("Elige una opcion");
            System.out.println(" 1. Consultar saldo");
            System.out.println(" 2. Depositar");
            System.out.println(" 3. Retirar");
            System.out.println(" 4. Salir");
            
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Saldo Inicial: $" + cajero.consultarSaldo(usuario));   
                break;
                
                case 2:
                System.out.print("Introduce la cantidad a depositar : ");   
                double cantidadDepositar = scanner.nextDouble();
                cajero.depositar(usuario, cantidadDepositar);
                System.out.println("Saldo despues de depositar es: $" + cajero.consultarSaldo(usuario)); 
                break;
                
                case 3:
                System.out.print("Introduce la cantidad a retirar : ");
                double cantidadRetirar = scanner.nextDouble();
                if (cajero.retirar(usuario, cantidadRetirar)){
                    System.out.println("Saldo despues de retirar es: $" + cajero.consultarSaldo(usuario)); 
                }else{
                    System.out.print("Saldo insuficiente: ");   
                }
                break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.print("Opcion no valida: "); 
                    break;
            }
        }
        scanner.close();
    }
}
