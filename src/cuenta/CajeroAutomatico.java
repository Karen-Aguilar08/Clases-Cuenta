/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author alumno
 */
public class CajeroAutomatico {
    public double consultarSaldo(Usuario usuario){
        return usuario.getCuenta().getSaldo();
    }
      public void depositar(Usuario usuario, double cantidad){
          usuario.getCuenta().depositar(cantidad);
      }      
      public boolean retirar (Usuario usuario, double cantidad){
          return usuario.getCuenta().retirar(cantidad);
      } 
}
