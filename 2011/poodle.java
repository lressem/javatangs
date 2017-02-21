public class Poodle extends Dog{
	private final static int WEIGHT=7;
	private final static int LIFESPAN=15;

	public Poodle(String nickName){
		super(nickName, true, WEIGHT, LIFESPAN);

	}

	@Override
	public String toString(){
		String isaPet;
		if (isPet())
		{isaPet="a pet";}
		if (!isPet())
		{isaPet="not a pet";}

		return nickName + "is a dog and" + isPet + ",expected weight: " + 
		this.WEIGHT + "kg, expected lifespan: " + this.LIFESPAN + "years.";
	}

	public void produceSound(){
		System.out.println("Bark");
	}
}