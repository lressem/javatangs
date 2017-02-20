public class ParkeringsHus {

	private Parkering [] plasser = new Parkering[MAX];
	public static final int MAX = 200;
	private double inntjenning;

	//a parker
	public Parkering parker(String bilnr, int type){

		for(int i=0; i<plasser.length; i++){
			if(plasser[i] == null) {
				Parkering toPark;
				if(type==1){
					toPark = new KorttidsParkering(bilnr, Calendar.getInstance(), i+1);
				}
				if(type==2){
					toPark = new LangtidsParkering(bilnr, Calendar.getInstance(), i+1);
				}
				
				plasser[i] = toPark;
				return toPark;
			}
				
		}
		return null;
	}

	/**
	*plassnr metoden
	*/
	public int plassnr (String bilnr){
		int plassnumber;
		for (int i = 0; i<plasser.length(); i+++)
		{
			if(plasser[i].getBilnr().equals(bilnr))
			{
				plassnumber = plasser[i].getPlass();
			}
			else
			{
				plassnumber = 0;
			}
		}
		return plassnumber;
	}


	public String bilInfo(String bilnr){
		String info = "";

		for(int i = 0; i<=plasser.lenght(); i++)
		{
			if(plasser[i].getBilnr.equals(bilnr))
			{
				info = plasser[i].toString();
			}
			else{
				info = null;
			}
		}
		return info;
	}

	//avgift
	public double avgift (String bilnr, Calendar d)
	{
		double toPay;
		int antallTimerParkert;
		int antalDagerParkert;
		for(int i = 0; i<=plasser.lenght(); i++)
		{
			if(plasser[i].getBilnr == bilnr && plasser[i].type == 1)
			{	
				antallTimerParkert = (Math.abs(plasser[i].getStarttid() - d.getTime()))/3600000;
				toPay=antallTimerParkert * 10;
			}
			if(plasser[i].getBilnr == bilnr && plasser[i].type == 2)
			{
				antalDagerParkert = plasser[i].antallDager(d);
				toPay = antalDagerParkert * 100;
			}

			else{
				 toPay=0.0;
			}

		}
		return toPay;
	}

	//hentBil
	public String hentBil(String bilnr, Calendar d){
		String betaltAlt = "";
		String kvit = "";
		String fantIkke = "";


		for(int i =0; i <plasser.length(); i++)
		{
			if(plasser[i].getBilnr()==bilnr && plasser[i].type == 1 && plasser[i].antalTimer()!=0)
			{			
				plasser[i]=null;
				kvit = plasser[i].kvittering(d);
				inntjenning+=inntjenning-plasser[i].avgift(d);
				{
					betaltAlt = "betalt";
				}
				else{
					betaltAlt = "ikke betalt";
				}				
			}
			if(plasser[i].getBilnr()==bilnr && plasser[i].type == 2 && plasser[i].antalDager()!==0)
			{
				plasser[i]=null;
				kvit = plasser[i].kvittering(d);

				if(inntjenning==inntjenning-plasser[i].avgift(d))
				{
					betaltAlt = betalt;
				}
				else{
					betaltAlt = ikke betalt;
				}
			}

			if(plasser[i].getBilnr()!==bilnr)
			{
				kvit = "fant ikke bilen i garasjen";
			}

		}
		return kvit;
	}

	//Parkering[] bortTauing 
	public Parkering[] bortTauing(Calendar d){

		Parkering[] tobeTowed = new Parkering[200];

		for (int i = 0; i <= plasser.length(); i++){
			if(plasser[i].type==1)
			{
				if(plasser[i].antalTimer>plasser[i].MAX)
				{
					tobeTowed[i]=plasser[i];
				}

			}
			if(plasser[i].type ==2)
				{
					if()
				}
		}
	}




}