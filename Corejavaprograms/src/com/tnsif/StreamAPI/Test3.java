package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	List<Integer> no = Arrays.asList(10,39,20,21,78,54,34,1,19);
	no.stream().sorted().forEach(number->{System.out.println(number);});
	
}
}
