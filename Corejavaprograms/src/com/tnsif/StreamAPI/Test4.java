package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	List<Integer> n = Arrays.asList(12,34,65,7,56,34,2,90,76,6,6,12,12,75,45,54,45);
	long count = n .stream().distinct().count();
	System.out.println("Unique values: " + count);
}
}
