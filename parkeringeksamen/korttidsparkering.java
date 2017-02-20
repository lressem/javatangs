public class KorttidsParkering extends Parkering{
	private static double timepris = 10;
	private static double parkeringsbot = 500;

	public static final MAXTID = 24;

	public KorttidsParkering(String carNm, Calendar startTime, int place){
		super(carNm, startTime, place);

		}

	public int getTimepris(){
		return timepris;
	}


	//antall timer beregning
	public int antallTimer(Calendar sluttTid){

		long avstand  = Math.abs(startTime.getTime() - sluttTid.getTime());
		int antallTim = avstand / 3600000;

		return antallTim;
	}

	//parkeringsBot 
	public double parkeringsBot(Calendar d) {
 		double bot; 

		if (antallTimer(d)>MAXTID){
			bot = parkeringsbot;
		}
		else{
			bot = 0.0
		}

		return bot;
	}

	//avgift
	public double avgift(Calendar d){
		 double avgifToPay;
		 int antallTimerToPay = (Math.abs(startTime.getTime()-d.getTime()))/3600000;
		 avgifToPay=antallTimerToPay*timepris;

		 return avgifToPay;
	}

	//kvittering
	public String kvittering(Calendar sluttTid){

		String typePark = "Korttidsparkering";
		String plate = carNm;

		DateFormat df = DateFormat.getInstance();
		String bleParkert = df.format(startTime.getTime());

		DateFormat dfSlutt = DateFormat.getInstance();
		String parkeringSluttTid = dfSlutt.format(startTime.getTime()):

		String avgiftForThisCar = String.valueOf(avgift(sluttTid));

		return "Kvitteringen for " + typePark + "\n" + "Kvitteringen gjelder kjøretøyet med reg nummer: " + plate + "\n"
		+ "kjøretøyet ble parkert: " + bleParkert + "." + "kjøretøyet avsluttet parkeringen " + parkeringSluttTid + "\n"+
		"Prisen for denner parkeringen er: " + avgiftForThisCar; 


	}

}