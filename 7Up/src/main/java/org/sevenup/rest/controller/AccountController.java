package org.sevenup.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.core.events.account.AccountReadEvent;
import org.sevenup.core.events.account.RequestAccountEvent;
import org.sevenup.core.service.general.AccountEventHandler;
import org.sevenup.core.service.general.AccountService;
import org.sevenup.rest.domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
	private static Logger LOG = LoggerFactory.getLogger(AccountController.class);

	private AccountService accountService = new AccountEventHandler();
	
	@RequestMapping("7Up/login2")
	public ResponseEntity<Account> login2(@RequestBody Account account) {
        RequestAccountEvent requestAccountEvent = new RequestAccountEvent(account);
		AccountReadEvent readEvent = accountService.requestAccount(requestAccountEvent);
		if(readEvent.isCorrect()){
	        return new ResponseEntity<Account>(HttpStatus.OK);
		}else {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping("7Up/login3")
	public ResponseEntity<Account> login3() {
		Account account = new Account();
		account.setEmail("nonumber1989@gmail.com");
		account.setPassword("nonumber1989");
        RequestAccountEvent requestAccountEvent = new RequestAccountEvent(account);
		AccountReadEvent readEvent = accountService.requestAccount(requestAccountEvent);
		if(readEvent.isCorrect()){
	        return new ResponseEntity<Account>(HttpStatus.OK);
		}else {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping("7Up/login")
	public void login() {
		Account account = new Account();
		account.setEmail("nonumber1989@gmail.com");
		account.setPassword("nonumber1989");
        RequestAccountEvent requestAccountEvent = new RequestAccountEvent(account);
		AccountReadEvent readEvent = accountService.requestAccount(requestAccountEvent);
	}
}
