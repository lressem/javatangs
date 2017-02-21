import java.util.Calendar;
import java.text.DateFormat;

public class Klippekort extends Reisekort{
	
	public static final int PRIS_PER_REISE = 28;
	private int saldo;

	private static int antallSolgte = 0;
	private static int sumAlleKlipperkort = 0;

	public Klippekort(int pris, int kortNr, int lagtInnPåKortet){
		super(pris, kortNr);

		this.saldo=lagtInnPåKortet;		
		//oppdaterer totale summen som er satt inn på alle klippekort til sammen
		this.sumAlleKlipperkort=this.sumAlleKlipperkort+lagtInnPåKortet;

		//oppdaterer antall solgte klippekort
		this.antallSolgte=this.antallSolgte+1;

	}

	public int getSaldo(){
		return saldo;
	}

	public int getSumalleklippekort(){
		return sumAlleKlipperkort;
	}

	public int getAntallSolgte(){
		return antallSolgte;
	}

	//Gyldig() metoden oppgave C
	public boolean gyldig(){

		Calendar dato = Calendar.getInstance();

		Calendar utløpsTid = dato.add( Calendar.HOUR_OF_DAY, 1);

		return dato.before(utløpsTid);
	}

	//ladOpp() metoden oppgave C
	public void ladOpp (int beløp){
		this.saldo = this.saldo + beløp;
		this.sumAlleKlipperkort = this.sumAlleKlipperkort + beløp;
	}

}