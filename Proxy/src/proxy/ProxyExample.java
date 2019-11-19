package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyExample {
	
	   public static void main(final String[] arguments) {
		   
		   Scanner s = new Scanner(System.in);

		   int index = 0;
		   int choice;
		   
		   List<Image> album = new ArrayList<>();
		   
	        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
	        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
	        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
	        Image image5 = new ProxyImage("HiRes_10MB_Photo5");
	        
	        album.add(image1);
	        album.add(image2);
	        album.add(image3);
	        album.add(image4);
	        album.add(image5);
	        
	        while (true) {
	        	if (index < 0)
	        		index++;
	        	else if (index >= album.size())
	        		index--;
	        	System.out.println("Current Photo: " + album.get(index).showData());
	        	System.out.println(
	        			"\n1.Display photo\n"
	        			+ "2.Next\n"
	        			+ "3.Previous");
	        	choice = s.nextInt();
	        	
	        	switch(choice) {
	        	case 1:
	        		album.get(index).displayImage();
	        		break;
	        	case 2:
	        		index++;
	        		break;
	        	case 3:
	        		index--;
	        		break;
	        	default:
	        		System.out.println("Not a valid choice!");
	        	}
	        }
	    }
	}
