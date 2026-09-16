package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

//map()+toList()
public class Test2 {
public static void main(String[] args) {
	List<String> names= Arrays.asList("harshitha","gagana","shashank","kavana");
	List<String> uppernames = names.stream().map(name->name.toUpperCase()).toList();
	System.out.println("All converted"+uppernames);
}

}
