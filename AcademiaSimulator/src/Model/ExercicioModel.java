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
    protected String descricao;
    protected int repeticao, descanco;

    public ExercicioModel(String descricao, int repeticao, int descanco) {
        this.descricao = descricao;
        this.repeticao = repeticao;
        this.descanco = descanco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public int getDescanco() {
        return descanco;
    }

    public void setDescanco(int descanco) {
        this.descanco = descanco;
    }
    
    
}
