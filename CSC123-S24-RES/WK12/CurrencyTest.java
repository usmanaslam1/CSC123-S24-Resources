import java.util.Scanner;

public class CurrencyTest {

	public static void main(String[] args) {

		Currencies currencyBank = new Currencies(new CurrencyLoaderImpl());

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\n\nEnter the currency you are selling: ");
			String currency1 = scanner.nextLine();
			System.out.print("Enter the amount of currency you are selling: ");
			double amount = scanner.nextDouble();

			if (!currencyBank.existsCurrency(currency1)) {
				System.out.println("Currency does not exist");
				continue;
			}

		    System.out.print("You will get USD :"+currencyBank.getCurrency(currency1).convertToUSD(amount));
		}

	}

}
