package edu.iit.securitylabtools.des.table;

import java.util.Arrays;

/**
 * 
 * @author Mohayeminul Islam
 */
public abstract class Table {
	private int[] table;
	
	public Table(int[] table) {
		this.table = Arrays.copyOf(table, table.length);
	}
	
	public int get(int index){
		return table[index];
	}
}
