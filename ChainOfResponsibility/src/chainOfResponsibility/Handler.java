package chainOfResponsibility;

public abstract class Handler {

	protected Handler successor;
	
	public Handler(Handler successor) {
		this.successor = successor;
	}
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	abstract public void handle(double currentSalary, int salaryRequest);

	}
