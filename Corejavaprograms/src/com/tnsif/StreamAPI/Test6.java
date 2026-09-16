package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test6 {
public static void main(String[] args) {
	List<String> p1 = Arrays.asList("apple","banana","papaya","orange");
	Optional<String> r = p1.stream().skip(2).findFirst();
	System.out.println(r.orElse("Product not found"));
}
}
