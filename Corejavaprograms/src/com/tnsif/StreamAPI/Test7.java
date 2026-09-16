package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test7 {
public static void main(String[] args) {
	List<Integer> t= Arrays.asList(30000,25000,5000,23000,78000,10000,250000,900000);
	boolean r = t.stream().filter(salary-> salary>5000).anyMatch(salary->salary>30000);
	System.out.println("salary found: " +r);
}
}
 