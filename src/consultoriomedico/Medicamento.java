/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

/**
 *
 * @author LGNOTE
 */
public class Medicamento {
    
    private String nome;
    private String descricao;
    
    public Medicamento(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }
}
