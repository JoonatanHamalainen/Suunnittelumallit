package strategy;

import java.util.List;

public class PrintEveryConverter implements ListConverter {

	@Override
	public String listToString(List list) {
		String string = "";
		String [] array = new String [list.size()];
		
		for(int i=0; i<list.size(); i++) {
			array[i] = (String) list.get(i);
		}
		for (String s : array) {
			string = string + s + "\n";
		}
		return string;
	}

}
