/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

/**
 *
 * @author LGNOTE
 */
public class Paciente {
    
    private String rg;
    private String nome;
    private String endereco;
    private String telefone;
    
    public Paciente(String rg, String nome, String endereco, String telefone){
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    
}
