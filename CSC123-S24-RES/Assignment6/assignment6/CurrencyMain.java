package assignment6;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CurrencyMain {

	public static final String[] menuOptions = { "Sell Currency%n", "Exit%n" };

	public static final String MSG_PROMPT = "%nEnter choice: ";

	// Declare streams to accept user input / provide output
	InputStream in;
	OutputStream out;

	// Constructor
	public CurrencyMain(InputStream in, OutputStream out) {
		this.in = in;
		this.out = out;
	}

	public static void main(String[] args) {

		new CurrencyMain(System.in, System.out).run();
	}

	Currencies currencyBank = new Currencies();

	public void run() {
		UIManager ui = new UIManager(this.in, this.out, menuOptions, MSG_PROMPT);
		Currencies currencyBank = new Currencies();

		try {
			while (true) {

				int option = ui.getMainOption();

				if (option == 2)
					System.exit(0);

				String currency = ui.readToken("Enter the currency you are selling:");
				double amount = ui.readDouble("Enter the amount of currency you are selling:");

				if (!currencyBank.existsCurrency(currency)) {
					ui.print("Currency %s does not exist%n%n", currency);
					continue;
				}
				
				ui.print(currency, menuOptions);

				ui.print("You will get USD %s %n%n", currencyBank.getCurrency(currency).convertToUSD(amount));
			}
		} catch (Exception ignore) {
		}

	}

}
