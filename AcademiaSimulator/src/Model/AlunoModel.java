/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class AlunoModel extends PessoaModel{
    protected double mensalidade;
    protected String observacao;
    protected ArrayList <FichaModel> ficha;

    public AlunoModel(double mensalidade, String observacao, String nome, String CPF, String dtNasc, String telefone) {
        super(nome, CPF, dtNasc, telefone);
        this.mensalidade = mensalidade;
        this.observacao = observacao;
        ficha = new ArrayList();
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ArrayList<FichaModel> getFicha() {
        return ficha;
    }

    public void setFicha(ArrayList<FichaModel> ficha) {
        this.ficha = ficha;
    }
    
    public void adicionarFicha(FichaModel ficha){
        this.ficha.add(ficha);
    }
}
