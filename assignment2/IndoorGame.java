package assignment2;

public class IndoorGame {
 String gamename;
 String playername;
 IndoorGame(String g,String p){
	 gamename=g;
	 playername=p;
 } 
 public void display()
 {
	 System.out.println("Game Name="+gamename+" "+"player name="+playername);
	 System.out.println();
 }
	public static void main(String[] args) {
		IndoorGame i=new IndoorGame("chess","Ramesh");
		IndoorGame i1=new IndoorGame("carrom","rashmi kumari");
		IndoorGame i2=new IndoorGame("Table Tennis","Manika Batra");
		IndoorGame i3=new IndoorGame("Snooker","Pankaj Advani");
		System.out.println("Indoor Games:");
		i.display();
		i1.display();
		i2.display();
		i3.display();
	

	}

}
