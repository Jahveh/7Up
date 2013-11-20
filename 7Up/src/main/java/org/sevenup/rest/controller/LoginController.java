package org.sevenup.rest.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class LoginController {
    private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("7Up/login")
    public String login(){
    	System.out.println("seven");
    	System.out.println("seven");
    	return "welcome";
    }
}
