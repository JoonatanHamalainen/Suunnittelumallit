package strategy;

import java.util.List;
import java.util.ListIterator;

public class PrintEveryOtherConverter implements ListConverter {
	
	private boolean print = false;

	@Override
	public String listToString(List list) {
		ListIterator<String> iterator = list.listIterator();
		String string = "";
		while (iterator.hasNext()) {
			string = string + iterator.next();
			if (print) {
				string = string + "\n";
				print = false;
			}
			else {
				print = true;
			}
		}
		return string;
	}

}
