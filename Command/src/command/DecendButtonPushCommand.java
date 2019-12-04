package command;

public class DecendButtonPushCommand implements Command {
	private SilverScreen screen;

	public DecendButtonPushCommand(SilverScreen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.moveDown();
	}
}
