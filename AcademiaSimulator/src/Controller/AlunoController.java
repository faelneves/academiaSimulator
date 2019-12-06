/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunoModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafael
 */
public class AlunoController extends AbstractTableModel {
    
    private ArrayList<AlunoModel> alunos = new ArrayList();;;
    private String[] colunas = {"Nome","CPF","Telefone","Dt. Nascimento", "Mensalidade"};

    @Override
    public String getColumnName(int i) {
        return colunas[i]; //To change body of generated methods, choose Tools | Templates.
    }
        
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0: return alunos.get(linha).getNome();
            case 1: return alunos.get(linha).getCPF();
            case 2: return alunos.get(linha).getTelefone();
            case 3: return alunos.get(linha).getDtNasc();
            case 4: return alunos.get(linha).getMensalidade();
            case 5: return alunos.get(linha).getObservacao();
            case 6: return alunos.get(linha).getFicha();
        }
        return null;
    }
    
    public void addAluno(double mensalidade, String observacao, String nome, String CPF, String dtNasc, String telefone){
        AlunoModel func = new AlunoModel(mensalidade, observacao, nome, CPF, dtNasc, telefone);
        alunos.add(func);
        this.fireTableDataChanged();
    }
    
    public void removeAluno(int linha){
        alunos.remove(linha);
        this.fireTableDataChanged();
    }
    
    public void attAluno(double mensalidade, String observacao, String nome, String CPF, String dtNasc, String telefone, int linha){
        AlunoModel func = new AlunoModel(mensalidade, observacao, nome, CPF, dtNasc, telefone);
        alunos.set(linha, func);
        this.fireTableDataChanged();
    }
    
    public AlunoModel returnAluno(int linha){
        return alunos.get(linha);
    }
}
