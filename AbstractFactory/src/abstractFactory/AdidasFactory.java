package abstractFactory;

public class AdidasFactory implements AbstractFactory {

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
		return new Cap();
	}

	@Override
	public Shoes makeShoes() {
		return new Shoes();
	}

	@Override
	public String getBrand() {
		return "Adidaksen ";
	}

}
