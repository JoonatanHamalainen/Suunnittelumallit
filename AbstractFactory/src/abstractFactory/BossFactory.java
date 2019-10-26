package abstractFactory;

public class BossFactory implements AbstractFactory {

	@Override
	public Jeans makeJeans() {
		return new Jeans();
	}

	@Override
	public TShirt makeTShirt() {
		return new TShirt();
	}

	@Override
	public Cap makeCap() {
		// TODO Auto-generated method stub
		return new Cap();
	}

	@Override
	public Shoes makeShoes() {
		// TODO Auto-generated method stub
		return new Shoes();
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Bossin ";
	}

}
