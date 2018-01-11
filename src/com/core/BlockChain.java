package com.core;

import java.util.LinkedList;
import java.util.List;

public class BlockChain {
	
	/*
	 * To create a list of Block chain
	 * 1. A List to store the blockchain
	 * 2. Current and previous block state
	 * 3. An initial Block
	 */
	
	
	String[] genericTransactions;
	long previousHash;
	Block block;
	List<Long> blockchain = new LinkedList<Long>();
	
	
	/*  Instantiating a new blockchain */
	public BlockChain(){
		// Creating CRUD data for first block
		this.genericTransactions = new String[]{"This is CRUD data to kickstart blockchain there by creating its first block"};
		this.previousHash = 0;
		
		// New block is created using the data and updated to blockchain
		Block block = new Block(this.previousHash,this.genericTransactions);
		this.block = block.getBlock();
		this.addToBlockChain();
	}
	
	
	/* Method to add data to block and updating the block chain */
	public void addBlock(String[] transactions){
		this.previousHash = block.getCurrentHash();
		Block block = new Block(this.previousHash,transactions);
		this.block = block.getBlock();
		this.addToBlockChain();
	}
	
	
	 /* Updating the block chain */
	public void addToBlockChain(){
		blockchain.add(this.getCurrentHash());
		System.out.println("BlockChain updated");
	}
	
	
	/* Get the current Hash */
	public long getCurrentHash(){
		return this.block.getCurrentHash();
	}
	
	
	/* Get the current blockchain instance */
	public BlockChain getBlockChainInstance(){
		return this;
	}
	
	
	/* Get itertable blockchian */
	public List<Long> getBlockChain(){
		return this.blockchain;
	}
	
	
}
