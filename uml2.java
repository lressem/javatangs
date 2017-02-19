public class Person{

	protected int age; 
	public String name; 
	private double height;

	public Person(int a, String n){

		this.age = a;
		this.name = n;

	};

	public String getInfo(){
		return "Age is" + age + " " + "name is" + name;
	}

	public static void main(String[] args){
		

	}


}

public static class Student extends Person{

	private char examScore;

	public Student(int age, String name, char examScore){
		super(age, name);	
		this.examScore=examScore;
	}

	public void setAge(int a){
		this.age=a;
	}
	

}

public class Lecturer extends Person{
	private long salary;

	public Lecturer(int age, String name, long salary){
		super(age,name);
		this.salary=salary;
	}

	public int getAge(){
		return this.age;
	}
}





