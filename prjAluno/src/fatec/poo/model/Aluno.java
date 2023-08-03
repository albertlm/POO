/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482123001
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;

    public void setRA(int RA) {
        this.RA = RA;
    }

    public void setNtPrv1(double NtPrv1) {
        this.NtPrv1 = NtPrv1;
    }

    public void setNtPrv2(double NtPrv2) {
        this.NtPrv2 = NtPrv2;
    }

    public void setNtTrab1(double NtTrab1) {
        this.NtTrab1 = NtTrab1;
    }

    public void setNtTrab2(double NtTrab2) {
        this.NtTrab2 = NtTrab2;
    }

    public int getRA() {
        return RA;
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public double getNtTrab1() {
        return NtTrab1;
    }

    public double getNtTrab2() {
        return NtTrab2;
    }
    
    public double calcMediaProva(){
        double MediaProva = (0.75*(NtPrv1+2*NtPrv2)/3);
        return(MediaProva);
    }
    
    public double calcMediaTrab(){
        double MediaTrab = (0.25*(NtTrab1+NtTrab2)/2);
        return(MediaTrab);
    }
    
    public double calcMediaFinal(){
        double MediaFinal = (calcMediaProva()+calcMediaTrab());
        return(MediaFinal);
    }

}
