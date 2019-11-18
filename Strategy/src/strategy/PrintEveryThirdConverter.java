package strategy;

import java.util.List;

public class PrintEveryThirdConverter implements ListConverter {

	@Override
	public String listToString(List list) {
		String string = "";
		for (int i=0; i<list.size(); i++) {
			string = string + list.get(i);
			if ((i+1) % 3 == 0) {
				string = string + "\n";
			}
		}
		return string;
	}

}
