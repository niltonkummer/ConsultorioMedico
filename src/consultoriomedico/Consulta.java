/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import sun.util.calendar.BaseCalendar;

/**
 *
 * @author LGNOTE
 */
public class Consulta {
    
    private String prontuario;
    private String receituario;
    private boolean finalizada; 
    
    public Consulta() {
        
    }

    /**
     * @return the prontuario
     */
    public String getProntuario() {
        return prontuario;
    }

    /**
     * @param prontuario the prontuario to set
     */
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    /**
     * @return the receituario
     */
    public String getReceituario() {
        return receituario;
    }

    /**
     * @param receituario the receituario to set
     */
    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    /**
     * @return the finalizada
     */
    public boolean isFinalizada() {
        return finalizada;
    }

    /**
     * @param finalizada the finalizada to set
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}
