package com.tnsif.Abstractionprogram;

abstract class Embroidinary{
	abstract void message(String message);
}

class HoopEmbroidinary extends Embroidinary{

	@Override
	void message(String message) {
		// TODO Auto-generated method stub
		String purpose ="Wedding" ;
		System.out.println(message);
		System.out.println(" the purpose is "+ purpose);
		
		
	}
	
	
	
	
	
}
public class Arts {
public static void main(String[] args) {
	HoopEmbroidinary h = new HoopEmbroidinary();
	h.message("what is the purpose");
}

}
