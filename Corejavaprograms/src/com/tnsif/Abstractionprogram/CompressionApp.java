package com.tnsif.Abstractionprogram;
abstract class Filecompresor{
	abstract void compress(String fileanme);
	void showdetailed() {
		System.out.println("Compression strated....");
		
	}
}

class ZipCompressor extends Filecompresor{

	@Override
	void compress(String fileanme) {
		// TODO Auto-generated method stub
		System.out.println("Compress using Zip...");
		
		int originalsize=100;
		int compressedsize=originalsize*60/100;
		System.out.println("original size:"+ originalsize+"MB");
		System.out.println("compress size:"+ compressedsize+"MB");
		
		
	}
	
	
}

class Gzipcompressor extends Filecompresor{

	@Override
	void compress(String fileanme) {
		// TODO Auto-generated method stub
        System.out.println("Compress using Zip...");
		
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original size:"+ originalsize+"MB");
		System.out.println("compress size:"+ compressedsize+"MB");
		
	}
	
}
public class CompressionApp {
public static void main(String[] args) {
	ZipCompressor z = new ZipCompressor();
	z.compress("project.zip");
	System.out.println();
	
	Gzipcompressor g = new Gzipcompressor();
	g.compress("project.zip");
}

}
