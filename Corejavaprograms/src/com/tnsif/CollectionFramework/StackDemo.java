package com.tnsif.CollectionFramework;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<String> s = new Stack<>();
	
	s.push("youtube");
	s.push("Instagarm");
	s.push("whatsapp");
	s.push("Snapchat");
	s.push("Phone");
	s.push("Email");
	
	System.out.println(s);
	
	s.push("ChatGPT");
	s.pop();
	
	System.out.println(s);
	
	s.peek();
	System.out.println(s);
	
	for(String d:s) {
		System.out.println(d);
	}
	
}

}
 