
public class Lege extends Person{
   
  
   public String adress;
   public double tlf;
   public boolean lisens;
   private final int antalResept = 100;
   public Resept rec[] = new Resept[antalResept];
   
   int countResept=0; 
   
   public Lege(String name, String dato, String adr, double tlf, boolean lisens){
       
       super(name, dato);
       this.adress=adr;
       this.tlf=tlf;
       this.lisens=lisens;
       //count of current number of recepts
       }
       
       /**
        * fyller ut arrayet med recepter
        * deloppgave c
        */
       
       public String nyResept(Resept r){

           if (countResept>=antalResept){
               return "Det er ikke plass til flere recepter";
           }
          rec[countResept]=r;
          
           countResept ++;
           
    
           return r.toString();
       }
       
       
       //b
       public boolean getLisens(){
           return lisens;
       }
       public String toString(){
             
             String str = "Legens navn er " + this.name + " Legens fødselsdato er " + this.dato + "Legens adresse: " + this.adress + "\n" + 
             "Legens tlf er" + this.tlf + "Legen har lisens: " + this.lisens + "\n";

             String listofReceptstoString ="";
             
             String list[] = new String[countResept];
             for(int i = 0; i<=countResept; i++){
              listofReceptstoString=listofReceptstoString+rec[i].toString();
             }

             return str + listofReceptstoString;
       }
       
       //d
       public String utskrevneResepter(){

        if (countResept == 0){
          return "Legen har ingen utskrevne resepter";
        }
         
        String alleRecepterSomErUtskrevet = "";

        for (int i = countResept-1; i>=0; i--){
          alleRecepterSomErUtskrevet=alleRecepterSomErUtskrevet+rec[i].toString();
        }

        return alleRecepterSomErUtskrevet;

       }

} 
   
   
    
}
