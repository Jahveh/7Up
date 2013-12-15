package org.sevenup.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.rest.domain.Account;
import org.sevenup.rest.domain.Customers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * 
 * @author steven
 * 
 */
@Controller
@Produces(MediaType.APPLICATION_JSON)
public class LoginController {
	private static Logger LOG = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Account> login(@RequestBody Account account,UriComponentsBuilder builder) {

		OrderCreatedEvent orderCreated = orderService.createOrder(new CreateOrderEvent(order.toOrderDetails()));

		Order newOrder = Order.fromOrderDetails(orderCreated.getDetails());

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/aggregators/orders/{id}")
				.buildAndExpand(orderCreated.getNewOrderKey().toString())
				.toUri());

		return new ResponseEntity<Account>(newOrder, headers, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<Account> logout(@PathVariable String id) {

		OrderDeletedEvent orderDeleted = orderService.deleteOrder(new DeleteOrderEvent(UUID.fromString(id)));

		if (!orderDeleted.isEntityFound()) {
			return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}

		Order order = Order.fromOrderDetails(orderDeleted.getDetails());

		if (orderDeleted.isDeletionCompleted()) {
			return new ResponseEntity<Order>(order, HttpStatus.OK);
		}

		return new ResponseEntity<Account>(order, HttpStatus.FORBIDDEN);
	}
}
