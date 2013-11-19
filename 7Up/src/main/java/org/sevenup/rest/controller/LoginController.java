package org.sevenup.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author steven
 *
 */
@Controller
public class LoginController {
    private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("7Up/login")
    public void seven(){
    	System.out.println("seven");
    	System.out.println("seven");
    }
}
