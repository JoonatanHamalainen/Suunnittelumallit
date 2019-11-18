package chainOfResponsibility;

public class Boss extends Handler{
	
	private final double RAISE = 0.02;
	
	private Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	@Override
	public void handle(double currentSalary, double salaryRequest) {
		if ((salaryRequest-currentSalary)/currentSalary <= RAISE) {
			System.out.println("Your Boss accepted your raise request. Your salary is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
		
	}
	
}
