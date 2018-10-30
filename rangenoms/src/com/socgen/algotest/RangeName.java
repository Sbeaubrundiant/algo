package com.socgen.algotest;

import java.util.Arrays;

public class RangeName {
	
	public static void main(String[] args) {

		String[] firstnames = { "David", "Louis", "Steven", "Phillipe", "Nathalie", "Frank" };
		String[] lastnames = { "DIK", "GODLEWSKI SEGRESTAN DE GOSDAWA", "BEAUBRUN EN FAMILLE DIANT", "AMICE", "ROBERT",
				"MARSHALL" };
		
		
		String[] identities = Names.toconvert(firstnames, lastnames);


		
		System.out.println(Arrays.toString(identities));
	}
	
	

}
