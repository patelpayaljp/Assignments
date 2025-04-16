package com.crm.creatio.language;

public class ArrayConcepts {

	public static void main(String[] args) {
		String[] empNames = new String[3];
		empNames[0] = "Bharath";
		empNames[1] = "Payal";
		empNames[2] = "Anu";

		System.out.println(empNames.length);
		System.out.println(empNames[0]);
		System.out.println(empNames[1]);
		System.out.println(empNames[2]);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		String[][] Project = new String[2][3];

		Project[0][0] = "payal 1";
		Project[0][1] = "Bharath";
		Project[0][2] = "Anu";

		Project[1][0] = "payal 2";
		Project[1][1] = "Bharath 2";
		Project[1][2] = "Anu 2";
		
		System.out.println(Project[0][0]);
	}

}
