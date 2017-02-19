public static class Person{

	public int age; 
	public String name; 

	public Person(int a, String n){

		this.age = a;
		this.name = n;

	};

	public String getInfo(){
		System.out.println("Age is" + age + " " + "name is" + name);
	}

	public static void main(String[] args){
		
	}


}

public static class Studen extends Person{

	public char examScore;

	public Student(int age, String name, char examScore){
		age=this.age;
		name=this.name; 
		examScore=this.examScore;
	}

	Studen S = new Student(12, "Dadaa", 'A');

	super.getInfo()
	{
		System.out.println("This student has an exam score of "+ S.examScore);
	}

}

public static class Lecturer extends Person{
	public long salary;

	public Lecturer(int age, String name, long salary){
		age=this.age;
		name=this.name;
		salare=this.salary;
	}

	Lecturer L = new Lecturer(22, "Dude", "123000")

	super.getIngo(){
		System.out.println("This lecturer has a salary of " + L.salary);
	}
}





