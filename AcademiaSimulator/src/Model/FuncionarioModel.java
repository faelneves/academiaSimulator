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
public class FuncionarioModel extends PessoaModel{
    protected double Salario;

    public FuncionarioModel(double Salario, String nome, String CPF, String dtNasc, String telefone) {
        super(nome, CPF, dtNasc, telefone);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
}
