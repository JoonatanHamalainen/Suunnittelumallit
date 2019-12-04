package command;

public class RiseButtonPushCommand implements Command {
	private SilverScreen screen;

	public RiseButtonPushCommand(SilverScreen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.moveUp();
	}
}
