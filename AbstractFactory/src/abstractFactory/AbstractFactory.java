package abstractFactory;

public interface AbstractFactory {
	public abstract Jeans makeJeans();
	public abstract TShirt makeTShirt();
	public abstract Cap makeCap();
	public abstract Shoes makeShoes();
	public abstract String getBrand();
}
