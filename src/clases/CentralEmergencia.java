/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class CentralEmergencia {
    private String llamada;

    public CentralEmergencia(String llamada) {
        this.llamada = llamada;
    }

    public String getLlamada() {
        return llamada;
    }

    public void setLlamada(String llamada) {
        this.llamada = llamada;
    }
    
    
    public void solicitarAyuda(){
        JOptionPane.showMessageDialog(null, "LLAMANDO A LA CENTRAL DE EMERGENCIA!! : "+llamada);
    }
}
