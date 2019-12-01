/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FuncionarioModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafael
 */
public class FuncionarioController extends AbstractTableModel {
    
    private ArrayList<FuncionarioModel> funcionarios = new ArrayList();
    private String[] colunas = {"Nome","CPF","Telefone","Dt. Nascimento","Salário"};

    @Override
    public String getColumnName(int i) {
        return colunas[i]; //To change body of generated methods, choose Tools | Templates.
    }
        
    
    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0: return funcionarios.get(linha).getNome();
            case 1: return funcionarios.get(linha).getCPF();
            case 2: return funcionarios.get(linha).getTelefone();
            case 3: return funcionarios.get(linha).getDtNasc();
            case 4: return funcionarios.get(linha).getSalario();
        }
        return null;
    }
    
    public void addFuncionario(double Salario, String nome, String CPF, String dtNasc, String telefone){
        FuncionarioModel func = new FuncionarioModel(Salario, nome, CPF, dtNasc, telefone);
        funcionarios.add(func);
        this.fireTableDataChanged();
    }
    
    public void removeFuncionario(int linha){
        funcionarios.remove(linha);
        this.fireTableDataChanged();
    }
    
    public void attFuncionario(double Salario, String nome, String CPF, String dtNasc, String telefone, int linha){
         FuncionarioModel func = new FuncionarioModel(Salario, nome, CPF, dtNasc, telefone);
        funcionarios.set(linha, func);
        this.fireTableDataChanged();
    }
    
    public FuncionarioModel returnFuncionario(int linha){
        return funcionarios.get(linha);
    }
}
