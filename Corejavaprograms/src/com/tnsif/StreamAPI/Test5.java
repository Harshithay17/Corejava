package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test5 {
public static void main(String[] args) {
	List<Integer> no = Arrays.asList(5,23,15,12,20,34,30,56,55,10,39);
	no.stream().filter(n->n%5==0).forEach(System.out::println);
}
}
