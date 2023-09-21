package assignment2;

public class OutdoorGame {
	 String gamename;
	 String playername;
	 OutdorGame(String g,String p){
		 gamename=g;
		 playername=p;
	 } 
	 public void display()
	 {
		 System.out.println("Game Name="+gamename+" "+"player name="+playername);
		 System.out.println();
	 }
		public static void main(String[] args) {
			OutdoorGame i=new OutdoorGame("cricket","sachin tendulkar");
			OutdoorGame i1=new OutdoorGame();
			OutdoorGame i2=new OutdoorGame("Tennis","saina nehwal");
			OutdoorGame i3=new OutdoorGame();
			System.out.println("Indoor Games:");
			i.display();
			i1.display();
			i2.display();
			i3.display();
		}
}{
