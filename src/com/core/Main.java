package com.core;

public class Main {
	private static int previousHash;
	
	public static void main(String[] args) {
		String[] genericTransactions = new String[]{"First transaction: Kishore sent 100 dimecoins to Alice","Alice sent 150 dimecoins to Bob"};
		Block genericBlock = new Block(0 , genericTransactions);
		System.out.println("Current hash for Generic Block " + genericBlock.getCurrentHash());
		previousHash = genericBlock.getCurrentHash();
		
		String[] SecondTransactions = new String[]{"Second transaction: Bob sent 100 dimecoin to kishore","Alice sent 50 dimecoins to Eve"};
		Block SecondBlock = new Block(previousHash , SecondTransactions);
		System.out.println("Current Hash for First Block " + SecondBlock.getCurrentHash());
		previousHash = SecondBlock.getCurrentHash();
		

	}

}
