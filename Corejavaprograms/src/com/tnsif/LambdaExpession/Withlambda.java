package com.tnsif.LambdaExpession;

@FunctionalInterface
interface Draw{
	public void draw();
}
public class Withlambda {
public static void main(String[] args) {
	int width=20;
	Draw d2=() ->{System.out.println("Draw:"+width);
};
d2.draw();
}
}