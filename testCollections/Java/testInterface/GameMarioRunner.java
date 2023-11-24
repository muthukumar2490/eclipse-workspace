package testInterface;

public class GameMarioRunner {

	public static void main(String[] args) {

		//create a instance of class implements the interface
		GameMario g = new GameMario();
		g.down();
		g.up();
		g.right();
		g.left();
		
		//creating an instance of Interface which references implementing class object
		GameChess gi = new GameChess();
		gi.down();
		gi.up();
		gi.right();
		gi.left();
		
		
		//just switch between Mario or Chess by simply changing the reference to GameInterface
		//GameInterface gi1 = new GameMario();
		GameInterface gi1 = new GameChess();
		gi1.down();
		gi1.up();
		gi1.right();
		gi1.left();
		
	}

}
