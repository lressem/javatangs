import java.util.Calendar;
import java.text.DateFormat;

public abstract class Reisekort
{
	private Calendar utløpstidspunkt;

	private int kortNr;
	private int pris;

	Random rand = new Random();
	kortNr = rand.nextInt(1000);

	public Reisekort(int pris, int kortNr){
		this.kortNr=kortNr;
		this.pris=pris;
	}

	public void setUtløpstidspunkt(Calendar d){
		this.utløpstidspunkt=d;
	}

	public int getKortNr(){
		return kortNr;
	}

	public int getPris(){
		return pris;
	}

	public Calendar getUtløpstidspunkt(){
		return utløpstidspunkt;
	}

	public String gyldigTil(){
		if (utløpstidspunkt == null)
			return null;
		DateFormat tf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);

		return tf.format(utløpstidspunkt.getTime());

	}

	public boolean gyldig(){
		Calendar nå = Calendar.getInstance();
		return nå.before(utløpstidspunkt);
	}

	

}