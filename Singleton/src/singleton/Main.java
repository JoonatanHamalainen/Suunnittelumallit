package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton logger1 = Singleton.getInstance();
		Singleton logger2 = Singleton.getInstance();
		Singleton logger3 = Singleton.getInstance();
		logger1.logDeposit("Nordean säästötili", 80.5);
		logger2.logWithdraw("Nordean käyttötili", 100);
		logger1.logTransfer("Nordean säästötili", "Danske Bankin käyttötili", 40);
		logger3.logDeposit("Danske Bankin säästötili", 56.74);
		logger2.logWithdraw("Aktian käyttötili", 30);

	}

}
