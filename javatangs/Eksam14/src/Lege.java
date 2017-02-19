
public class Lege extends Person{
   
  
   public String adress;
   public double tlf;
   public boolean lisens;
   private final int antalResept = 100;
   public Resept[] = new Resept[antalResept];
   
   int countResept; 
   
   public Lege(String n, String a, String adr, double tlf, boolean lisens, Resept[] R){
       
       super(navn, fodselsdato);
       this.adress=adr;
       this.tlf=tlf;
       this.lisens=lisens;
       //count of current number of recepts
       int countResept = 0;
       this.Resept = R[antalResept];
       
       /**
        * fyller ut arrayet med recepter
        * deloppgave c
        */
       
       public String nyResept(Resept r){
           int i;
           for(i = countResept; i<=antalResept; i++){
           R[i]=r;
           countResept ++;
           
       }
           if (countResept>=antalResept){
               return "Det er ikke plass til flere recepter";
           }
           return R[i].toString();
       }
       
       
       //b
       public String getLisens(boolean lisens){
           String responce = " ";
           
           if (lisens)
               responce = "Legen har lisens";
           if (lisens == false)
               responce =  "legen har ikke lisens";
          return responce;
       }
       public String toString(){
               
             //metoden retunerer all inforamsjon om resepter som ligger i R[];
             //metoden er implementert i recept class
       }
       
       //d
       public String utskrevneResepter(){
         int i=countResept;  
         if(i==0){
             return "ingen resepter";
         }
         for (i=countResept; i>0; i--){
             System.out.printl(R[i].toString);
             i--;
         }
         return "end of list";
       }

} 
   
   
    
}
