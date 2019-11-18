package chainOfResponsibility;

public class CEO extends Handler{
	
private final double RAISE = 0.1;
	
	private Handler successor;

	public CEO(Handler successor) {
		super(successor);
		
	}

	@Override
	public void handle(double currentSalary, int salaryRequest) {
		if ((salaryRequest/currentSalary) < RAISE) {
			System.out.println("Your CEO accepted your raise request. It is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
		else {
			System.out.println("You were fired for askin too much money!");
		}
	}
}
