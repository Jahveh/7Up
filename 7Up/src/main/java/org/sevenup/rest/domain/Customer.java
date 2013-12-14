package org.sevenup.rest.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name="customer")
@XmlAccessorType (XmlAccessType.FIELD)
public class Customer extends ResourceSupport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2842556684073870772L;
	private String name;
	private int age;
	private String looks;
	private List<String> list ;
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
}
