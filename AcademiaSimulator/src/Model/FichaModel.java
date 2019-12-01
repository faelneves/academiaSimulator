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
public class FichaModel {
    protected String tipo;
    protected ArrayList<ExercicioModel> exercicio;

    public FichaModel(String tipo) {
        this.tipo = tipo;
        exercicio = new ArrayList();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<ExercicioModel> getExercicio() {
        return exercicio;
    }

    public void setExercicio(ArrayList<ExercicioModel> exercicio) {
        this.exercicio = exercicio;
    }

    public void addExercicio(ExercicioModel exerc){
        exercicio.add(exerc);
    }
    
}
