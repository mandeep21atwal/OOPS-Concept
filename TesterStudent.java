
class Student {
	
    public void display() {
		System.out.println("Student");
	}
}
  
class UndergraduateStudent extends Student{
	//This method overrides display() of parent Student
    @Override
    public void display() {
		System.out.println("This Student is Undergraduate");
	}
}
class GraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
    public void display() {
	System.out.println("This Student is Graduate");
	}
}
public class TesterStudent{
	public static void main(String[] args) {
		
		Student student = new Student();
		student.display();
		
		Student obj1 = new GraduateStudent();
		obj1.display();
		
		Student obj2 = new UndergraduateStudent();
		obj2.display();
	}
}
