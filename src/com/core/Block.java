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
	
	long previousHash;
	long currentHash;
	String[] transactions;
	
	/*  Getter for class variables */
	
	public long getPreviousHash() {
		return previousHash;
	}
	
	public long getCurrentHash(){
		return currentHash;
	}
	public Block getBlock(){
		return this;
	}
	
	
	/* 
	 * For simplicity we can consider we are getting list of string as transactions
	 * We are finding the hash for that string and inrespective to previous hash
	 */
	public Block(long previousHash, String [] transactions){
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] content = {Arrays.hashCode(transactions),previousHash};
		this.currentHash = Arrays.hashCode(content);
		
		System.out.println("Block has been successfully created");
	}
}
