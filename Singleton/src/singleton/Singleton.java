package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Singleton {
	private static Singleton loki = null;
    private final String lokitiedosto = "tilitapahtumaloki.txt";
    private PrintWriter writer;
    private Singleton() {
        try {
            FileWriter kirjoittaja = new FileWriter(lokitiedosto);
            writer = new PrintWriter(kirjoittaja, true);
        } catch (IOException e) {}
    }
    public void logWithdraw (String tili, double määrä) {
        writer.println("NOSTO (" 
            + tili + "): " + määrä + "€");
    }
    public void logDeposit (String tili, double määrä) {
        writer.println("TALLETUS (" 
            + tili + "): " + määrä + "€");
    }
    public void logTransfer (String tililtä, String tilille, double määrä) {
        writer.println("SIIRTO (" 
           + tililtä + " -> " + tilille + "): " + määrä + "€");
    }
    public static synchronized Singleton getInstance(){
        if(loki == null)
            loki = new Singleton();
        return loki;
    }
}
