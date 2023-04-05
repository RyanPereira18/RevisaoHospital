/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author lucyv
 */
public class Internacao {
    private Paciente pac;
    private Enfermeiro enf;
    private Medico med;
    private String motivo;
    private double valorDia;
    private int dias;
    
    private static int id = 0;
    
    public Internacao(Paciente p, Enfermeiro e, Medico m) {
        this.pac = p;
        this.enf = e;
        this.med = m;
        id++;
    }
    public Paciente getPac() {
        return pac;
    }

    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    public Enfermeiro getEnf() {
        return enf;
    }

    public void setEnf(Enfermeiro enf) {
        this.enf = enf;
    }

    public Medico getMed() {
        return med;
    }

    public void setMed(Medico med) {
        this.med = med;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public double getValorDia() {
        return valorDia;
    }
   
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
   
    public int getDias() {
        return dias;
    }
    
    public void setDias(int dias) {
        this.dias = dias;
    }
  
    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

}

