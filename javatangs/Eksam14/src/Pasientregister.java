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
        int counter=0;
        Pasient[] list = new Pasient[counter];
        //teller hvor mange stemmer med datoen som er inntastet 
          for(int i = 0; i<pasienter.length; i++){
              if (pasienter[i].fodselsdato==dato){
                  counter++;
                  list[i] = pasienter[i];
              }
          }      
          
        
        
        
    }
    
}
