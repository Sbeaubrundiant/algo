package com.socgen.algotest;

public class Names {

	public static String[] toconvert(String [] firstnames, String[] lastnames)	{
		
		int j = firstnames.length;
		String[] identities = new String[j];

		for (int i = 0; i < identities.length; i++) {

			identities[i] = firstnames[i] + " " + lastnames[i];
			
		}
		
		return  identities;
	}
	

}