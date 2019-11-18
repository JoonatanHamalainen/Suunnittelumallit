package chainOfResponsibility;

public class Chief extends Handler{
	
private final double RAISE = 0.05;
	
	private Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	@Override
	public void handle(double currentSalary, double salaryRequest) {
		if ((salaryRequest-currentSalary)/currentSalary <= RAISE) {
			System.out.println("Your Chief accepted your raise request. Your salary is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
	}
}
