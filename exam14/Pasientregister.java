/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lev
 */
public class Pasientregister{

    private Pasient[] pasienter;
    private Pasientregister(Pasient p){
        pasienter = p;
    }
    
    Public boolean nyPasient(Pasient p)
    {
        /**
         * 
         */
    
    }
    
    public Pasient finnPasien(String dato, String navn){
        /**
         * 
         */
    }

    //oppgaven
    public Pasient[] finnPasient(String dato)
    {
        Pasient[] matchingPasienter = new Pasient [count];
        Pasient[] foundMatchingforStoring = new Pasient [pasienter.lenght()];
        int count = 0;

        for (int i = 0; i<=pasienter.length(); i++){
          
          if(pasienter[i].getDate().equals(dato)){
            foundMatchingforStoring[i]=pasienter[i];
            count ++;
          
          }

          if(count==0){
            matchingPasienter=null;
          }
        }

        for (int i = 0; i<=count; i++){
          matchingPasienter[i]=foundMatchingforStoring[i];
        }

        return matchingPasienter;
        
        
    }
    
}
