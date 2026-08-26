package com.tnsif.Statickeyword;


public class Staticmethod {
static int calculateBonus(int Salary) {
	return Salary*10/100;
	
}
public static void main(String[] args) {
	int bonus = Staticmethod.calculateBonus(30000);
	System.out.println("Bonus "+bonus);
}
}

