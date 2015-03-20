/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico.Entidades;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author niltonkummer
 */
public class Agenda {
    private HashMap<String, Paciente> agendamentos;
    public Agenda() {
        agendamentos = new HashMap<>();
    }
    
    public boolean verificarHorario(String dataString) {
        return this.agendamentos.get(dataString) != null;
    }
    
    public void reservarHorario(Date data, Paciente paciente) {
        this.agendamentos.put(data.toString(),paciente);
    }
    
    
    public void alterarHorario(Paciente paciente) {
        Iterator<String> keySetIterator = this.agendamentos.keySet().iterator();

        while(keySetIterator.hasNext()){
          String key = keySetIterator.next();
          System.out.println("key: " + key + " value: " + this.agendamentos.get(key));
        }

    }
}
