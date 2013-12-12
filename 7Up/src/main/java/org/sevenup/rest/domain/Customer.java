package org.sevenup.rest.domain;

import java.io.Serializable;
import org.springframework.hateoas.ResourceSupport;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer extends ResourceSupport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2842556684073870772L;
	private String name;
	private int age;
	private String looks;
	public String getLooks() {
		return looks;
	}
	public void setLooks(String looks) {
		this.looks = looks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
