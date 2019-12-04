package command;

public class TestSilverScreen {
	
	public static void main(String[] args) {
		SilverScreen screen = new SilverScreen();
		Command moveUp = new RiseButtonPushCommand(screen);
		Command moveDown = new DecendButtonPushCommand(screen);
		WallButton button1 = new WallButton(moveUp);
		WallButton button2 = new WallButton(moveDown);
		button1.push();
		button2.push();
	}
}
