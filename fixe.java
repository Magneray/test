/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.util.*;
/**
 *
 * @author maxime
 */
public class fixe extends ordi {
    private String CG,chipset;
    private boolean clavier ;
    public fixe (String processeur,String DD,String OS,int ref,int RAM,double prixVente,String CG,String chipset,boolean clavier){
          super(processeur,DD,OS,ref,RAM,prixVente);
          this.CG=CG;
          this.chipset=chipset;
          this.clavier=clavier;
          
          jhhgjghjghjghj
gjcghjghhgfhf
hjkg
hgjhg
jlkhljkjl

    }
    /**
     * 
     * @return 
     */
    public String getCG(){
        return CG;
    }
    public String getChipset(){
        return chipset;
    }
    public boolean getClavier(){
        return clavier;
    }
    
    public String toString(){
        return super.toString()+"\n"+" carte graphique  : "+CG+" chipset "+chipset+" clavier "+clavier;
    }
}
