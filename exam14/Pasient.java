/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lev
 */
public class Pasient extends Person {
    

private Resept[] resepter;
private int antall = 0;

final int MAX = 100;

public Pasient(String n, String f){
    super(navn,fodselsdato);
        }

//A
public Resept finnResept(int n){
    
    if(n<0 || n>Respter.length){
        return null;}
    return Resepter[n];
}
//B cant figure it out :(
@Override
public String toString(){
    Return "pasientens navn er "+super.getName()+"Alle reseptene er utlevert:" +...lo
}

    
}
