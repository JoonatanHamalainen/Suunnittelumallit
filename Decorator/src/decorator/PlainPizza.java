package decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "A Pizza with ";
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
