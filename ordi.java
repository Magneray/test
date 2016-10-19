/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;
import java.util.*;
/**
 *
 * @author maxim
 */
public class ordi {
    private int ref, RAM;
    private String processeur,DD,OS;
    private double prixVente;
 
    public ordi (String processeur,String DD,String OS,int ref,int RAM,double prixVente){
        this.DD = DD;
        this.OS= OS;
        this.RAM = RAM;
        this.prixVente =  prixVente;
        this.processeur = processeur;
        this.ref = ref;
         }

   
    public int getRef(){
        return ref;
    }
    
    public int getRAM(){
        return RAM;
    }
    public String getProcesseur(){
        return processeur;
    }
    public String getDD(){
        return DD;
    }
    public String getOS(){
        return OS;
    }
    public double getPrixVente(){
        return prixVente;
    }
    
        public String toString(){
            return ref+" "+RAM+" "+processeur+" "+DD+" "+OS+" "+prixVente+" ";
        }
}
