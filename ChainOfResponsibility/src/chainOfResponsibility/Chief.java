package chainOfResponsibility;

public class Chief extends Handler{
	
private final double RAISE = 0.05;
	
	private Handler successor;

	public Chief(Handler successor) {
		super(successor);
		
	}

	@Override
	public void handle(double currentSalary, int salaryRequest) {
		if ((salaryRequest/currentSalary) < RAISE) {
			System.out.println("Your Chief accepted your raise request. It is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
	}
}
