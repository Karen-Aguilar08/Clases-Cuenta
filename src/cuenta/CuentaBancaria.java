/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    public boolean retirar(double cantidad){
        if (this.saldo >=cantidad){
            this.saldo -= cantidad;
            return true;
        }else{
            return false;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
}
