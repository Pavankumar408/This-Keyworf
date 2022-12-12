package thisandsuperkeyword;

public class details {
	public static void main(String[]args) {
		student stu=new student();
		stu.name="pavan";
		stu.age=24;
		stu.regno=236543;
		stu.percentage=65;
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.regno);
		System.out.println(stu.percentage);
		System.out.println("------------------------");
		student stu1=new student("naveen",24,65f,22223);
		System.out.println(stu1);
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.percentage);
		System.out.println(stu1.regno);
		System.out.println("-------------------------");
		student stu2=new student("karthi",25,77,283837);
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.percentage);
		System.out.println(stu2.regno);
		
		
		
		
		
		
	}

}
