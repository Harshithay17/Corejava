package com.tnsif.CollectionFramework;


import java.util.HashSet;

public class Hashset {
public static void main(String[] args) {
	HashSet<String> Javateam = new HashSet<>();
	
	Javateam.add("Java");
	Javateam.add("SQL");
	Javateam.add("GIT");
	Javateam.add("Spring");
	Javateam.add("Docker");
	System.out.println(" JavaTeam Skill's : " +Javateam);
	
	HashSet<String> Pythonteam = new HashSet<>();
	Pythonteam.add("Python");
	Pythonteam.add("SQL");
	Pythonteam.add("GIT");
	Pythonteam.add("Machine Leraning");
	Pythonteam.add("Data Analysis");
	Pythonteam.add("Docker");
	System.out.println("PythonTeam skills's: " +Pythonteam);
	
	//create a copy of javateam's skill
	HashSet<String> common = (HashSet<String>) Javateam.clone();
	System.out.println(common);
	
	//keep only skill available in both team
	common.retainAll(Pythonteam);
	System.out.println("Common Skills : "+common);
	
	//create a another copy of javateam skill
	HashSet<String> onlyjava = (HashSet<String>) Javateam.clone();
	System.out.println(onlyjava);
	
}

}
