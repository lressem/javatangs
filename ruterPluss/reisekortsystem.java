public class ReisekortSystem{
	public static final int ANTALL = 100;
	public static final int UTVIDELSE = 10;
	private Reisekort[] = reisekortene;

	//konstruktøren med dannelse av array med lengde lik antall
	public ReisekortSystem(Reisekort[ANTALL-1] reisekortene)
	{
		this.reisekortene = reisekortene;
	}

	//finnReisekort() metoden oppgave 2.a
	public Reisekort finnReisekort(int nr){

		Reisekort matchedKort;

		for(int i = 0; i<reisekortene.length; i++)
		{
			if (reisekortene[i].getKortNr() == nr)
			{
				matchedKort = reisekortene[i];
			}
		}

		return matchedKort;
	}

	//utvidArray() metoden oppgave 2.b
	public void utvidArray(Reisekort[] reisekortene){

			//lager midlertidig array for lagring av data for å kopiere den til den originale 
			Reisekort[] utviddetArray = new Reisekort[ANTALL+UTVIDELSE-2];

			for (int i = 0; i<reisekortene.length; i++)
			{
				utviddetArray[i] = reisekortene[i];
			}

			//kopierer det nye arrayet med utviddet lengde til reisekortene
			this.reisekortene = utviddetArray;
	}

	//settInnreisekort() metoden oppgave 2.c
	public void settInnReisekort(Reisekort k){
		
		//itererer gjennom alle reisekortene
		for(int i = 0; i < reisekortene.length; i++)
		{	
			//tester om arrayet er fullt
			if(reisekortene[reisekortene.length-1]!=0)
			{
				utviddetArray(reisekortene);
			}

			//setter inn på første ledig plass hvis ingen id krasj 
			if(reisekortene[i]==null && reisekortene[i].getKortNr()!=k.getKortNr())
			{
				reisekortene[i]=k;
			}

		}
	}

	//ladOppKlipperkort() metoden oppgave 2.d
	public Klippkort ladOppKlippekort(int nr, int beløp){
		Klippkort matchedKlippekort;

		for (int i = 0; i<reisekortene.length; i++)
		{	
			//øker saldoen med beløpet
			if(reisekortene[i].getKortNr()==nr)
			{
				reisekortene[i].saldo=reisekortene[i].ladOpp(beløp);
				matchedKlippekort=reisekortene[i];
			}

			else{
				matchedKlippekort=null;
			}
		}
		return matchedKlippekort;
	} 

	//inntjeningsinfo() metoden oppgave 2.e
	public static String inntjeningsInfo(){
		
		int solgteKlippekort;
		int summsolgteKlippekort;
		int solgteMåndeskort;
		int summsolgteMånedskort;
		int solgteDagskort;
		int summsolgteDagskort;
		int totallIntjenning;

		for(int i = 0; i < reisekortene.length; i++)
		{
			if(reisekortene[i].getPris()==28)
			{
				solgteKlippekort=reisekortene[i].getAntallSolgte();
				summsolgteKlippekort=reisekortene[i].getSumalleklippekort();
			}

			if(reisekortene[i].getPris()==1040)
			{
				solgteMåndeskort=reisekortene[i].getAntallSolgte();
				summsolgteMånedskort=reisekortene[i].getSumAlleMåndeskort();
			}

			if(reisekortene[i].getPris()==75)
			{
				solgteDagskort=reisekortene[i].getAntallSolgte();
				summsolgteDagskort=reisekortene[i].getSumAlleDagskort();
			}

		}

		totallIntjenning=summsolgteDagskort+summsolgteKlippekort+summsolgteMånedskort;

		return "Det ble solgt: " + solgteDagskort + " dagskort." + "Dagskort inntjenning er: " + summsolgteDagskort + "\n" +
				"Det ble solgt: " + solgteKlippekort + " klippekort." + "Klippekort inntjenning er" + summsolgteKlippekort + "\n" +
				"Det ble solgt: " + solgteMåndeskort + "månedskort." + "Månedskort inntjenning er" + summsolgteMånedskort + "\n" +
				"Totall inntjenningen er på: " + totallIntjenning + "kroner";

	}




}