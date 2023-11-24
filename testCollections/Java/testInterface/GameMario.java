package testInterface;

public class GameMario implements GameInterface {

	@Override
	public void up() {
		System.out.println("up key");
		
	}

	@Override
	public void down() {
		System.out.println("down key");
		
	}

	@Override
	public void left() {
		System.out.println("left key");
		
	}

	@Override
	public void right() {
		System.out.println("Right key");
		
	}

}
