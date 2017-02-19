public class Person {
    
    private String navn;
    private String fodselsdato;
    
    /**
     * Person constructor
     */
    public Person(String n, String f){
        this.navn=n;
        this.fodselsdato=f;
    }
    
    public String getName(){
        return navn;
    }
    
    public String getBirthdate(){
        return fodselsdato;
    }
    
    public String toString(){
        return "Personets navn er " + navn + " " + "Personets fodselsnummer er "
                + fodselsdato;
    }   
}
