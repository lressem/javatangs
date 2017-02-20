
/**
 *
 * @author Lev
 */
public class Pasient extends Person {
    
 	private Resept[] resepter;
 	private int antall = 0;
 	static final int max = 100;

 	public Pasient(String name, String date){

 		super(name, date);

 	}

 	public String getdate(){

 		return date;
 	}

 	public boolean nyResept( Resept ny){
 		/**
 		*skal ikke implementeres
 		*/
 	}

 	//a

 	public Resept finnResept ( int n){

 		Resept foundRecept = new Resept();

 		for(int i=0; i<=antall; i++){
 			if(resepter[i].getNr == n){
 				foundRecept=resepter[i];
 			}
 			else{
 				foundRecept=null;
 			}
 		}
 		return foundRecept;
 	}

 	//b

 	public String toString(){

 		String currentPasientInfo = "";
 		String vedkomendesResepterArray[] = new String[antall];
 		String vedkomendesResepter = "";
 		int hvormangeIkkeHentet = 0;

 		currentPasientInfo = "Pasientens navn:" + name + "Pasientens f.nummer" + date + "\n";
 		
 		//henter recepter info og utlevert info
 		for (int i = 0; i<=antall; i++){
 			vedkomendesResepterArray[i] = resepter[i].toString();
 			vedkomendesResepter = vedkomendesResepter + vedkomendesResepterArray[i]; 			
 		}

 		//hvor mange ikke hentet
 		for (int i= 0; i<=antall; i++){

 			/**
 			*jeg antar at det finnes en boolean variabel i public void registrertUtlevert() som 
 			*settes til true hvis resepten er utlevert. 
 			*Jeg velger å kalle den for erUtlevert.
 			*/
 			if(!resepter[i].getUtlevert()){
 				hvormangeIkkeHentet++;
 			}
 		}

 		return currentPasientInfo + "\n" + vedkomendesResepter + "\n" + "Pasienten har ikke hentet" + hvormangeIkkeHentet + " recepter";





 	}
    
}
