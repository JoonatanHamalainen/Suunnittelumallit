package chainOfResponsibility;

public class CEO extends Handler{
	
private final double RAISE = 0.1;
	
	private Handler successor;

	@Override
	public void handle(double currentSalary, double salaryRequest) {
		if ((salaryRequest-currentSalary)/currentSalary <= RAISE) {
			System.out.println("Your CEO accepted your raise request. Your salary is now: " + salaryRequest);
		}
		else if (successor != null) {
			successor.handle(currentSalary, salaryRequest);
		}
		else {
			System.out.println("You were fired for askin too much money!");
			System.exit(1);
		}
	}
}
