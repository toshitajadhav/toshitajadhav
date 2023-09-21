package assignment1;

public class Product {
	int pro_Id;  
	String pro_name; 
	float pro_price;
	//Product class constructor  
	Product(int pid, String n,float pr)  
	{  
	pro_Id = pid;  
	pro_name = n;  
	pro_price=pr;
	}  
	public void display()  
	{  
	System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);  
	System.out.println();  

	}


public static void main(String[] args) {
	
	Product[] obj = new Product[5] ;  
	
	//create & initialize actual product objects using constructor  
	obj[0] = new Product(23907,"Dell Laptop",25000);  
	obj[1] = new Product(91240,"HP 630",89000);  
	obj[2] = new Product(29823,"LG OLED TV",50000);  
	obj[3] = new Product(11908,"apple",100000);  
	obj[4] = new Product(43590,"Kingston USB",20000);  
	//display the product object data  
	System.out.println("Product Object 1:");  
	obj[0].display();  
	System.out.println("Product Object 2:");  
	obj[1].display();  
	System.out.println("Product Object 3:");  
	obj[2].display();  
	System.out.println("Product Object 4:");  
	obj[3].display();  
	System.out.println("Product Object 5:");  
	obj[4].display();  
	}  
 
	
	//Product class with product Id and product name as attributes  
	 
	
	

}
