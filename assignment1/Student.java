package assignment1;

public class Student {
int rollno;
String name;
float percentage;
Student(int Rn,String n,float per){
	this.rollno=Rn;
	this.name=n;
	this.percentage=per;
}
void display()
{
	System.out.print("Student rollno="+rollno+" "+"Student name="+name+" "+"Student percentage="+percentage);
	System.out.println();
}
	public static void main(String[] args) {
	Student s1=new Student(50,"kadambari",80);
	Student s2=new Student(51,"charushila",87);
	Student s3=new Student(52,"Shweta",90);
	Student s4=new Student(53,"snehal",70);
	Student s5=new Student(54,"toshita",88);
	 
	s1.display();
	s2.display();
	s3.display();
	s4.display();
	s5.display();
	}

}
