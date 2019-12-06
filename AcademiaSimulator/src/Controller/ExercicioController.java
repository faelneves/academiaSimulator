/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ExercicioModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ExercicioController {
    
    public String[] descricao = {"Supino Reto","Crucifixo na Polia","Voador"   //Peito
            ,"Remada baixa","Pulldown", "Terra"        //Costas
            ,"Elevaçao lateral","Militar", "Crucifixo inverso"   // Deltoide
            ,"Rosca direta", "Rosca scott", "Martelo"    //Biceps
            ,"Testa", "Corda", "Paralela"    //Triceps
            , "Agachamento", "Leg press", "Stiff"};      //Perna

    
    ExercicioModel exerc = new ExercicioModel(descricao, , );
        
    public void addExercicio(){
        
    }
    
    public void removeExercicio(){
       
    }
    
    public void attExercicio(){
  
    }
    
    public ExercicioModel returnExercicio(){
    }
}

}
