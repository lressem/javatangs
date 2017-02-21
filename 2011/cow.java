public class Cow extends Animal{

	private final static int WEIGHT = 1100;
	private final static int LIFESPAN = 15;

	public Cow(String nickName){
		super(nickName, false, WEIGHT, LIFESPAN);
	}

	@Override
	public String toString(){
		String isaPet;
		if (isPet())
		{isaPet="a pet";}
		if (!isPet())
		{isaPet="not a pet";}

		return nickName + "is a cow and" + isPet + ",expected weight: " + 
		this.WEIGHT + "kg, expected lifespan: " + this.LIFESPAN + "years.";
	}


	public void produceSound(){
		System.out.println("Mooo");
	}
	
}