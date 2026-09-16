package com.tnsif.StreamAPI;


import java.util.Arrays;
import java.util.List;



//Filter method
public class Test1 {
public static void main(String[] args) {
	List<Integer> no = Arrays.asList(10,13, 15,20,30,36,45);// to add all the value in once we can use aslist()method
	no.stream().filter(n->n%2==0).forEach(System.out::println);
}

}
