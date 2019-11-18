package chainOfResponsibility;

public class Boss extends Handler{
	
	private final double RAISE = 0.02;
	
	private Handler successor;

	public Boss(Handler successor) {
		super(successor);
		
	}

	@Override
	public void handle(double currentSalary, int salaryRequest) {
		if ((salaryRequest/currentSalary) <= RAISE) {
			System.out.println("Your Boss accepted your raise request. It is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
		
	}
	
}
