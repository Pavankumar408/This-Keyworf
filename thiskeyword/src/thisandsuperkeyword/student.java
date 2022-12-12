package thisandsuperkeyword;

public class student {
	String name;
	int age;
	float percentage;
	int regno;
	
	public student() {
		
	}
	public student(String name, int age, float percentage,int regno) {
		//super();
		this.name = name;
      this. age = age;
		this.regno = regno;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", percentage=" + percentage + ", regno=" + regno + "]";
	}
	
	
	

}
