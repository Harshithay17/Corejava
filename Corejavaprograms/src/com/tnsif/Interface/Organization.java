package com.tnsif.Interface;

interface TechnicalRole{
	void designArchitecture();
	
}
interface ManagementRole{
	void ManageTeam();
}
class ProjectManager implements TechnicalRole,ManagementRole{
	private String name;
	private String Projectname;
	private int teamsize;
	private double projectbudget;
	
	



public ProjectManager(String name, String projectname, int teamsize, double projectbudget) {
		super();
		this.name = name;
		Projectname = projectname;
		this.teamsize = teamsize;
		this.projectbudget = projectbudget;
	}




@Override
public void ManageTeam() {
	// TODO Auto-generated method stub
	System.out.println("Managing a team " +teamsize+"Developers");
	
}

@Override
public void designArchitecture() {
	// TODO Auto-generated method stub
	System.out.println(name+" is architecture for "+Projectname);
	
}
void checkBudget() {
	if(projectbudget>1000000) {
		System.out.println("High budget project");
	}
	else {
		System.out.println("Standard budget project");
	}
}
void displayProjectdetails() {
	System.out.println("project details");
	System.out.println("Manager "+ name);
	System.out.println("Project:"+ Projectname);
	System.out.println("Team "+ teamsize);
System.out.println("Budget:"+ projectbudget);
}
}


public class Organization {
public static void main(String[] args) {
	ProjectManager m = new ProjectManager("Anil","E-Commerce Platform",8,250000);
			m.designArchitecture();
	m.ManageTeam();
	m.checkBudget();
	m.displayProjectdetails();
	
	
}

}
