/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Albert Leme de Brito, Camila Caroline Gonçalves de Pontes e Guilherme Cerqueira Lima
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList <Pedido> pedidos; //multiplicidade 1..*

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        pedidos = new ArrayList <Pedido>();        
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }
    
    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }


    public void addPedido (Pedido p){
        pedidos.add(p); // Cliente --> pedido
        p.setCliente(this); // Pedido --> cliente
    }
}