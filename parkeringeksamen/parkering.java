public abstract class Parkering{

	private String bilnr;

	private Calendar starttid;

	private int plass;

	private static final korttid = 1;
	private static final langtid = 2;

	//constructor for Parkering
	public Parkering(String bilnr, Calendar starttid, int plass){
		this.bilnr=bilnr;
		this.starttid=starttid;
		this.plass=plass;
	}

	public String getBilnr(){
		return bilnr;
	}

	public Calendar getStarttid(){
		return starttid;
	}

	public int getPlass(){
		return plass;
	}

	public String toString(){
		//start tid for parkering
		DateFormat df = DateFormat.getInstance();
		String startTidsPunkt = df.format(starttid.getTime());

		//bilnr

		String bilNumber = bilnr;

		//plass nr

		String plassering = Integer.toString(plass);

		return startTidsPunkt + "\n" + bilNumber + "\n" + plassering + "\n";

	}

	public abstract String kvittering(Calendar d);

	public abstract double getPris();

	public abstract double avgift(Calendar d);

}