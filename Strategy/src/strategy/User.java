package strategy;

import java.util.List;

public class User {
	
	private ListConverter converter;
	
	public User(ListConverter strategy) {
		this.converter = strategy;
	}
	
	public String listToString(List list) {
		return converter.listToString(list);
	}
}
