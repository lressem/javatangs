public abstract class Animal implements SoundProducer{

	private String nickName;
	private boolean pet;

	protected int weight;
	protected int lifeSpan;

	public Animal(String nickName, boolean pet, int expectedWeight, short expectedLifeSpan){

		this.nickName=nickName;
		this.pet=pet;
		this.weight=expectedWeight;
		this.lifeSpan=expectedLifeSpan;
	}

	public String toString(){
		String isaPet;
		if (isPet())
		{isaPet="a pet";}
		if (!isPet())
		{isaPet="not a pet";}

		return nickName + "is" + isPet + ",expected weight: " + this.weight + ", expected lifespan: " + this.lifeSpan + ".";

	}

	public String getNickname(){
		return this.nickName;
	}

	public int getExpectedWeight(){
		return this.weight;
	}

	public short getExpectedLifeSpan(){
		return this.lifeSpan;
	}

	public boolean isPet(){
		return this.pet;
	}

	public void produceSound(){
		System.out.println("a sound");
	}

	public static void main(){
		Poodle p = new Poodle("Hans");
		p.produceSound();
		Bulldog bull = new Bulldog("Jan");
		bull.produceSound();
		Cat cat = new Cat("Petter");
		cat.produceSound();
		Cow cow = new Cow("Tor");
		cow.produceSound();
		System.out.println(p + "\n" + bull + "\n" + cat + "\n" + cow);
	}

}