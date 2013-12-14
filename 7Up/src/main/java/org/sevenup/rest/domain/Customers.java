package org.sevenup.rest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlRootElement(name="customers")
@XmlAccessorType (XmlAccessType.FIELD)
public class Customers{
	@XmlElement(name = "customer")
    protected List<Customer> list;

    public Customers(){}

	public List<Customer> getList() {
		return list;
	}

	public void setList(List<Customer> list) {
		this.list = list;
	}

}
