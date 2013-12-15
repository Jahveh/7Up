package org.sevenup.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.rest.domain.Customer;
import org.sevenup.rest.domain.Customers;
import org.sevenup.rest.domain.JaxbList;
import org.sevenup.rest.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * 
 * @author steven
 *
 */
@Controller
@Produces(MediaType.APPLICATION_JSON)
public class LoginController {
    private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("7Up/login")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Customer> login(){
    	List<Customer> results = new ArrayList<Customer>();
    	for(int i=0;i<5;i++){
    		Customer customer= new Customer();
    		customer.setAge(i+20);
    		customer.setLooks("seven"+i);
    		customer.setName("number"+i);
    		results.add(customer);
    	}
    	return results;
    }
    @RequestMapping("7Up/loginseven")
    public ResponseEntity<Customers> viewOrder() {
    	List<Customer> results = new ArrayList<Customer>();
    	for(int i=0;i<5;i++){
    		Customer customer= new Customer();
    		customer.setAge(i+20);
    		customer.setLooks("seven"+i);
    		customer.setName("number"+i);
    		results.add(customer);
    	}
    	Customers suCustomers = new Customers();
    	suCustomers.setList(results);
        return new ResponseEntity<Customers>(suCustomers, HttpStatus.OK);
    }
    @RequestMapping("7Up/loginnumber")
    public ResponseEntity<Customer> viewOrders() {
    	List<ResponseEntity<Customer>> list = new ArrayList<ResponseEntity<Customer>>();
    	for(int i=0;i<5;i++){
    		Customer customer= new Customer();
    		customer.setAge(i+20);
    		customer.setLooks("seven"+i);
    		customer.setName("number"+i);
    		list.add(new ResponseEntity<Customer>(customer, HttpStatus.OK));
    	}
        return list.get(0);
    }
    
}
