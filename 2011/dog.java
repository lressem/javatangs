public class Dog extends Animal{

	private final static int WEIGHT = 13;
	private final static int LIFESPAN = 13;

	public Dog(String nickName){
		super(nickName, true, WEIGHT, LIFESPAN);
	}

	@Override
	public String toString(){
		String isaPet;
		if (isPet())
		{isaPet="a pet";}
		if (!isPet())
		{isaPet="not a pet";}

		return nickName + "is a dog and" + isPet + ",expected weight: " + this.WEIGHT +
		 "kg, expected lifespan: " + this.LIFESPAN + "years.";
	}


	public void produceSound(){
		System.out.println("Bark");
	}
	
}