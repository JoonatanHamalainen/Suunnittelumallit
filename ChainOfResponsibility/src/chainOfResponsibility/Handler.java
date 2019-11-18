package chainOfResponsibility;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	abstract public void handle(double currentSalary, double salaryRequest);

	}
