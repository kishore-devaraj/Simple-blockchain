package com.core;

public class Main {
	private static int previousHash;
	
	public static void main(String[] args) {
		BlockChain blockchain = new BlockChain();
		String[] SecondTransactions = new String[]{"First transaction: Kishore sent 100 dimecoins to Alice","Alice sent 150 dimecoins to Bob"};
		String[] ThirdTransactions = new String[]{"Second transaction: Bob sent 100 dimecoin to kishore","Alice sent 50 dimecoins to Eve"};
		
		blockchain.addBlock(SecondTransactions);
		blockchain.addBlock(ThirdTransactions);
		
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("List of Hashes in blockchain: ");
		for (long i: blockchain.getBlockChainInstance().getBlockChain()){
			System.out.println(i);
		}
		
	}

}
