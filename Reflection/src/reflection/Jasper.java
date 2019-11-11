package reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Jasper {
	
	private Jeans jeans;
	private TShirt tShirt;
	private Cap cap;
	private Shoes shoes;
	private String brand;
	
	public static void main(String[] args) {
		Jasper jasper = new Jasper();
		
		Class c = null;
		AbstractFactory factory = null;
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("adidasFactory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("factory"));
			factory = (AbstractFactory)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		jasper.wearClothes(factory);
		jasper.describeClothes();
		
		try {
			properties.load(new FileInputStream("bossFactory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("factory"));
			factory = (AbstractFactory)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		jasper.wearClothes(factory);
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
		System.out.println("Minulla on p‰‰ll‰ni " + brand + jeans + ", " + brand + tShirt + ", " + brand + cap + " ja " + brand + shoes);
	}
}
