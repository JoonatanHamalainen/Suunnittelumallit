package abstractFactory;

public class Jasper {
	
	private Jeans jeans;
	private TShirt tShirt;
	private Cap cap;
	private Shoes shoes;
	private String brand;
	
	public static void main(String[] args) {
		Jasper jasper = new Jasper();
		
		jasper.wearClothes(new AdidasFactory());
		jasper.describeClothes();
		
		jasper.wearClothes(new BossFactory());
		jasper.describeClothes();	
	}
	
	private void wearClothes(AbstractFactory factory) {
		jeans = factory.makeJeans();
		tShirt = factory.makeTShirt();
		cap = factory.makeCap();
		shoes = factory.makeShoes();
		brand = factory.getBrand();
	}
	
	private void describeClothes() {
		System.out.println("Minulla on päälläni " + brand + jeans + ", " + brand + tShirt + ", " + brand + cap + " ja " + brand + shoes);
	}
}
