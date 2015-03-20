/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico.Entidades;

import java.util.Date;

/**
 *
 * @author LGNOTE
 */
public class Consulta {
    
    private String prontuario;
    private Paciente paciente;
    private Receituario receituario;
    private boolean finalizada; 
    private Date data;
    
    public Consulta(Paciente paciente, Date data) {
        this.paciente = paciente;
        this.data = data;
    }

    public void definirReceituario(Receituario receituario) {
        
    }
    
    public void finalizarConsulta() {
        
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
    public Receituario getReceituario() {
        return receituario;
    }

    /**
     * @return the finalizada
     */
    public boolean isFinalizada() {
        return finalizada;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }
}
