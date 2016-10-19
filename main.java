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
public class main {
    public static void main(String [] args){
        
        ArrayList<ordi> ordis=new ArrayList<ordi>();
        
        ordi o1 = new ordi("RAdeon","wd","macos",5,16,12.6);
       ordis.add(o1);
       fixe f1= new fixe("intel","West","w10",10,32,256.99,"nvifdia gtx","asus",false);
       ordis.add(f1);
       System.out.println(o1);
       System.out.println(f1);
    }
    
}
