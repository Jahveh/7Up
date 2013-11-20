package org.sevenup.core.domain.user;

/**
 * 
 * @author steven
 * 
 */
public class Customer extends User {
	private int age;
//	private boolean sex;
	private String profession;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
