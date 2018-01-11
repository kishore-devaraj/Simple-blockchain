package com.core;

import java.util.Arrays;

public class Block {
	/*
	 * Block should contain
	 * 1. Previous Hash
	 * 2. Current Hash
	 * 3. List of Current Transaction
	 * 
	 */
	
	int previousHash;
	int currentHash;
	
	public int getPreviousHash() {
		return previousHash;
	}
	
	public int getCurrentHash(){
		return currentHash;
	}
	
	// For simplicity we can use a list of string has transactions
	String[] transactions;
	
	public Block(int previousHash, String [] transactions){
		this.previousHash = previousHash;
		this.transactions = transactions;
		Object[] content = {Arrays.hashCode(transactions),previousHash};
		this.currentHash = Arrays.hashCode(content);	
	}
}
