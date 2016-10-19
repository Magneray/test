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


public class portable extends ordi{
        private double tailleEcran, poids;
        private boolean webcam, dvd;
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
         * @param webcam
         * @param dvd 
         * @see
         * 
         */
        public portable (String processeur,String DD,String OS,int ref,int RAM,double prixVente,double tailleEcran,double poids, boolean webcam,boolean dvd){
            super(processeur,DD,OS,ref,RAM,prixVente);
            this.tailleEcran= tailleEcran;
            this.poids=poids;
            this.webcam=webcam;
            this.dvd=dvd;
           
        }
        public double getTailleEcran(){
            return tailleEcran;
        }
        public double getPoids(){
            return poids;
        }
        public boolean getWebcam(){
            return webcam;
        }
        public boolean getDvd(){
            return dvd;
        }
        public String toString(){
            return super.toString()+"\n"+" Taille écran "+tailleEcran+" poids "+poids+" webcam ? "+webcam+" dvd ? "+dvd;
        }
        
}
