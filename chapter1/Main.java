package chapter1;

public class Main {
	private String name;
	Main(){
		System.out.println("constructor called:");
		name="programiz";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Main obj=new Main();
     System.out.println("This name is"+obj.name);
 
	}

}
