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
public class netBook extends ordi{
    
    double tailleEcran, poids;
    boolean webCam,lecteurSD;
    /**
     * 
     * @param processeur
     * @param DD
     * @param OS
     * @param ref
     * @param RAM
     * @param prixVente
     * @param tailleEcran
     * @param poids
     * @param webCam
     * @param lecteurSD 
     */
    public netBook (String processeur,String DD,String OS,int ref,int RAM,double prixVente, double tailleEcran,double poids,boolean lecteurSD){
       
        super(processeur,DD,OS,ref,RAM,prixVente);
        this.tailleEcran=tailleEcran;
        this.poids=poids;
        
        this.lecteurSD=lecteurSD;
    }
    public double getTailleEcran (){
        return tailleEcran;
    }
    public double getPoids(){
        return poids;
    }
    
    public boolean getLecteurSD(){
        return lecteurSD;
    }
    /**
     * 
     * @return 
     */
    public boolean getLexteurSD(){
        return lecteurSD;
    }
    
   public String toString(){
        return super.toString()+"\n"+"taille écra :"+tailleEcran+" poids: "+poids+" SD ? : "+lecteurSD;
    }
}
