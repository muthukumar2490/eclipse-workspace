package testInterface;

public class GameChess implements GameInterface {

	@Override
	public void up() {
		System.out.println("up key in chess");
		
	}

	@Override
	public void down() {
		System.out.println("down key in chess");
		
	}

	@Override
	public void left() {
		System.out.println("left key in chess");
		
	}

	@Override
	public void right() {
		System.out.println("Right key in chess");
		
	}

}
