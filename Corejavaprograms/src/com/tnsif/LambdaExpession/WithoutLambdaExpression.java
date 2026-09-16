package com.tnsif.LambdaExpession;
interface Drawable{
	public default void draw () {
		
	}
class Test implements Drawable{
	int width=20;
	@Override
	public void draw() {
		System.out.println("Drawin: "+width);
		
}
}

public class WithoutLambdaExpression {
public static void main(String[] args) {
	Drawable d=new Test();
	d.draw();
}
}
}