/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rafael
 */
public class ExercicioModel {
    protected String[] descricao;
    protected String repeticao, descanco;

    public ExercicioModel(String[] descricao, String repeticao, String descanco) {
        this.descricao = descricao;
        this.repeticao = repeticao;
        this.descanco = descanco;
    }

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public String getDescanco() {
        return descanco;
    }

    public void setDescanco(String descanco) {
        this.descanco = descanco;
    }
    
    
}
