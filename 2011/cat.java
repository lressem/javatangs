public class Cat extends Animal{

	private final static int WEIGHT=4;
	private final static int LIFESPAN=15;

	public Cat(String nickName){
		super(nickName, true, WEIGHT, LIFESPAN);
	}

	@Override
	public String toString(){
		String isaPet;
		if (isPet())
		{isaPet="a pet";}
		if (!isPet())
		{isaPet="not a pet";}

		return nickName + "is a cat and" + isPet + ",expected weight: " + 
		this.WEIGHT + "kg, expected lifespan: " + this.LIFESPAN + "years.";
	}

	public void produceSound(){
		System.out.println("Meow");
	}


}