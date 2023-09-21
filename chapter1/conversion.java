package chapter1;

public class conversion {

	public conversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Distance in Kilometers: ");
        float km = sc.nextFloat();
        
        //Kilometers to miles conversion
        float miles = (float)(0.6213711922 * km);
        
        System.out.println("Distance in miles will be: "+miles);
	}

}
