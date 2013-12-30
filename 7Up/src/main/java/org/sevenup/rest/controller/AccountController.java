package org.sevenup.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.rest.domain.Account;
import org.sevenup.rest.domain.Accounts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 
 * @author steven
 * 
 */
@Controller
@Produces(MediaType.APPLICATION_JSON)
public class AccountController {

	@RequestMapping(value="login",method=RequestMethod.POST)
	public ResponseEntity<Accounts> login() {
		List<Account> accounts = new ArrayList<Account>();
		for(int i =0;i<5;i++){
			Account account = new Account();
			account.setEmail("nonumber1989@gmail.com");
			account.setPassword("nonumber1989");	
			accounts.add(account);
		}
		Accounts myAccounts = new Accounts();
		myAccounts.setAccounts(accounts);
	    return new ResponseEntity<Accounts>(myAccounts, HttpStatus.OK);
	}
	
	@RequestMapping(value="seven",method=RequestMethod.POST)
	public ResponseEntity<Account> seven() {
		Account account = new Account();
		account.setEmail("nonumber1989@gmail.com");
		account.setPassword("nonumber1989");
	    return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
}
