package example_04_constr;

public class Student {

	// Fields
	int age = 18;
	String name = "Vasaj";

	// Construktor
	public Student(){
		System.out.println("Student");		
	}	
	
	public Student(String name1){
		this.name = name1;
		System.out.println(name);		
	}		

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// Method
	public void print() {
		System.out.println("age-> " + age + " name-> " + name);
	}

}
