package projectvendingmachine;

public class Runner {
	
	public static void main(String[] args) {
		
		double accountBalance = 10.00;
		Products product = new Products();
		Methods method = new Methods();
		
		System.out.println("Hello, welcome!...");
		System.out.println("Account balance: $" + accountBalance);
		product.setPrice(method.select(product));
		accountBalance = method.balance(product.getPrice(), accountBalance, product);
		method.purchase(product.getPrice(), accountBalance, product);
		
	}
}
