package com.tnsif.LambdaExpession;

@FunctionalInterface
interface Demo{
	String say(String message);
	
}
public class MultipleStatement {
public static void main(String[] args) {
	Demo s=(message)->{String str1 = "I would like to say,";
	String str2=str1+message;
	return str2;
	};
	System.out.println(s.say("time is precious..."));
	}
}
